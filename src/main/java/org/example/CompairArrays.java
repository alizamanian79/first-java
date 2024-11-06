package org.example;

import java.util.Arrays;

public class CompairArrays {

    static String compair(String[] list1, String[] list2) {
        boolean result = Arrays.equals(list1, list2);
        if (result) {
            return "Same list";
        }
        return "Not like it";
    }

    public static void main(String[] args) {
        String[] list1 = {"Ali", "Mahdi", "Mohammad"};
        String[] list2 = {"Ali", "Mahdi", "Mohammad"};
        String result = compair(list1, list2);
        System.out.println(result);
    }
}