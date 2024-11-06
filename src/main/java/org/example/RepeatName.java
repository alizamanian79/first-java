package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class RepeatName {

    static String PrintName (String name){
        System.out.print(name);
        return name;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your word: ");
        String userInput = scanner.next();

        PrintName(userInput);


    }
}
