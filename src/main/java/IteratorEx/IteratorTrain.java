package IteratorEx;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTrain {

//    public void removelist(String){
//
//    }
    public static void main(String[] args) {
        List list = new ArrayList();
        Iterator<String> iterator= list.iterator();
        list.add("Ali");
        list.add("Mahdi");
        list.add("Ali");
        list.add("Ali");

        while (iterator.hasNext()){
        String string = iterator.next();
        if (string.startsWith("Mahdi")){
            iterator.remove();
        }
        }

    }
}
