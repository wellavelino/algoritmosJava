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
}
