package Collage;

public class Person {
    private long person_id;
    private String name,lastName,code;


    public long getPerson_id() {
        return person_id;
    }

    public void setPerson_id(long person_id) {
        this.person_id = person_id;
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void introduce() {
        System.out.println("id : " + getPerson_id());
        System.out.println("Name : " + getName());
        System.out.println("lastName : " + getLastName());
        System.out.println("Code : " + getCode());
    }
}
