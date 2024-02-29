public class Calculator {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        int resultSum = add(5, 3);
        int resultMinus = subtract(8, 2);
        int resultMul = multiply(4, 6);

        System.out.println("Sum: " + resultSum);
        System.out.println("Minus: " + resultMinus);
        System.out.println("Multiplication: " + resultMul);
    }
}