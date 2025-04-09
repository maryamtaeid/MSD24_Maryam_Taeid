package at.fhj.msd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        {
            System.out.println("Maryam Taeid");
        }

        logger.info("Programm gestartet");

        Calculator calculator = new Calculator();

        // Test operations
        double sum = calculator.add(5, 3);
        double difference = calculator.minus(10, 4);
        double product = calculator.multiply(6, 7);
        double quotient = calculator.divide(20, 5);

        logger.info("Berechnungen wurden durchgeführt");

        // Print results
        System.out.println("Addition: " + sum);
        System.out.println("Subtraction: " + difference);
        System.out.println("Multiplication: " + product);
        System.out.println("Division: " + quotient);

        // Test division by zero
        try {
            calculator.divide(10, 0);
        } catch (ArithmeticException e) {
            logger.error("Fehler bei Division durch 0: " + e.getMessage());
            System.out.println("Error: " + e.getMessage());
        }
    }
}
