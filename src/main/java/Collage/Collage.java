package Collage;
import java.util.List;

import OOP.Library.Student;

import java.util.ArrayList;
import java.util.Arrays;

public class Collage {

    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        people.add(new Person(1,"Ali","Zamanian","88de"));

        System.out.println(people);

        System.out.println("******** \t ******** \t ********");

    Teacher t1 = new Teacher(25,"Mohsen","izadi","8d8e",56559,"Java Teacher");
        t1.introduce();
    }
}
