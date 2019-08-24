package Exercicio5;

public class CamaroteInferior extends VIP {

    private String localizacao;

    public CamaroteInferior(String localizacao, double valor_adicional, double reais) {
        super(valor_adicional, reais);
        this.localizacao = localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void imprime_localizacao() {
        System.out.println("A localização do Camarote Inferior é " + localizacao + " cujo valor é " + valor_ingresso_vip() + " reais");
    }

}
