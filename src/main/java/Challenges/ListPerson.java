package Challenges;

import java.util.ArrayList;

public class ListPerson {
    public static void main(String[] args) {
        String[] list = {"Ali", "Mahdi", "Sara", "Ali", "Mahdi"};
        ArrayList<String> newList = new ArrayList<>();
        for (String i : list) {
            int counter = 0;

            for (String rep : newList) {
                if (i.equals(rep)) {
                    counter += 1;
                }
            }
            String introduce = i + " : " + (counter + 1);
            System.out.println(introduce);

            newList.add(i);
        }
    }
}