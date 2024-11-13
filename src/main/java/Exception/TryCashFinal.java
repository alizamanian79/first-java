package Exception;

public class TryCashFinal {


    public static void main(String[] args) {
        boolean status = false;
        int[] numbers = {60, 40, 50};
        try {
            System.out.println(numbers[1]);

        } catch (Exception e) {
            status = true;
            System.out.println("All index are : " + numbers.length);
        } finally {

            if (status == false) {
                System.out.println("Everything worked currectly");
                return;
            }
            System.out.println("Somthing went Wrong");
        }


    }


}
