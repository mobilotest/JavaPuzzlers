public class TheLastLaugh {
    public static void main(String[] args) {
        System.out.print("H"+"a");
        System.out.println('H'+'a');

        StringBuffer sb = new StringBuffer();
        sb.append('H');
        sb.append('a');
        System.out.print(sb); // this works but ugly

        System.out.println(""+'H'+'a'); // A bit better solution

        System.out.println("2 + 2 = "+ 2+2); //everything became a string = 22

        System.out.printf("%c%c", 'H', 'a');

        //The + operator performs string concatination if and only if at least one of its operands is of type String
    }
}
