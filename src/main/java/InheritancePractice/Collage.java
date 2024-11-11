package InheritancePractice;

import java.io.PrintStream;

/** Class Wroten with
 * Super
 * this
 * Constructor
 * Annotation (@Override)
 * */
public class Collage {
    public static void main(String[] args) {
    Person p1 = new Person("ali","zamanian",554548);
    Student s1 = new Student("ali","zamanian",554548,5258);

   p1.show();
//    s1.show();

    }
}


class Person {
    protected String name,lastName;
    protected long nationID;


    public Person(String name, String lastName, long nationID) {
        this.name = name;
        this.lastName = lastName;
        this.nationID = nationID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getNationID() {
        return nationID;
    }

    public void setNationID(long nationID) {
        this.nationID = nationID;
    }

    public void show (){
        PrintStream format = System.out.format(getName() +"\t"+ getLastName() + "\t" + getNationID()+"\t");
    }

}

class Student extends Person{
    private long courseID;
    public Student(String name, String lastName, long nationID,long courseID) {
        super(name, lastName, nationID);
        this.courseID=courseID;

    }

    public long getCourseID() {
        return courseID;
    }

    public void setCourseID(long courseID) {
        this.courseID = courseID;
    }

    @Override
    public void show(){
        super.show();
        System.out.println(courseID);
    }
}