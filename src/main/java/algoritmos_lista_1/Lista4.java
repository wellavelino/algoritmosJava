package algoritmos_lista_1;

import java.util.Scanner;

/**
 * Created by wellingtonsantos on 11/17/17.
 */
public class Lista4 {
    static final Scanner scan = new Scanner(System.in);

    public static int retornaMenorDosNumeros(int num1, int num2, int num3) {
        int aux = 0;

        if (num1 < num2 && num1 < num3) {
            return num1;
        } else {
            if (num2 < num1 && num2 < num3) {
                return num2;
            } else {
                return num3;
            }
        }
    }

    public static int retornaSomaDosAntecessores(int numero) {
        int resultado = 0;
        for (int i = 0; i <= numero; i++) {
            resultado += i;
        }
        return resultado;
    }

    public static int fatorial(int num1) {
        int fatorial = 1;
        if (num1 <= 0) {
            System.out.println("Valor invalido, menor que zero");
            fatorial(num1);
        } else {
            for (int i = 1; i <= num1; i++) {
                fatorial *= i;
            }
        }
        return fatorial;
    }

    public static double formulaBhaskara(int num1, int num2, int num3, int valor) {
        //guard clause
        if (valor != 1 && valor != 2) {
            System.out.println("Valor invalido deve ser 1 ou 2");
        }

        double delta = Math.pow(num2, 2) - (4 * num1 * num3);

        if (delta > 0) {
            double x1 = (-num2 + Math.sqrt(delta) / (2 * num1));
            double x2 = (-num2 - Math.sqrt(delta) / (2 * num1));
            double maiorRaiz = 0;
            double menorRaiz = 0;

            if (x1 > x2) {
                maiorRaiz = x1;
                menorRaiz = x2;
            } else {
                maiorRaiz = x2;
                menorRaiz = x1;
            }

            if (valor == 1) {
                return maiorRaiz;
            } else {
                return menorRaiz;
            }

        } else {
            return -1;
        }
    }

    public static double retornaVolumeEsfera(int raio){
        double volume = 0;

        return volume = 4/3 * Math.PI * (Math.pow(raio, 3));
    }

    public static void imprimeResultadoInt(int resultado) {
        System.out.println("O resultado é " + resultado);
    }

    public static void imprimeResultadoDouble(double resultado){
        System.out.println("O resultado é " + resultado);
    }

    public static int entradaDados() {
        System.out.println("Entre com um número");
        int entrada = scan.nextInt();
        return entrada;
    }
}
