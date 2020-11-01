package Lab2_1;

import java.util.ArrayList;

public class MoveList {
    private ArrayList<String> moveList = new ArrayList<>();

    public void addMovieItem(String item) {
        moveList.add(item);
    }

    public void printMovieList() {
        System.out.println("You have " + moveList.size() + "items in your Movie List");
        for (int i = 0; i < moveList.size(); i++) {
            System.out.println((i + 1) + "." + moveList.get(i));

        }
    }

    public void modifyMovieItem(int position, String newItem) {
        moveList.set(position, newItem);
        System.out.println("Move item " + (position + 1) + "has been modified");
    }

    public void removeMovieItem(int position) {
        String theItem = moveList.get(position);
        moveList.remove(position);
        System.out.println("Remove item " + theItem);
    }

    public String findItem(String searchItem) {
        boolean exits = moveList.contains(searchItem);
        int position = moveList.indexOf(searchItem);
        if (position >= 0) {
            return moveList.get(position);
        }
        return null;
    }

    public static void main(String[] args) {
        MoveList list = new MoveList();
        list.addMovieItem("Mat Biec");
        list.addMovieItem("Vi Dang Tinh Yeu");
        list.addMovieItem("Chi tro li cua anh");
        list.addMovieItem("Hai phuong");
        /////Search
        list.printMovieList();
        String search = list.findItem("Mat Biec");
        System.out.println(search);

        list.modifyMovieItem(1, "mat den");
    }
}
