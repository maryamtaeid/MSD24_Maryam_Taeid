package at.fhj.msd;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Test operations
        double sum = calculator.add(5, 3);
        double difference = calculator.minus(10, 4);
        double product = calculator.multiply(6, 7);
        double quotient = calculator.divide(20, 5);

        // Print results
        System.out.println("Addition: " + sum);
        System.out.println("Subtraction: " + difference);
        System.out.println("Multiplication: " + product);
        System.out.println("Division: " + quotient);

        // Test division by zero
        try {
            calculator.divide(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
