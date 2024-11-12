package Abstract;

public class AbstractEx {
    public static void main(String[] args) {
        Animal dog = new Dog();
        System.out.println(dog.getClass().getSimpleName());
        dog.sound();
        dog.move();
        System.out.println("**************");
        Animal cat = new Cat();
        System.out.println(cat.getClass().getSimpleName());
        cat.sound();
        cat.move();
        String s = cat.getClass().getSimpleName();
        System.out.println(s);

        System.out.println("**************");
        Animal fish = new Fish();
        System.out.println(fish.getClass().getSimpleName());
        fish.sound();
        fish.move();
    }
}



abstract class Animal {


    public abstract void sound();
    public abstract void move();
}

class Dog extends Animal {


    public void sound() {
        System.out.println("Bark");
    }
    public void move(){
        System.out.println("Run");
    }
}


class Cat extends Animal{


    public void sound(){
        System.out.println("Meow");
    }
    public void move(){
        System.out.println("Run");
    }
}

class Fish extends Animal{

    public void sound(){
        System.out.println("no sound");
    }
    public void move(){
        System.out.println("Swimming");
    }
}