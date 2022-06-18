public class Tweedledee {
    public static void main(String[] args) {
        int x = 1;
        int i = 1;
        System.out.println(x = x + i);
        System.out.println(x += i);

        Object xx = "Buy";
        String ii = "Effective Java!";
        System.out.println(xx = xx + ii);
        System.out.println(xx += ii);

    }
}
