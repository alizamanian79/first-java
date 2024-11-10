package TestPack;

public class Pride {
    private int color ;
    private int price;
    static int designYear,width,height;


    public Pride(int color, int price) {
        this.color = color;
        this.price = price;
    }
    public int getColor() {
        return color;
    }
    public void setColor(int color) {
        this.color = color;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public static void main(String[] args) {
        Pride.height=200;
        Pride.designYear=50;

    }


}
