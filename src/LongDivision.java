public class LongDivision {
    public static void main(String[] args) {
        // wrong solution and wrong answer
        final long MICROS_PER_DAY = 24 * 60 * 60 * 1000 * 1000;
        final long MILLIS_PER_DAY = 24 * 60 * 60 * 1000;
        System.out.println(MICROS_PER_DAY / MILLIS_PER_DAY);

        // right solution
        final long MICROS_PER_DAY_NEW = 24L * 60 * 60 * 1000 * 1000;
        final long MILLIS_PER_DAY_NEW = 24L * 60 * 60 * 1000;
        System.out.println(MICROS_PER_DAY_NEW / MILLIS_PER_DAY_NEW);
    }
}
