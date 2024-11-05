package org.example;

public class Fibonacci {




    public static void main (String[] args){
        int firstNumber=0;
        int seccondNumber=1;

        while(true){
            int calculate=firstNumber+seccondNumber;
            if (calculate>=100){
                break;
            }
            System.out.println(calculate);
            firstNumber=seccondNumber;
            seccondNumber=calculate;
        }

    }


}
