package MapTrain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapEx {
    public static void main(String[] args) {
        List mylist = new ArrayList();
        Map <Integer,String> mymp = new HashMap<Integer,String>();
        mymp.put(1,"ali");
        mymp.put(2,"ali");
        mymp.put(3,"ali");

        mylist.add(mymp);

        System.out.println(mymp.get(3));
        System.out.println(mylist);

    }
}
