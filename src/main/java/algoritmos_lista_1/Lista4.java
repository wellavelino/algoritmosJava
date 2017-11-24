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

    public static double retornaVolumeEsfera(int raio) {
        double volume = 0;

        return volume = 4 / 3 * Math.PI * (Math.pow(raio, 3));
    }

    public static boolean numeroPrimo(int numero) {
        if (numero < 0) {
            System.out.println("Número negativo, suportamos apenas positivos");
        }
        boolean primo = false;

        if (numero % 2 == 1) {
            return primo = true;
        } else
            return primo = false;
    }

    public static int retornaIdadeEmDias(int ano, int meses, int dias) {

        // TODO fazer sem caelndar
    }

    public static String retornaCategoriaNadador(int idade) {
        String categoria = nil;
        if (idade >= 5 && idade <= 7) {
            return categoria = "Infantil A";
        } else if (idade >= 8 && idade <= 10) {
            return categoria = "Infantil B";
        } else if (idade >= 11 && idade <= 13) {
            return categoria = "Juvenil A";
        } else if (idade >= 14 && idade <= 17) {
            return categoria = "Juvenil B";
        } else if (idade >= 18) {
            return categoria = "Adulto";
        } else {
            return categoria = "Não encontrada";
        }
    }

    public static String retornaConceitoFinal(double nota) {
        String conceito = nil;
        if (nota >= 0.0 && nota <= 4.9) {
            return conceito = "D";
        } else if (nota >= 5.0 && nota <= 6.9) {
            return conceito = "C";
        } else if (nota >= 7.0 && nota <= 8.9) {
            return conceito = "B";
        } else {
            return conceito = "A";
        }
    }

    public static double retornaPesoIdeal(double altura, String sexo){
        double pesoIdeal = 0.0;
        if (sexo.toLowerCase() != "masculino" && sexo.toLowerCase() != "feminino"){
            System.out.println("Sexo invalido");
        }

        if (sexo.toLowerCase() == "masculino"){
           return pesoIdeal =  (72.7 * altura) - 58;
        }else{
            return pesoIdeal = (62.1 * altura) - 44.7;
        }
    }

    public static int[] numerosDivisores(int numero){
        int[] divisores = new int[0];
        for (int i = 1; i <= numero ; i++) {
            if (numero % i == 0){
                divisores[i] = i;
            }
        }
        return divisores;
    }

    public static int retornaSoma(int numeroA, int numeroB){
        int soma = 0;

        if (numeroB < 0 || numeroB == 0){
            return soma = -1;
        }else{
            return soma = numeroA + numeroB;
        }
    }

    public static double potencia(int numeroA, int numeroB){
        double p = 0.0;
        return p = (numeroA * numeroB);
    }

    public static void imprimeResultadoString(String resultado){
        System.out.println("O resultado é " + resultado;
    }

    public static void imprimeResultadoBoleano(boolean resultado){
        System.out.println("O resultado é " + resultado);
    }

    public static void imprimeResultadoInt(int resultado) {
        System.out.println("O resultado é " + resultado);
    }

    public static void imprimeResultadoDouble(double resultado){
        System.out.println("O resultado é " + resultado);
    }

    public static void imprimeArray(int[] array){
        for (int i = 0; i <= array.length; i++){
            System.out.println(array[i]);
        }

    }

    public static int entradaDados() {
        System.out.println("Entre com um número");
        int entrada = scan.nextInt();
        return entrada;
    }

    public static double entradaDadosDouble(){
        System.out.println("Entre com um número");
        double entrada = scan.nextDouble();
        return entrada;
    }


    public static String entradaDadosString(){
        System.out.println("Entre com uma palavra");
        String entrada = scan.next();
        return entrada;
    }
}
