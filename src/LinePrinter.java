public class LinePrinter {
    public static void main(String[] args) {
        // Note: \ u000A is unicode representation of linefeed (LF)
        char c = 0x00A;
        System.out.println(c);
    }
}

// here is what the program looks like after the Unicode escape has translated into the character it reprseents:

/*

public class LinePrinter1{
    public static void main(String[] args) {
        // Note:
// is unicode representation of linefeed (LF)
        char c = 0x00A;
        System.out.println(c);
    }
}

// The easiest way to fix

public class LinePrinter2{
    public static void main(String[] args) {
        char c = '\n';
        System.out.println(c);
    }
}
// but it's still a questionable program. It is platform dependent
// Better to invoke println twice, or you can use printf with the format string "%n%n"

// Avoid Unicode escapes except where they are truly necessary


*/