package DataColllcetionStructor;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayListStructor {
    public static void main(String[] arg1s) {

         ArrayList students = new ArrayList();
        students.add(new String("Ali"));
        students.add(new String("222"));
        System.out.println(students);



        /** Array list */
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(4);
        System.out.println(numbers);


        /** Set */

        Set <Integer> num =  new HashSet<>();
        num.add(1);
        num.add(2);
        num.add(1);
        num.add(3);
        num.add(5);
        num.add(1);



    }
}
