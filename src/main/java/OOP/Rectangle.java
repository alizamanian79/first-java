package OOP;

public class Rectangle {
    private int width,hight;

    public void getWidth (int value){
    width=value;
    }
    public void getHight (int value){
    hight=value;
    }

    public int calculateArea(){
        return  width*hight;
    }

}
