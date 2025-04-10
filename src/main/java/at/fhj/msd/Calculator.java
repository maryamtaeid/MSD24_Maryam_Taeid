package at.fhj.msd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * The {@code Calculator} class provides basic mathematical operations such as
 * addition, subtraction, multiplication, division, and factorial calculation.
 *
 * <p>This class also uses a logger to trace method calls and handle exceptional cases.</p>
 */
public class Calculator {

    private static final Logger logger = LogManager.getLogger(Calculator.class);

    /**
     * Adds two numbers.
     *
     * @param number1 the first number
     * @param number2 the second number
     * @return the sum of number1 and number2
     */
    public double add(double number1, double number2) {
        logger.debug("add called with number1=" + number1 + ", number2=" + number2);
        return number1 + number2;
    }

    /**
     * Subtracts the second number from the first.
     *
     * @param number1 the number to subtract from
     * @param number2 the number to subtract
     * @return the result of number1 minus number2
     */
    public double minus(double number1, double number2) {
        logger.debug("minus called with number1=" + number1 + ", number2=" + number2);
        return number1 - number2;
    }

    /**
     * Divides the first number by the second.
     *
     * @param number1 the dividend
     * @param number2 the divisor
     * @return the result of number1 divided by number2
     * @throws ArithmeticException if number2 is zero
     */
    public double divide(double number1, double number2) {
        logger.debug("divide called with number1=" + number1 + ", number2=" + number2);
        if (number2 == 0.0) {
            logger.error("Division by zero attempted!");
            throw new ArithmeticException("Division by zero");
        }
        return number1 / number2;
    }

    /**
     * Multiplies two numbers.
     *
     * @param number1 the first number
     * @param number2 the second number
     * @return the product of number1 and number2
     */
    public double multiply(double number1, double number2) {
        logger.debug("multiply called with number1=" + number1 + ", number2=" + number2);
        return number1 * number2;
    }

    /**
     * Calculates the factorial of a number.
     *
     * @param n the number for which the factorial is calculated
     * @return the factorial of n, or 0 if n is negative
     */
    public int factorial(int n) {
        logger.debug("factorial called with n=" + n);
        return (n <= 1) ? (n < 0 ? 0 : 1) : n * factorial(n - 1);
    }
}
