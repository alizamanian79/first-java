package Abstract;

public class AbstractEx {
    public static void main(String[] args) {
        Animal dog = new Dog("Dog");
        dog.getAnimalName();
        dog.sound();
        dog.move();
        System.out.println("**************");
        Animal cat = new Cat("Cat");
        cat.getAnimalName();
        cat.sound();
        cat.move();

        System.out.println("**************");
        Animal fish = new Fish("Fish");
        fish.getAnimalName();
        fish.sound();
        fish.move();
    }
}



abstract class Animal {


    private String animalName;

    public Animal(String animalName) {
        this.animalName = animalName;
    }

    public String getAnimalName() {
        System.out.println(this.animalName);
        return animalName;
    }

    public abstract void sound();
    public abstract void move();
}

class Dog extends Animal {
    public Dog(String animalName) {
        super(animalName);
    }

    public void sound() {
        System.out.println("Bark");
    }
    public void move(){
        System.out.println("Run");
    }
}


class Cat extends Animal{
    public Cat(String animalName) {
        super(animalName);
    }

    public void sound(){
        System.out.println("Meow");
    }
    public void move(){
        System.out.println("Run");
    }
}

class Fish extends Animal{
    public Fish(String animalName) {
        super(animalName);
    }

    public void sound(){
        System.out.println("no sound");
    }
    public void move(){
        System.out.println("Swimming");
    }
}