package org.example;

public class Forlables {

    public static void main(String[] args){
       outer : for (int i = 1 ; i <10 ; i++){
           inner:  for (int j=0;j<i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
