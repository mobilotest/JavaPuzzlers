public class SwapMeat {
    public static void main(String[] args) {
        int x = 1984; // (0x7c0)
        int y = 2001; // (0x7d1)
        x ^= y ^= x ^= y;
        System.out.println("x = " +x +"; y = "+y);
    }
}

// Do not assign to the same variable more than once in a single expression
// Avoid clever programming tricks