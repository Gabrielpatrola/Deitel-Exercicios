package Exercicio5;

public class Normal extends Ingresso {

    public Normal(double reais) {
        super(reais);
    }

    public void imprime_ingresso() {
        System.out.println("Ingresso Normal custa " + getReais() + " reais");
    }

}
