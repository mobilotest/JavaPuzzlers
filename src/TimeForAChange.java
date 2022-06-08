import org.w3c.dom.ls.LSOutput;

import java.math.BigDecimal;

public class TimeForAChange {
    public static void main(String[] args) {
        System.out.println(2.00 - 1.10); // wrong solution
        System.out.println(String.format("%.2f%n", 2.00 - 1.10)); // poor solution
        System.out.println(new BigDecimal("2.00").subtract(new BigDecimal("1.10"))); // better approach
    }
}
