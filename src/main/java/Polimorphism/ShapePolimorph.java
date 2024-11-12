package Polimorphism;

public class ShapePolimorph {
    public static void main(String[] args) throws InterruptedException {
        //**  Rectangle  */
        Shape shape1 = new Rectangle(5, 10);
        shape1.result();

        //**  Squar  */
        Shape shap2 = new Squar(5);
        shap2.result();

        System.gc();
        Thread.sleep(1000);

    }
}

