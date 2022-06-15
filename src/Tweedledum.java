public class Tweedledum {
    public static void main(String[] args) {
        int x = 1;
        int i = 1;
        System.out.println(x += i);
        System.out.println(x = x + i);

        // compound assignment expressions automatically cast the result of the computation they perform to the type of the variable on their left-hand side

        short xx = 0;
        int ii = 123456;
        System.out.println(xx+=1); // contains a hidden cast
//        System.out.println(xx = xx + ii); // won't compile = "possible loss of precision"
        // Do not use compound assignment operators on variables of type byte, short or char.
    }
}
