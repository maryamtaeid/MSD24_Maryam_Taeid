package at.fhj.msd;

public class Calculator {
    
    
    public double add(double number1, double number2) {
        return number1 + number2;
    }

    
    public double minus(double number1, double number2) {
        return number1 - number2;
    }


    public double divide(double number1, double number2) {
        if (number2 == 0.0)
            throw new ArithmeticException("Division by zero");
        return number1 / number2;
    }


    public double multiply(double number1, double number2) {
        return number1 * number2;
    }
    //public int factorial(int n) { 
        //return 0; 
    //}
    public int factorial(int n) {
        return (n <= 1) ? (n < 0 ? 0 : 1) : n * factorial(n - 1);
    }
    
    
}
