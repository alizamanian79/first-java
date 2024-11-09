package Collage;

public class Teacher extends Person{
    private long cardNumber;
    private String position;

    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void introduce (){
        System.out.println("id : " + getPerson_id());
        System.out.println("Name : " + getName());
        System.out.println("lastName : " + getLastName());
        System.out.println("Code : " + getCode());
        System.out.println("cardNumber : " + getCardNumber());
        System.out.println("position : " + getPosition());

    }

}
