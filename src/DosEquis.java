public class DosEquis {
    public static void main(String[] args) {
        char x = 'X';
        int i = 0;
        System.out.print(true ? x : 0); // PrintStream.print(char)
        System.out.print(false ? i : 0); // PrintStream.print(int)
    }
}

// Mixed-type computations can be confusing. Nowhere is this more apparent than in conditional expressions.
// Best to use the same type for the second and third operands in conditional expressions.