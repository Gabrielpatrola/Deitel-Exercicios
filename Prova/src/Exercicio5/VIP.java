package Exercicio5;

public class VIP extends Ingresso {

    private double valor_adicional;

    public VIP(double valor_adicional, double reais) {
        super(reais);
        this.valor_adicional = valor_adicional;
    }

    public void setValor_adicional() {
        this.valor_adicional = valor_adicional;
    }

    public double getValor_adicional() {
        return valor_adicional;
    }

    public double valor_ingresso_vip(){
        return getReais() + valor_adicional;
    }
    
    public void imprime_ingresso_vip() {
        System.out.println("Ingresso VIP custa " + (getReais() + valor_adicional) + " reais");
    }

}
