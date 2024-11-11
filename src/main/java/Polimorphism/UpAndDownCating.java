package Polimorphism;


class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

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

    void move (){
        System.out.println(getName()+"Run");
    }
}
class Cat extends Animal{
    public Cat(String name, int age) {
        super(name, age);
    }
    void move (){
        super.move();
    }
}

public class UpAndDownCating {
    public static void main(String[] args) {
//        Up Casting
        Animal a = new Cat("Aho",4);
        a.move();

//        Down Cating
        Animal dc = new Cat("palang",56);
        Cat cat = (Cat) dc;
        cat.move();

    }
}
