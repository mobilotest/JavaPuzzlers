import java.util.ArrayList;
import java.util.List;

public class ItsElementary {
    public static void main(String[] args) {
        System.out.println(12345+5432l); // it is not one it is el
        List<String> l = new ArrayList<>();
        l.add("Foo");
        System.out.println(l); // Bad code - uses el (l) as a variable name
    }
}
