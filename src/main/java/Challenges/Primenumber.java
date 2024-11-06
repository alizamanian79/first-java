package Challenges;

public class Primenumber {


   static boolean checking (int count,int number){
        if (count == 2) {
//            System.out.println(i + " is prime");
            return true;
        } else {
//            System.out.println(i + " is not prime");
            return false;
        }
    }


    public static void main(String[] args){


        for (int i = 2; i < 20; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            boolean result = checking(count,i);
            String res=(result==true)?"is Prime " : "is not prime";
            System.out.print(i+res);

        }






    }
}
