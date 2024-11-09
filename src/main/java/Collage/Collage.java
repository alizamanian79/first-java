package Collage;

import OOP.Library.Student;

public class Collage {
    public static void main(String[] args) {
        Person s1=new Person();
        s1.setPerson_id(1);
        s1.setName("Ali");
        s1.setLastName("Zamanian");
        s1.setCode("dse58");
        s1.introduce();

        System.out.println("******** \t ******** \t ********");

        Teacher t1=new Teacher();
        t1.setPerson_id(2);
        t1.setName("Ali");
        t1.setLastName("Zamanian");
        t1.setCode("dse58");
        t1.introduce();
    }
}
