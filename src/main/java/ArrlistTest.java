
import java.util.ArrayList;

public class ArrlistTest {

    public static void main(String[] args) {
        ArrayList student = new ArrayList();
        String f = "{"+"\"value\""+":"+3+"},";
        student.add(f);
        student.remove(f);

        System.out.println(student);
    }
}
