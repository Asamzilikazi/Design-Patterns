package za.ac.mzilikazi;

/**
 * Created by mandisi on 2017-04-02.
 */
public class Calculator {
    private static Calculator calculator = null;

    private Calculator() {
    }

    public static Calculator getInstance() {
        if (calculator == null) {
            calculator = new Calculator();
        }
        return calculator;
    }

    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public int substract(int num1, int num2) {
        return num1 - num2;
    }

    public int devide(int num1, int num2) {
        return num1 / num2;
    }
}
