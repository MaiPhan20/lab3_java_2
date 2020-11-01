package Lab2_2;

import javax.accessibility.AccessibleContext;
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ok extends JFrame {
        public ok(){
            JLabel Label = new JLabel("abc xyz!",SwingConstants.CENTER);
            Label.setForeground(Color.red);
            this.setSize(400,400);
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
            AccessibleContext accessibleContext1 = this.accessibleContext;
            this.setLocationRelativeTo(null);
            this.add(Label);
        }
        public static void main(String[] args) {
            new ok ().setVisible(true);
        }
    }

