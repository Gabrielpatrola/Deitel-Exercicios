package Exercicio5;

public class Ingresso {

    private double reais;

    public Ingresso(double reais) {
        this.reais = reais;
    }

    public void setReais() {
        this.reais = reais;
    }

    public double getReais() {
        return reais;
    }

    public void imprimeValor() {
        System.out.println("O valor o ingresso é " + reais + " reais");
    }

}
