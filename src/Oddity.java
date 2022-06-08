public class Oddity {
    public static void main(String[] args) {
        System.out.print(isOdd_1nitial(-3)+"  |  ");
        System.out.print(isOdd_solution(-3)+"  |  ");
        System.out.println(isOdd_faster(-3));

        System.out.print(isOdd_1nitial(-2)+"  |  ");
        System.out.print(isOdd_solution(-2)+"  |  ");
        System.out.println(isOdd_faster(-2));

        System.out.print(isOdd_1nitial(-1)+"  |  ");
        System.out.print(isOdd_solution(-1)+"  |  ");
        System.out.println(isOdd_faster(-1));

        System.out.print(isOdd_1nitial(0)+"  |  ");
        System.out.print(isOdd_solution(0)+"  |  ");
        System.out.println(isOdd_faster(0));

        System.out.print(isOdd_1nitial(1)+"  |  ");
        System.out.print(isOdd_solution(1)+"  |  ");
        System.out.println(isOdd_faster(1));

        System.out.print(isOdd_1nitial(2)+"  |  ");
        System.out.print(isOdd_solution(2)+"  |  ");
        System.out.println(isOdd_faster(2));

        System.out.print(isOdd_1nitial(3)+"  |  ");
        System.out.print(isOdd_solution(3)+"  |  ");
        System.out.println(isOdd_faster(3));
    }

    public static boolean isOdd_1nitial(int i) {
        return i % 2 == 1;  // modulus operator == ostatok
    }

    public static boolean isOdd_solution(int i) {
        return (i % 2) != 0;  // in negative ==1 will always fail, so !=0 is the solution
    }

    public static boolean isOdd_faster(int i) {
        return (i & 1) != 0;  // instead of modulus, <any odd> & 000000001 will always give 1
    }

}
