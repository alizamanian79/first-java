package org.example;

import java.util.Scanner;

public class ValueErr {
    public static void main (String[] args){


        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        float fl=5;
        number= (int) fl;
    }
}
