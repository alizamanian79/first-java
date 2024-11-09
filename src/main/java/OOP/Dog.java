package OOP;

public class Dog {
    private String name;
    private int age;

    public void setName(String value){
        name = value;
    };
    public void setAge(int value){
        age = value;
    };

    public void bark(){
        System.out.println(this.name + "say : woof wooof");
    }


    public static void main(String[] args) {
        Dog d1=new Dog();
        d1.setName("Odi");
        d1.setAge(2);
        d1.bark();
    }

}
