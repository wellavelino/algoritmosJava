package algoritmos_lista_1;

import java.util.Scanner;

/**
 * Created by wellingtonsantos on 9/8/17.
 */
public class Lista1 {
    static final Scanner scan = new Scanner(System.in);

    public static void multiplicationOfTwoNumbers() {

        int firstNumber = scan.nextInt();
        int secondNumber = scan.nextInt();
        int result = firstNumber * secondNumber;
        System.out.println(result);
    }

    public static void potencyOfTwoNumber() {

        int base = scan.nextInt();
        int exponent = scan.nextInt();
        System.out.println(Math.pow(base, exponent));
    }

//    public static int returnSumOfTwoSquares() {
//
//        return sun;
//    }

//    public static int printConsecutiveNumbers() {
//
//        return num;
//    }


//    public static int printNextNumber() {
//
//        return n;
//    }

    public static void calculateAreaOfSquare() {
        int side = scan.nextInt();
        System.out.print(side * side);
    }

    public static void arithmeticSums() {
        int valueA = scan.nextInt();
        int valueB = scan.nextInt();
        int valueC = scan.nextInt();

        returnTriangleArea(valueA, valueC);
        returnAreaOfCircle(valueC);
        returnAreaofTrapezium(valueA, valueB, valueC);
        returnAreaOfRegularSquare(valueB);
        returnAreaOfRectangle(valueA, valueB);
        returnPerimeterOfRectangle(valueA, valueC);
    }

    public static void calculateTriangleHyponetuse() {
        int sideA = scan.nextInt();
        int sideB = scan.nextInt();

        System.out.println(Math.sqrt(sideA * sideA + sideB * sideB));

    }

    public static void arithmeticAverage() {
        int gradeA = scan.nextInt();
        int gradeB = scan.nextInt();
        int gradeC = scan.nextInt();
        int gradeD = scan.nextInt();

        System.out.println((gradeA + gradeB + gradeC + gradeD) / 4);

    }

    public static void calculateSalaryOfficer() {
        int officerRegister = scan.nextInt();
        int workedHours = scan.nextInt();
        int hourlyWage = scan.nextInt();

        System.out.println("Officer register " + officerRegister + " Salary " + hourlyWage * workedHours);

    }

    public static void applyCommissionToOfficer() {
        String sellerName = scan.next();
        int salary = scan.nextInt();
        int salesAmount = scan.nextInt();
        double totalSalary = (salesAmount * 0.15) + salary;

        System.out.println("This month Seller " + sellerName +
                " and salary amount with commission " + totalSalary);

    }

    public static void verifyNegativeNumbers() {
        int number = scan.nextInt();

        if (number < 0) {
            System.out.println("Negative number");
        } else if (number > 0) {
            System.out.println("Positive number");
        } else {
            System.out.println("0 neither positive or negative");
        }
    }

    public static void guessWhatSquareOrCircle() {
        int square = scan.nextInt();
        int circleRadius = scan.nextInt();

        int squareArea = square * square;
        double circleAra = (circleRadius * circleRadius) * Math.PI * 2;

        if (squareArea > circleAra) {
            System.out.println("Square");
        } else
            System.out.println("Circle");
    }

    public static void printLargestOfTheNumbers() {
        int numberA = scan.nextInt();
        int numberB = scan.nextInt();
        int numberC = scan.nextInt();

        if (numberA > numberB && numberA > numberC) {
            System.out.println("Number A is largest ");
        } else if (numberB > numberA && numberB > numberC) {
            System.out.println("Number B is largest");
        } else if (numberC > numberA && numberC > numberB) {
            System.out.println("Number C is largest");
        }
    }

    public static void printDivisionOfLargest() {
        int numberA = scan.nextInt();
        int numberB = scan.nextInt();

        System.out.println((numberA > numberB) ? numberA / numberB : numberB / numberA);
    }

    public static void calculateBhaskara() {
        int numberA = scan.nextInt();
        int numberB = scan.nextInt();
        int numberC = scan.nextInt();

        double delta = Math.pow(numberB, 2) - (4 * numberA * numberC);

        if (delta > 0) {
            double x1 = (-numberB + Math.sqrt(delta) / (2 * numberA));
            double x2 = (-numberB - Math.sqrt(delta) / (2 * numberA));

            System.out.println("X1 is " + x1);
            System.out.println("X2 id " + x2);
        } else {
            System.out.println("impossible to calculate");
        }

    }

    private static void returnTriangleArea(int base, int height) {
        System.out.println("Triangle area " + base * height / 2);
    }

    private static void returnAreaOfCircle(int radius) {
        System.out.println("Area of circle " + (radius * radius) * Math.PI * 2);
    }

    private static void returnAreaofTrapezium(int base1, int base2, int height) {
        System.out.println("Area of trapezium " + (base1 + base2) * height / 2);
    }

    private static void returnAreaOfRegularSquare(int sideSquare) {
        System.out.println("Area of regular square " + sideSquare * sideSquare);
    }

    private static void returnAreaOfRectangle(int base, int height) {
        System.out.println("Area of rectangle" + base * height);
    }

    private static void returnPerimeterOfRectangle(int side1, int side2) {
        System.out.println("perimeter of rectangle " + (side1 + side1) + (side2 + side2));
    }
}
