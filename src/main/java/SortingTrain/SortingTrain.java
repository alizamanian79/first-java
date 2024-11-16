package SortingTrain;

import java.util.ArrayList;

public class SortingTrain {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        int[] listman = {1, 2, 5, 10, 6, 3};


        for (int i : listman) {
            list.add(i);
        }


        list.sort((a, b) -> a.compareTo(b));

        System.out.println("Sorted list in descending order: " + list);
    }
}
