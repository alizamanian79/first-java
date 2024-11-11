package InheritancePractice.AdvanceCollage;
public class Collage {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("************\t Person Instanciation \t**********************");
        Person p1 = new Person("Ali","09917403979");
        p1.authorization();



        System.out.println("************\t Student Instanciation \t**********************");
        Student s1 = new Student("Ali","09917403979",50.50,1450);
        s1.authorization();


        System.out.println("************\t GraduateStudent Instanciation \t**********************");
        GraduateStudent gs = new GraduateStudent("Ali","09917403979",20.00,1450,"Math Course","wiliam");
        gs.authorization();


        System.gc();
        Thread.sleep(1000);

    }

}
