package org.example;

import java.util.Scanner;

public class Getinput {
    public static void main (String[] args){

        Scanner scanner=new Scanner(System.in);
        int get= scanner.nextInt();

        System.out.println(get);

        scanner.close();
    }
}
