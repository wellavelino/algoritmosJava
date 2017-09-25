package algoritmos_lista_1;

import java.util.Scanner;

/**
 * Created by wellingtonsantos on 9/25/17.
 */
public class Lista2 {
    static final Scanner scan = new Scanner(System.in);

    //Crie um programa que verifica se um número inteiro informado pelo usuário é divisível por 3
    public static void numberDividiBy3() {
        int number = scan.nextInt();
        int result = (number % 3);

        switch (result) {
            case 0:
                System.out.print(number + " Can be dividi by 3");
                break;
            default:
                System.out.print(number + " cant dividi by 3");
                break;
        }
    }

    //Crie um programa que exibe se um dia é dia útil,
    // fim de semana ou dia inválido dado o número referente ao dia.
    // Considere que domingo é o dia 1 e sábado é o dia 7
    public static void daysOfWeek() {
        int dayOfWeek = scan.nextInt();

        switch (dayOfWeek) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
        }
    }

    //Crie um programa para informar quais e quantas notas são necessárias para entregar o mínimo de cédulas
    // para um determinado valor informado pelo usuário,
    // Considere notas de R$ 100, R$ 50, R$ 10 e R$ 5 e R$ 1.
    // Seu programa deve mostrar apenas as notas utilizadas.

    public static void cashOut() {
        int oneHundred = 100;
        int fifty = 50;
        int ten = 10;
        int five = 5;
        int one = 1;
        int valueToWithdraw = scan.nextInt();

    }

    //Construir um programa para identificar quantos dias há em um mês, sabendo o mês e o ano
    public static void dayInMonth() {
        int month = scan.nextInt();
        int year = scan.nextInt();

        boolean isleapYear =
                (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        switch (month) {

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 days");
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                System.out.print("30 days");
                break;


            case 2:
                System.out.print((isleapYear) ? " 29 days" : " 28 days");
                break;

            default:
                System.out.print("Invalid input!");
        }
    }

    //Criar um programa para identificar se um mês digitado pelo usuário é de alta ou baixa temporada
    // (considerar os seguintes meses como alta temporada: dezembro a fevereiro, junho e julho).
    public static void vacationsTime() {
        int month = scan.nextInt();

        if (month < 1 || month > 12) {
            System.out.print("Invalid month");
            return;
        }

        switch (month) {
            case 1:
            case 2:
            case 6:
            case 7:
            case 12:
                System.out.print("High season");
                break;

            default:
                System.out.print("Low season");
        }
    }

    //Criar um programa para identificar se um dia da semana (numerados de 1 a 7) é dia de semana,
    // fim de semana ou um dia inválido
    public static void identifyDayOfWeek() {
        int day = scan.nextInt();

        switch (day) {
            case 1:
            case 7:
                System.out.print("Weekend");
                break;

            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.print("Day of week");
                break;

            default:
                System.out.print("Invalid day");
        }
    }

    //Criar um programa para identificar o valor a ser pago por um plano de saúde dada a idade do conveniado,
    // considerando que todos pagam R$ 100 mais um adicional conforme a seguinte tabela
    public static void calculateTheHealthAgreement() {
        //Não fiz com switch por não fazer muito sentido
        int age = scan.nextInt();
        int healthAgreementValue = 100;

        if (age < 0) {
            System.out.print("Invalid age");
            return;
        }

        if (age >= 0 && age < 10) {
            System.out.println(healthAgreementValue + 80);
        } else if (age >= 10 && age <= 30) {
            System.out.println(healthAgreementValue + 50);
        } else if (age >= 40 && age <= 60) {
            System.out.println(healthAgreementValue + 95);
        } else {
            System.out.println(healthAgreementValue + 130);
        }
    }

    public static void isValidCPF() {
        //Não fiz com switch por não fazer muito sentido
        String ppf = scan.next();

        String[] CpfArray = ppf.split("");

        int[] intCpf = convertIntoIntArray(CpfArray);

        int sun = (intCpf[0] * 10) +
                (intCpf[1] * 9) +
                (intCpf[2] * 8) +
                (intCpf[3] * 7) +
                (intCpf[4] * 6) +
                (intCpf[5] * 5) +
                (intCpf[6] * 4) +
                (intCpf[7] * 3) +
                (intCpf[8] * 2);

        sun = sun - (11 * (sun / 11));

        int resul = (sun == 0 || sun == 1) ? 0 : 11 - sun;
        if (resul == intCpf[9]) {
            System.out.println("alooo");
            int sun2 = (intCpf[0] * 11) +
                    (intCpf[1] * 10) +
                    (intCpf[2] * 9) +
                    (intCpf[3] * 8) +
                    (intCpf[4] * 7) +
                    (intCpf[5] * 6) +
                    (intCpf[6] * 5) +
                    (intCpf[7] * 4) +
                    (intCpf[8] * 3) +
                    (intCpf[9] * 2);

            sun2 = sun2 - (11 * (sun2 / 11));

            int resul2 = (sun2 == 0 || sun2 == 1) ? 0 : 11 - sun2;
            System.out.println(resul2);

            if (resul2 == intCpf[10]) {
                System.out.println("Valid CPF");
            }
        } else {
            System.out.println("Invalid CPF");
        }
    }

    private static int[] convertIntoIntArray(String[] array) {
        int[] intArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            intArray[i] = Integer.parseInt(array[i]);
        }

        return intArray;
    }

    //Crie um programa que simule uma calculadora simples capaz de realizar as operações
    //básicas. O programa deve receber 3 dados: dois números e um caractere. Este caractere
    //poderá ser '+', '-', ‘*' ou '/' , e representarão a operação matemática que você deseja
    //realizar entre os números.
    public static void simpleCalculate(){
        int numberA = scan.nextInt();
        int numberB = scan.nextInt();
        System.out.println("Insert only, + , - , / and *");
        char operation = scan.next().charAt(0);

        switch (operation){
            case '+':
                System.out.println(numberA + numberB);
                break;
            case '-':
                System.out.println(numberA - numberB);
                break;
            case '/':
                System.out.println(numberA / numberB);
                break;
            case '*':
                System.out.print(numberA *  numberB);
                break;
             default:
                 System.out.print("Invalid operation");
        }
    }
}


