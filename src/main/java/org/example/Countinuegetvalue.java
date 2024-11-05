package org.example;

import java.util.Scanner;

public class Countinuegetvalue {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int clientNumber = scanner.nextInt();
        System.out.println("Continue Untill you press 0 ");

        while (true) {
            clientNumber = scanner.nextInt();
            if (clientNumber == 0){
                break;
            }
            System.out.println("Continue Untill you press 0 ");

        }


        scanner.close();

    }
}
