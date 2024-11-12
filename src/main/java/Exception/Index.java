package Exception;

public class Index {


    static void checking(int value){
        if (value<18){
            throw new ArithmeticException("Your is not accepted");
        }else {
            System.out.println("Your Login Successfully ...");
        }
    }


    public static void main(String[] args) {
        checking(100);
    }
}
