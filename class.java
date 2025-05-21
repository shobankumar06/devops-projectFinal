// File: Calculator.java
public class Calculator {
    public int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("3 x 4 = " + calc.multiply(3, 4));
    }
}
