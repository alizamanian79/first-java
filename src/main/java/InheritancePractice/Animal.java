package InheritancePractice;

public class Animal {
    private String name;
    protected int age ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Animal p1 = new Animal();
        p1.setName("Odi");
        p1.setAge(5);
        System.out.println(p1.getName()+ p1.getAge());

        Dog d1 = new Dog();
        d1.setName("Fido");
        d1.setAge(2);
        d1.setSpeed(3.25);
        System.out.println(d1.getName()+ d1.getAge()+d1.getSpeed());


    }
}


class Dog extends Animal {
    private double speed;

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }


    public void setAge(int age) {
    if (age < 10) {this.age = age;}
    }



}
