public class EscapeRout {
    public static void main(String[] args) {
        // \u0022 is the Unicode escape for double quote (")
        // System.out.println("a\u0022.lenght() + \u0022b".length());
        // Java provides no special treatment for Unicode escapes within string literals

        System.out.println("a".length() + "b".length());
        System.out.println("a\".lenght() + \"b".length());

        // prefer escape sequences to Unicode escapes in string and character literals.
        // do not use Unicode escapes to represent ASCII characters.
    }
}
