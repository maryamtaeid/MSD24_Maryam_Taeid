package at.fhj.msd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    private Calculator calc;

    @BeforeEach
    void setup() {
        calc = new Calculator();  
    }

    
    @Test
    @DisplayName("Testing add() with normal values")
    void testAddition() {
        double result = calc.add(2, 3);
        assertEquals(5, result, "Addition of 2 and 3 should be 5");
    }

    @Test
    @DisplayName("Testing add() with zero")
    void testAddWithZero() {
        double result = calc.add(0, 0);
        assertEquals(0, result, "Addition of 0 and 0 should be 0");
    }

    @Test
    @DisplayName("Testing add() with negative numbers")
    void testAddWithNegative() {
        double result = calc.add(-2, 3);
        assertEquals(1, result, "Addition of -2 and 3 should be 1");
    }

    
    @Test
    @DisplayName("Testing minus() with normal values")
    void testSubtraction() {
        double result = calc.minus(5, 3);
        assertEquals(2, result, "Subtraction of 5 and 3 should be 2");
    }

    @Test
    @DisplayName("Testing minus() with zero")
    void testMinusWithZero() {
        double result = calc.minus(0, 0);
        assertEquals(0, result, "Subtraction of 0 and 0 should be 0");
    }

    @Test
    @DisplayName("Testing minus() with negative numbers")
    void testMinusWithNegative() {
        double result = calc.minus(-5, -3);
        assertEquals(-2, result, "Subtraction of -5 and -3 should be -2");
    }

    
    @Test
    @DisplayName("Testing multiply() with normal values")
    void testMultiplication() {
        double result = calc.multiply(4, 3);
        assertEquals(12, result, "Multiplication of 4 and 3 should be 12");
    }

    @Test
    @DisplayName("Testing multiply() with zero")
    void testMultiplyWithZero() {
        double result = calc.multiply(0, 5);
        assertEquals(0, result, "Multiplication of 0 and 5 should be 0");
    }

    @Test
    @DisplayName("Testing multiply() with negative numbers")
    void testMultiplyWithNegative() {
        double result = calc.multiply(-4, 2);
        assertEquals(-8, result, "Multiplication of -4 and 2 should be -8");
    }

    
    @Test
    @DisplayName("Testing divide() with normal values")
    void testDivision() {
        double result = calc.divide(10, 2);
        assertEquals(5.0, result, "Division of 10 by 2 should be 5.0");
    }

    @Test
    @DisplayName("Testing divide() with zero")
    void testDivisionByZero() {
        assertThrows(ArithmeticException.class, () -> calc.divide(10, 0), 
            "Division by zero should throw an ArithmeticException");
    }

    @Test
    @DisplayName("Testing divide() with negative numbers")
    void testDivideWithNegative() {
        double result = calc.divide(-10, 2);
        assertEquals(-5.0, result, "Division of -10 by 2 should be -5.0");
    }
    @Test
@DisplayName("Testing factorial() method")
void testFactorial() {
    Calculator calc = new Calculator();
    assertEquals(120, calc.factorial(5), "Factorial of 5 should be 120");
}

}
