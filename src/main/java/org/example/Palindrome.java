
package org.example;


public class Palindrome {
    public static void main(String[] args) {
        int number = 1122;
        String numberString = Integer.toString(number);
        String reverse = new StringBuilder(numberString).reverse().toString();


        if (reverse.equals(numberString)) {
            System.out.println("number is a palindrome.");
        } else {
            System.out.println("number is not a palindrome.");
        }
    }
}