package algoritmos_lista_1;

import java.util.Scanner;

/**
 * Created by wellingtonsantos on 10/11/17.
 */
public class Lista3 {
    static final Scanner scan = new Scanner(System.in);

    public static void printSequentialNumbers() {
        int count = 0;
        while (count < 50) {
            count++;
            System.out.println(count);
        }
    }

    public static void sumUserNumbers() {
        int n = scan.nextInt();
        int number = 1;
        int sum = 0;

        while (number <= n) {
            sum = sum + number;
            number++;
        }
        System.out.println(sum);
    }

    public static void greaterThanTen() {
        int aux = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Insert the number");
            int number = scan.nextInt();

            if (aux < number) {
                aux = number;
            }
        }
        System.out.println("The greater number is " + aux);
    }

    public static void printSequentiaTenNumbers() {
        for (int i = 10; i <= 1000; i = i + 10) {
            System.out.println(i);
        }
    }

    public static void printDecreasingEvenNumbers() {
        for (int i = 100; i > 1; i--) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void olderStudent() {
        String[] name = new String[5];
        int[] age = new int[5];
        String[] gender = new String[5];
        int count = 0;
        int ageIndex = 0;
        int majorAge = 0;

        do {
            name[count] = scan.next();
            age[count] = scan.nextInt();
            gender[count] = scan.next();

            if (majorAge < age[count]) {
                majorAge = age[count];
                ageIndex = count;
            }

            System.out.println(count);
        } while (count++ < 4);

        System.out.println(name[ageIndex] + " " + age[ageIndex] + " " + gender[ageIndex]);
    }

    public static void printMultiplyMinorof200() {
        int count = 0;
        while (count <= 200) {
            if ((count % 7) == 0) {
                System.out.println(count + " is a multiply of 7");
            }
            count++;
        }
    }

    public static void calculateArithimetcAverage() {
        int grades = 0;
        int quantity = 0;
        for (int i = 13; i <= 73; i++) {
            if ((i % 2) == 0) {
                quantity++;
                grades = grades + i;
            }
        }
        System.out.println(grades / quantity);
    }

    public static void calculateClassArithimeticAverage() {
        int studentQuantity = scan.nextInt();
        double arithimeticAverage = 0;
        int count = 0;
        while (count < studentQuantity) {
            System.out.println("Insert the grade student");
            int classGrades = scan.nextInt();

            arithimeticAverage = arithimeticAverage + classGrades;
            count++;
        }
        System.out.println("The arithimetic average is" + arithimeticAverage / count);
    }

    public static void fractionSum() {
        double sum = 0;
        for (int i = 2; i <= 20; i++) {
            sum += 1f / i;
        }
        System.out.printf("%.2f", sum + 1);
    }

    public static void fractionSumWithInput() {
        int number = scan.nextInt();
        double sum = 1;
        for (int i = 2; i <= number; i++) {
            if ((i % 2) == 0) {
                sum -= 1f / i;
            } else
                sum += 1f / i;
        }
        System.out.printf("%.2f", sum);
    }

    //TODO fazer o exercicio 12

    public static void naturalSum() {
        int number = scan.nextInt();
        float sum = 0;
        for (int k = 2; k <= number; k++) {
            int expoent = 1;
            int base = 1;

            for (int i = 2, j = 3; i <= k; i++, j += 2) {
                expoent *= i;
                base *= j;
            }
            sum += (float) expoent / (float) base;
        }

        System.out.printf("%.2f", sum + 1);
    }

    public static void calculateNaturalNumber() {
        int number = scan.nextInt();
        float sum = 0;
        for (int k = 2; k <= number; k++) {

            for (int i = 2, j = 3; i <= k; i += 2, j += 2) {
                sum += (float) i / (float) j;
            }
        }
        System.out.printf("%.2f", sum + 1);
    }

    public static void factorialNumbers() {
        System.out.println("Insert the number to calculate the factorial");
        int factorial = 1;
        int value = scan.nextInt();

        if (value <= 0) {
            System.out.println("Invalid value, the number must be greather than zero");
            factorialNumbers();
        } else {
            for (int i = 1; i <= value; i++) {
                factorial *= value;
                System.out.println("The factorial is " + factorial);
            }
        }
    }

    public static void guessWhatNumberType() {
        int number = 0;
        int count = 1;
        do {
            number = scan.nextInt();
            if (number == 0) {
                System.out.println("NULO");
            } else {
                if (evenNumber(number)) {
                    System.out.println("PAR");
                } else {
                    System.out.println("IMPAR");
                }
                if (number > 0) {
                    System.out.println("POSITIVO");
                } else {
                    System.out.println("NEGATIVO");
                }
            }

        } while (count++ <= number);
    }

    public static void dividingNumbers(){
        int number = scan.nextInt();

        for (int i = 1; i <= number ; i++) {
           if (number % i == 0){
               System.out.println(number + " id  dividing by "+ i);
           }
        }
    }

    public static void fibonacci() {
        int fibo = 0;
        int n = 0;
        int after = 1;
        int before = 0;
        while (n < 46) {
            fibo = before + after;
            before = after;
            after = fibo;
            n++;
            System.out.println(before);
        }
    }

    public static void password(){
        System.out.println("To login insert the password");
        int pass = 0;
        while (pass != 2002){
            pass = scan.nextInt();
            if (pass == 2002){
                System.out.println("Garanted access");
            }else{
                System.out.println("Invalid password");
            }
        }
    }

    public static void atmSimulator() {
        int deposit = 0;
        int withdraw = 0;
        int total = 0;
        int option = 0;
        System.out.println("insert the account balance ");
        total = scan.nextInt();

        do {
            System.out.println("press 1 to deposit ");
            System.out.println("press 2 to withdraw ");
            System.out.println("press 3 to EXIT ");
            option = scan.nextInt();
            if (option == 1) {
                System.out.println("deposit ");
                deposit = scan.nextInt();
                total += deposit;
            } else if (option == 2) {
                System.out.println("withdraw ");
                withdraw = scan.nextInt();
                total -= withdraw;
            }

        } while (option != 3);

        if (total == 0) {
            System.out.println("CONTA ZERADA");
        } else if (total < 0) {
            System.out.println("CONTA ESTOURADA");
        } else {
            System.out.println("CONTA PREFERENCIAL");
        }
    }

    public static void perfectNumber(){
        int number = scan.nextInt();
        int total = 0;
        for (int i = 1; i < number ; i++) {
            if (number % i == 0){
                total += i;
            }
        }
        if (total == number){
            System.out.println(number + " Is a perfect number");
        }else {
            System.out.println(number + " Isnt a perfect number");
        }
    }

    private static boolean evenNumber(int number) {
        boolean result = true;

        if (number % 2 == 0) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}
