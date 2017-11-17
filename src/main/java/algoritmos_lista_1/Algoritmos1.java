package algoritmos_lista_1;


import java.text.ParseException;
import java.util.Scanner;


import static algoritmos_lista_1.Lista4.*;

/**
 * Created by wellingtonsantos on 9/8/17.
 */
public class Algoritmos1 {
    static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws ParseException {
        System.out.println("Escolha um algoritmo para testar");
        System.out.println("1 - menor dos tres números");
        System.out.println("2 - Soma dos antecessores");
        System.out.println("3 - fatorial");
        System.out.println("4 - Divide o fatorial pela somatoria");
        System.out.println("5 - Maior das raizes");
        System.out.println("6 - Maior das raizes");
        int opcao = scan.nextInt();

        switch (opcao) {
            case 1:
                int num1 = entradaDados();
                int num2 = entradaDados();
                int num3 = entradaDados();
                int resultado = retornaMenorDosNumeros(num1, num2, num3);
                imprimeResutado(resultado);
                break;
            case 2:
                int numero = entradaDados();
                int result = retornaSomaDosAntecessores(numero);
                imprimeResutado(result);
                break;
            case 3:
                int entrada = entradaDados();
                int resultadoFatorial = fatorial(entrada);
                imprimeResutado(resultadoFatorial);
                break;
            case 4:
                int f = entradaDados();
                int soma = retornaSomaDosAntecessores(f);
                int rFatorial = fatorial(f);
                System.out.println("Resultado é " + rFatorial/soma);
                break;  
            case 5:

        }
    }
}
