package MapTrain;

import java.util.HashMap;
import java.util.Map;

public class StudentsClass {
    public static void main(String[] args) {
        Map<String,Double> studentMap = new HashMap<String,Double>();
        studentMap.put("Ali",18.0);
        studentMap.put("Mahdi",16.0);
        studentMap.put("Amit",18.50);

        double sum=0.0;
        for (double i : studentMap.values()){
        sum+=i;
        }
        System.out.println("Students numbers : \t" + studentMap.size());
        System.out.println("Sum is : \t" + sum);

        System.out.println("Avg : \t" + sum / studentMap.size());



    }
}
