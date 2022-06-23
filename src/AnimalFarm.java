public class AnimalFarm {
    public static void main(String[] args) {
        final String pig = "length: 10";
        final String dog = "length: " + pig.length();
        System.out.println("Animals are equal: " + pig == dog);
        // the result will be just 'false'
        // because it is under the hood a boolean expression: System.out.println(("Animals are equal: " + pig) == dog);
        // When using the string concatenation operator, always parenthesize nontrivial operands

        System.out.println("Animals are equal: " + (pig == dog));
        // Arguably, the program is still broken. Your code should rarely, if ever, depend on the interning of string constants.
        // When comparing object references, you should use the equals method in preference to the == operator unless you need to compare object identity rather than value.

        System.out.println("Animals are equal: " + pig.equals(dog));
    }
}
