package src;

/*
 * Date: 02/27/2025
 * Author: Aaron Canchola
 * Class: Math-130-610
 * Project: MyMath
 * Description: The following tester class should be saved in a separate file named TestMyMath.java.
 */
public class TestMyMath {
    public static void main(String[] args) {
        System.out.println(MyMath.add(3, 5));    // 8.0
        System.out.println(MyMath.subtract(10, 4)); // 6.0
        System.out.println(MyMath.multiply(3, 4));  // 12.0
        System.out.println(MyMath.divide(8, 2));    // 4.0
        System.out.println(MyMath.max(7, 9));      // 9.0
        System.out.println(MyMath.min(7, 9));      // 7.0
        System.out.println(MyMath.isEven(10));     // true
        System.out.println(MyMath.isOdd(11));      // true
        System.out.println(MyMath.PI);      // 3.141592653589793
        System.out.println(MyMath.E);      // 2.718281828459045
    }
}