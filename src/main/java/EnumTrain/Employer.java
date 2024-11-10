package EnumTrain;

import java.nio.channels.Pipe;

public class Employer {


    enum Pos {
        Employer,
        Boss
    }

    private String name,lastName;
    private Pos postion;


    public Employer(String name, String lastName, Pos postion) {
        this.name = name;
        this.lastName = lastName;
        this.postion = postion;
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

    public Pos getPostion() {
        return postion;
    }

    public void setPostion(Pos postion) {
        this.postion = postion;
    }

    public static void main(String[] args) {
      Employer user1= new Employer("Ali","Zamania",Pos.Employer);
      System.out.println(user1.getPostion());


    }

}
