package org.example;

import java.util.Scanner;

public class Countinuegetvalue {
   public static void main(String[] args){


       Scanner scanner= new Scanner(System.in);
       int clientNumber = scanner.nextInt();

       while (true) {
           System.out.println("Continue Untill you press 0 ");
           clientNumber = scanner.nextInt();
           if (clientNumber==0)
               break;
           scanner.close();
       }



   }
}
