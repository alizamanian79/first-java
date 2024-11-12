package InterfaceEx;

public class Index {
    public static void main(String[] args) {

    }
}



 interface Shape {
    public void  getArea();
    public void  getPerimeter();
}

class Squar implements Shape{
    @Override
    public void getArea() {
        // Implementation of getArea
        System.out.println("Calculating area of square.");
    }

    @Override
    public void getPerimeter() {
        // Implementation of getPerimeter
        System.out.println("Calculating perimeter of square.");
    }
}


class Circle implements Shape{
    @Override
    public void getArea() {

    }

    @Override
    public void getPerimeter() {

    }
}