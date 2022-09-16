package br.com.questao1.estoque;

public class Principal {

    public static void main(String[] args) {
        Estoque estoque1 = new Estoque("Caneta", 100, 1);
        System.out.println(estoque1.mostra ());
        estoque1.setNome("Caneta Azul");
        System.out.println(estoque1.getNome());
        estoque1.darBaixa(50);
        if(estoque1.precisaRepor() == true) {
            System.out.println("O estoque precisa ser reabastecido.");
        }
        else {
            System.out.println("O estoque não precisa ser reabastecido.");
        }

        Estoque estoque2 = new Estoque();
        estoque2.setNome("Apagador");
        estoque2.setQtdAtual(10);
        estoque2.setQtdMinima(2);
        System.out.println(estoque2.mostra());

    }

}
