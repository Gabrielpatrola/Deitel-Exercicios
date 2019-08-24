package Exercicio5;

public class CamaroteSuperior extends VIP {

    private double valor_adicional_camarote_superior;

    public CamaroteSuperior(double valor_adicional_camarote_superior, double valor_adicional, double reais) {
        super(valor_adicional, reais);
        this.valor_adicional_camarote_superior = valor_adicional_camarote_superior;
    }

    public double valor_ingresso_vip_camarote_superior() {
        return valor_ingresso_vip() + valor_adicional_camarote_superior;
    }

    public void imprime_valor_do_ingresso_camarote_vip_superior() {
        System.out.println("O valor do ingresso VIP do Camorote Superior é " + valor_ingresso_vip_camarote_superior());
    }

}
