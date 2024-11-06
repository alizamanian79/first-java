package org.example;

public class ArrMethod {
    static void SendArr(int[] arr){
        if (arr.length==0){
            return;
        }
            System.out.println(arr[1]);
    }
    public static void main(String[] args) {
        int[] number={1,2,3,4,5};
        SendArr(number);
    }
}
