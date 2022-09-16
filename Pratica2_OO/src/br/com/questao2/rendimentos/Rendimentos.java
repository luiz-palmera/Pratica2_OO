package br.com.questao2.rendimentos;
import java.text.NumberFormat;

public class Rendimentos {
    private double investInicial;
    private double taxaRendimento;
    private int numMeses;

    public Rendimentos(double investInicial, double taxaRendimento, int numMeses) {
        this.investInicial = investInicial;
        this.taxaRendimento = taxaRendimento;
        this.numMeses = numMeses;
    }

    public double getInvestInicial() {
        return investInicial;
    }

    public void setInvestInicial(double investInicial) {
        this.investInicial = investInicial;
    }

    public double getTaxaRendimento() {
        return taxaRendimento;
    }

    public void setTaxaRendimento(double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }

    public int getNumMeses() {
        return numMeses;
    }

    public void setNumMeses(int numMeses) {
        this.numMeses = numMeses;
    }

    public void calculaRendimento() {
        double rendimentoMes;
        rendimentoMes = getInvestInicial();
        System.out.println("Valor Inicial: "+ NumberFormat.getCurrencyInstance().format(getInvestInicial()));
        System.out.println("Porcentagem de Juros"+ NumberFormat.getPercentInstance().format(getTaxaRendimento()));
        for(int i = 0 ; i< getNumMeses(); i++)
        {
            rendimentoMes = rendimentoMes * getTaxaRendimento() /100 + rendimentoMes;
            //System.out.printf("Mês %d: %.2f\n",(i+1),rendimentoMes);
            System.out.println("Mes " +(i+1)+ ": " + NumberFormat.getCurrencyInstance().format(rendimentoMes) );
        }
    }



}
