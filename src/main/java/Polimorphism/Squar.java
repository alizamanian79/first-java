package Polimorphism;

public class Squar extends Shape{
    protected int side;


    public Squar(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    float perimeter() {
        /**  Perimeter=side*side */
        float result = (float) (getSide()*getSide());
        return result;
    }

    @Override
    float area() {
        /**  Area=side*side */
        float result = (float) (getSide()*4);
        return result;
    }

    void result() {
        System.out.println("***********  Squar ***********");
        System.out.println("side : \t" + getSide());
        super.result();
    }

}
