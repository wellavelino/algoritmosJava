package algoritmos_lista_1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by wellingtonsantos on 9/8/17.
 */
public class Lista1 {
    static final Scanner scan = new Scanner(System.in);
    public static final int DAY_DURATION = 24;

    public static void multiplicationOfTwoNumbers() {

        int firstNumber = scan.nextInt();
        int secondNumber = scan.nextInt();
        int result = firstNumber * secondNumber;
        System.out.println("Multiplication of two numbers " + result);
    }

    public static void potencyOfTwoNumber() {

        int base = scan.nextInt();
        int exponent = scan.nextInt();
        System.out.println(Math.pow(base, exponent));
    }

    public static void sumOfTwoSquares() {
        int squareA = scan.nextInt();
        int squareB = scan.nextInt();

        System.out.println("Sum of two squares " + (squareA * squareA) + (squareB * squareB));

    }

    public static void printConsecutiveNumbers() {
        int numberA = scan.nextInt();
        System.out.println("The consecutive number is " + getConsecutiveNumber(numberA));

        int numberB = scan.nextInt();
        System.out.println("The consecutive number is " + getConsecutiveNumber(numberB));

    }

    public static void calculateAreaOfSquare() {
        int side = scan.nextInt();
        System.out.print("Square area " + side * side);
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


//    Leia a hora inicial e a hora final de um jogo.
//    A seguir calcule a duração do jogo, sabendo que o mesmo pode começar em um dia
//    e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
//    Veja abaixo alguns exemplos. Não fixe esses valores no código.
//    Você pode usá­los para TESTAR seu algoritmo:

    public static void getGameDuration() {
        int initalTime = scan.nextInt();
        int finalTime = scan.nextInt();
        int gameDuration = 0;

        if (initalTime > finalTime) {
            gameDuration = (DAY_DURATION + finalTime) - initalTime;
            System.out.println("Game duration " + gameDuration);
        } else if (initalTime < finalTime) {
            gameDuration = finalTime - initalTime;
            System.out.println("Game Duration" + gameDuration);
        } else {
            System.out.println("24 hours");
        }
    }
//    Leia 4 valores inteiros A, B, C e D. A seguir,
//    se B for maior do que C e se D for maior do que A,
//
//
//    e a soma de C com D for maior que a soma de A e B e se C e D,
//    ambos, forem positivos e se a variável A for par escrever a mensagem "Valores aceitos",
//    senão escrever "Valores nao aceitos".

    // se b > c && D > A
    // c+d > a + b
    // if c & d forem positivos, variavel A for par
    public static void verifyAceptNumbers() {
        int numberA = scan.nextInt();
        int numberB = scan.nextInt();
        int numberC = scan.nextInt();
        int numberD = scan.nextInt();

        if (numberB > numberC && numberD > numberA) {
            if (acceptedValues(numberA, numberB, numberC, numberD)) {
                System.out.println("Accepteds values");
            }
        } else {
            System.out.println("Values not accepted");
        }
    }

    //    Leia 3 números decimais A, B e C e ordene­os em ordem decrescente,
// de modo que o lado A representa o maior dos 3 lados. A seguir,
// determine o tipo de triângulo que estes três lados formam,
// com base nos seguintes casos, sempre escrevendo uma mensagem adequada:
//  se A ≥ B+C, apresente a mensagem: NAO FORMA TRIANGULO
//● se A2    = B2    + C2   , apresente a mensagem: TRIANGULO RETANGULO
//● se A2    > B2    + C2   , apresente a mensagem: TRIANGULO OBTUSANGULO
//● se A2    < B2    + C2   , apresente a mensagem: TRIANGULO ACUTANGULO
//● se os três lados forem iguais, apresente a mensagem: TRIANGULO EQUILATERO
//● se apenas dois dos lados forem iguais, apresente a mensagem: TRIANGULO ISOSCELES
//
    public static void triangleType() {
        ///refazer
        double numberA = scan.nextLong();
        double numberB = scan.nextLong();
        double numberC = scan.nextLong();


//        numberA = findMinNumber(numberA, numberB, numberC);
//        numberB = findMidNumber(numberA, numberB, numberC);
//        numberC = findMaxNumber(numberA, numberB, numberC);

        System.out.println(numberA = findMinNumber(numberA, numberB, numberC));
        System.out.println(numberB = findMidNumber(numberA, numberB, numberC));
        System.out.println(numberC = findMaxNumber(numberA, numberB, numberC));

        double numberAdouble = Math.pow(numberA, 2);
        double numberBdouble = Math.pow(numberB, 2);
        double numberCdouble = Math.pow(numberC, 2);

        if (numberA >= numberB + numberC) {
            System.out.println("NAO FORMA TRIANGULO");

        } else if (numberAdouble == numberBdouble + numberCdouble) {
            System.out.println("TRIANGULO RETANGULO");
        } else if (numberAdouble > numberBdouble + numberCdouble) {
            System.out.println("TRIANGULO OBTUSANGULO");
        } else if (numberAdouble < numberBdouble + numberCdouble) {
            System.out.println("TRIANGULO ACUTANGULO");
        } else if (numberA == numberB && numberB == numberC) {
            System.out.println("TRIANGULO EQUILATERO");
        } else if (numberA == numberB || numberA == numberC || numberB == numberC) {
            System.out.println("TRIANGULO ISOSCELES");
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

    private static int getConsecutiveNumber(int number) {
        return (number > 0) ? number + 1 : number + 1;
    }

    private static boolean acceptedValues(int numberA, int numberB, int numberC, int numberD) {
        int sumCD = numberC + numberD;
        int sumAB = numberA + numberB;
        boolean result = true;

        if (sumCD > sumAB) {
            if (numberC > 0 && numberD > 0) {
                if (numberA % 2 == 0) {
                    result = true;
                } else
                    result = false;
            }
        }
        return result;
    }

    private static double findMinNumber(double numberA, double numberB, double numberC) {
        double minorA = numberA < numberB ? numberA : numberB,
                minorB = numberA < numberC ? numberA : numberC;

        return minorA < minorB ? minorA : minorB;
    }

    private static double findMaxNumber(double numberA, double numberB, double numberC) {
        double midA = numberA > numberB ? numberA : numberB,
                midB = numberA > numberC ? numberA : numberC;

        return midA > midB ? midA : midB;
    }

    private static double findMidNumber(double numberA, double numberB, double numberC) {
        double maxA = findMinNumber(numberA, numberB, numberC),
                maxB = findMaxNumber(numberA, numberB, numberC),
                maxC = numberA == maxA ? numberB : numberA;

        return maxC == maxB ? numberC : maxC;
    }
}