package Polimorphism;

class Rectangle extends Shape{
    protected int width,length;

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    float perimeter() {
       /**  Perimeter=2×(length+width) */
        float result = (getLength()+getWidth())*2;
        return result;
    }

    @Override
    float area() {
        /** Area=length×width */
        float result = getLength()*getWidth();
        return result;
    }

    void result() {
        System.out.println("***********  Rectangle ***********");
        System.out.println("width : \t" + getWidth());
        System.out.println("length : \t" + getLength());
        super.result();
    }
}
