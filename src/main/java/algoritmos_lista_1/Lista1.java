package algoritmos_lista_1;

import sun.tools.java.ScannerInputReader;

import java.util.Scanner;

/**
 * Created by wellingtonsantos on 9/8/17.
 */
public class Lista1 {

    public static int returnMultiplicationOfTwoNumbers() {

        Scanner sc = new Scanner(System.in);

        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();
        return firstNumber * secondNumber;
    }

    public static double returnPotencyOfTwoNumber() {
        Scanner sc = new Scanner(System.in);

        int base = sc.nextInt();
        int exponent = sc.nextInt();

        return Math.pow(base, exponent);
    }

    public static int returnSumOfTwoSquares() {

    }

    public static int printConsecutiveNumbers() {

    }

    public static int printNextNumber() {

    }

    public static int calculateAreaOfSquare() {

        Scanner sc = new Scanner(System.in);

        int side = sc.nextInt();

        return side * side;
    }

    public static double returnArithmeticSums() {
        Scanner sc = new Scanner(System.in);

        int valueA = sc.nextInt();
        int valueB = sc.nextInt();
        int valueC = sc.nextInt();

        returnTriangleArea(valueA, valueC);
        returnAreaOfCircle(valueC);
        returnAreaofTrapezium(valueA, valueB, valueC);
        returnAreaOfRegularSquare(valueB);
        returnAreaOfRectangle(valueA, valueB);
        returnPerimeterOfRectangle(valueA, valueC);
    }


    private static int returnTriangleArea(int base, int height) {
        return base * height / 2;
    }

    private static double returnAreaOfCircle(int radius) {
        return (radius * radius) * Math.PI * 2;
    }

    private static int returnAreaofTrapezium(int base1, int base2, int height) {
        return (base1 + base2) * height / 2;
    }

    private static int returnAreaOfRegularSquare(int sideSquare) {
        return sideSquare * sideSquare;
    }

    private static int returnAreaOfRectangle(int base, int height) {
        return base * height;
    }

    private static int returnPerimeterOfRectangle(int side1, int side2) {
        return (side1 + side1) + (side2 + side2);
    }
}
