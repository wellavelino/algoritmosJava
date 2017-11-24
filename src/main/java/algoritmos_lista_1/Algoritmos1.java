package algoritmos_lista_1;


import java.text.ParseException;
import java.util.Scanner;


import static algoritmos_lista_1.Lista4.*;

/**
 * Created by wellingtonsantos on 9/8/17.
 */
public class Algoritmos1 {
    static final Scanner scan = new Scanner(System.in, "utf-8");

    public static void main(String[] args) throws ParseException {
        String dad = scan.next();
        System.out.println(dad);

        System.out.println("Escolha um algoritmo para testar");
        System.out.println("1 - menor dos tres números");
        System.out.println("2 - Soma dos antecessores");
        System.out.println("3 - fatorial");
        System.out.println("4 - Divide o fatorial pela somatoria");
        System.out.println("5 - Maior das raizes");
        System.out.println("6 - Retorna a raiz de acordo com a opcao");
        System.out.println("7 - Retorna volume de uma esfera");
        System.out.println("8 - Retorna numero primo");
        System.out.println("9  - terminar");
        System.out.println("10  - categoria nadador");
        System.out.println("11  - conceito final");
        System.out.println("12  - peso ideal");
        System.out.println("13  - numeros divisores");
        System.out.println("14  - retorna a soma dos numeros");
        System.out.println("15  - potencia");


        int opcao = scan.nextInt();

        switch (opcao) {
            case 1:
                int num1 = entradaDados();
                int num2 = entradaDados();
                int num3 = entradaDados();
                int resultado = retornaMenorDosNumeros(num1, num2, num3);
                imprimeResultadoInt(resultado);
                break;
            case 2:
                int numero = entradaDados();
                int result = retornaSomaDosAntecessores(numero);
                imprimeResultadoInt(result);
                break;
            case 3:
                int entrada = entradaDados();
                int resultadoFatorial = fatorial(entrada);
                imprimeResultadoInt(resultadoFatorial);
                break;
            case 4:
                int f = entradaDados();
                int soma = retornaSomaDosAntecessores(f);
                int rFatorial = fatorial(f);
                System.out.println("Resultado é " + rFatorial / soma);
                break;
            case 5:
                int bnum1 = entradaDados();
                int bnum2 = entradaDados();
                int bnum3 = entradaDados();
                int valor = 1;
                double r = formulaBhaskara(bnum1, bnum2, bnum3, valor);
                imprimeResultadoDouble(r);
                break;
            case 6:
                int cnum1 = entradaDados();
                int cnum2 = entradaDados();
                int cnum3 = entradaDados();
                System.out.println("Insira um valor 1 para a maior raiz 2 para a menor");
                int v = scan.nextInt();
                double re = formulaBhaskara(cnum1, cnum2, cnum3, v);
                imprimeResultadoDouble(re);
                break;
            case 7:
                int esfera = entradaDados();
                double volume = retornaVolumeEsfera(esfera);
                imprimeResultadoDouble(volume);
                break;
            case 8:
                int n = entradaDados();
                boolean numeroP = numeroPrimo(n);
                imprimeResultadoBoleano(numeroP);
                break;

            case 9:
                // todo
                break;
            case 10:
                int idade = entradaDados();
                String cat = retornaCategoriaNadador(idade);
                imprimeResultadoString(cat);
                break;
            case 11:
                int not = entradaDados();
                String fi = retornaConceitoFinal(not);
                imprimeResultadoString(fi);
                break;
            case 12:
                double altura = entradaDadosDouble();
                String sexo = entradaDadosString();

                double p = retornaPesoIdeal(altura, sexo);
                imprimeResultadoDouble(p);
                break;
            case 13:
                int div = entradaDados();
                int[] bla = numerosDivisores(div);
                imprimeArray(bla);
                break;
            case 14:
                int s = entradaDados();
                int t = entradaDados();
                int rre = retornaSoma(s, t);
                imprimeResultadoInt(rre);
                break;
            case 15:
                int io = entradaDados();
                int oi = entradaDados();
                double ptc = potencia(io, oi);
                imprimeResultadoDouble(ptc);

        }
    }
}
