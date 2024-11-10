package TestEqualandString;

public class TestString {



    static void checking (int num1,int num2){
       String msg = (num1==num2)?(num1 + "\t is equal \t" + num2 ):("is not equal");
       System.out.println(msg);
    }

    static void checkingString (String num1,String num2){
        String msg = (num1.equals(num2))?(num1 + "\t is equal \t" + num2 ):("is not equal");
        System.out.println(msg);
    }


    public static void main(String[] args) {
        int number1 = 1;
        int number2=1;

        String str1 = "salam";
        String str2 = "saldam";

        checkingString(str1,str2);



    }
}
