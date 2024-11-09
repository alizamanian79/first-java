package OOP.Library;

public class Student {

    private String name, lastName;
    private int age, id;

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static void main(String[] args) {
        Student[] list = new Student[10];
        for (int i = 0; i < 10; i++) {
            list[i] = new Student(); // Initialize the Student object
            list[i].setId(i + 1000);
        }
        System.out.println(list[2].getId());
    }
}