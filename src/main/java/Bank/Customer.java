package Bank;

public class Customer {
    private String name;
    private String lastName;
    private String number ;

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

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }


    public void info(){
        System.out.println();
        String user = "\n"+"User: " + this.name+"\n "+ "LastName: "+ this.lastName + " \n Number: " + this.number.toString();

        System.out.println(user);
    }

}
