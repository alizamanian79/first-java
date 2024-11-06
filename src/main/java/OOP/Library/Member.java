package OOP.Library;

public class Member {
    private String name;
    private String lastName;
    private String nationalCode;



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

    public String getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }



    public String information (){
        String result = "Name is : " + name + "LastName : " + lastName  + "nationalCode" + nationalCode ;
        System.out.println(result);
        return result ;
    }


}
