package Abstract;
import java.util.Arrays;
public class ComponentEx {
    public static void main(String[] args) {
        Component[] component = new Component[2];
        component[0] = new Button(10, 20);
        component[1] = new TextBox(10, 20);

        for (Component comp : component) {
            comp.show();
        }

        System.out.println(Arrays.toString(component));
    }
}

abstract class Component {
    protected double width, height;

    public Component(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    abstract void show();
    public abstract String toString();
}

class TextBox extends Component {
    public TextBox(double width, double height) {
        super(width, height);
    }

    void show() {
        System.out.println("This is a TextBox with length " + getHeight() + " and width " + getWidth());
    }
    @Override
    public String toString() {
        return "{ \"type\": \"TextBox\", \"width\": " + getWidth() + ", \"length\": " + getHeight() + " }";
    }
}

class Button extends Component {
    public Button(double width, double height) {
        super(width, height);
    }

    void show() {
        System.out.println("This is a Button with length " + getHeight() + " and width " + getWidth());
    }
    @Override
    public String toString() {
        return "{ \"type\": \"Button\", \"width\": " + getWidth() + ", \"length\": " + getHeight() + " }";
    }
}
