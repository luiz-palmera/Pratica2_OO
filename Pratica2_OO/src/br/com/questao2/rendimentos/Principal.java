package br.com.questao2.rendimentos;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o valor inicial do Rendimento: ");
        double vrInicial = ler.nextDouble();

        System.out.println("Digite a taxa de juros: ");
        double txJuros = ler.nextDouble();

        System.out.println("Digite o número de meses para o Rendimento: ");
        int numMeses = ler.nextInt();

        Rendimentos r1 = new Rendimentos(vrInicial,txJuros,numMeses);

        r1.calculaRendimento();
    }

}
