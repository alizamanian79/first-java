package org.example;

public class Stars {
    public static void main(String[] args) {

        int number = 10;
        for (int i = 1; i <= number; i++) {
            for (int j = i; j < number; j++) {
                System.out.print(" ");
            }
            for (int d = 1; d <= (2 * i - 1); d++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Bottom side

        for (int i = number - 1; i >= 1; i--) {
            for (int j = number; j > i; j--) {
                System.out.print(" ");
            }

            for (int d = 1; d <= (2 * i - 1); d++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}