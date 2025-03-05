package src;

/*
 * Date: 02/27/2025
 * Author: Aaron Canchola
 * Class: Math-130-610
 * Project: MyMath
 * Description: A utility class in Java provides static methods that can be used across an application.
 *              The Math class in Java is an example of such a utility class, offering common mathematical functions.
 *              In this project, you will create a utility class named MyMath that provides common mathematical methods similar to Java's Math class.
 *              These methods will help perform basic calculations without using loops or arrays.
 */
public class MyMath {

    //Returns the sum of two integers.
    public static double add(double a, double b) {
        return a + b;
    }

    //Returns the result of subtracting the second integer from the first.
    public static double subtract(double a, double b) {
        return a - b;
    }

    //Returns the product of two integers.
    public static double multiply(double a, double b) {
        return a * b;
    }

    //Returns the result of dividing the first integer by the second. The divisor b cannot be zero.
    public static double divide(double a, double b) {
        return a / b;
    }

    //Returns the greater of two integers.
    public static double max(double a, double b) {
        return Math.max(a, b);
    }

    //Returns the smaller of two integers.
    public static double min(double a, double b) {
        return Math.min(a, b);
    }

    //Returns true if the integer is even, false otherwise.
    public static boolean isEven(double a) {
        return a % 2 == 0;
    }

    //Returns true if the integer is odd, false otherwise.
    public static boolean isOdd(double a) {
        return a % 2 != 0;
    }

    //Returns the value of PI.
    public static final double PI = Math.PI;

    //Returns the value of E.
    public static final double E = Math.E;
}
