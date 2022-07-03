public class HuhQuestionMark {
    public static void main(String[] args) {
    // \ u0070\ u0075\ u0062\ u006c\ u0069\ u0063\ u0020\ u0020\ u0020\ u0020
    // ... similar 10 lines more with unicode escape chars
    }
}

// here is what the program looks like after the Unicode escapes:
/*

public
class Ugly
{public
    static
void main(
String[]
    args0{
System.out
.println(
"Hello w"+
"orld");}}

*/

// and here is how it looks after cleaning up the formatting:
/*
public class Ugly{
    public static void main(String[] args) {
        System.out.println("Hello w"+"orld");
    }
}
*/