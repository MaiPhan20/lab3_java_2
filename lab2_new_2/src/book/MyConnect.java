package book;

import com.mysql.cj.protocol.Resultset;
import javafx.animation.ScaleTransition;

import java.sql.*;

public class MyConnect {
    public static void main(String[] args) {

    try (
    // Step 1: Allocate a database 'Connection' object
    Connection conn = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/ebookshop",
            "root", "");   // For MySQL only

    Statement stmt = conn.createStatement();
                ) {
        String strSelect = "select * from books";
        System.out.println("The SQL statement is: " + strSelect + "\n"); // Echo For debugging

        ResultSet rset = stmt.executeQuery(strSelect);

        System.out.println("The records selected are:");
        int rowCount = 0;
        while(rset.next()) {   // Move the cursor to the next row, return false if no more row
            int id = rset.getInt("id");
            String title = rset.getString("title");
            String author =rset.getString("author");
            double price = rset.getDouble("price");
            int    qty   = rset.getInt("qty");
            System.out.println(id +","+title + ", " +author+","+ price + ", " + qty);
            ++rowCount;
        }
        System.out.println("Total number of records = " + rowCount);

    } catch(SQLException ex) {
        ex.printStackTrace();
    }
}
}
