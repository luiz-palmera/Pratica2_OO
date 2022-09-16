package br.com.questao1.estoque;

public class Estoque {
    private String nome;
    private int qtdAtual;
    private int qtdMinima;

    public Estoque() {
    }

    public Estoque(String nome, int qtdAtual, int qtdMinima) {
        super();
        this.nome = nome;
        this.qtdAtual = qtdAtual;
        this.qtdMinima = qtdMinima;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdAtual() {
        return qtdAtual;
    }

    public void setQtdAtual(int qtdAtual) {
        this.qtdAtual = qtdAtual;
    }

    public int getQtdMinima() {
        return qtdMinima;
    }

    public void setQtdMinima(int qtdMinima) {
        this.qtdMinima = qtdMinima;
    }

    public void darBaixa(int qtde) {
        if(qtde <= this.qtdAtual)
            this.qtdAtual -= qtde;
        else
            System.out.println("O estoque não pode ser negativo!");

    }

    public String mostra() {
        return "Produto: " + getNome() + "\nEstoque atual: " + getQtdAtual() + "\nEstoque Minimo: " + getQtdMinima();
    }

    public boolean precisaRepor() {
        if(this.qtdAtual <= this.qtdMinima)
            return true;
        else
            return false;

    }


}
