package Exercicio5;

public class Teste {

    public static void main(String[] args) {
        Ingresso ingresso = new Ingresso(10);
        VIP vip = new VIP(2, 10);
        Normal normal = new Normal(10);
        CamaroteInferior inferior = new CamaroteInferior("Sala 1", 2, 10);
        CamaroteSuperior superior = new CamaroteSuperior(3, 2, 10);

        ingresso.imprimeValor();
        vip.imprime_ingresso_vip();
        normal.imprime_ingresso();
        inferior.imprime_localizacao();
        superior.imprime_valor_do_ingresso_camarote_vip_superior();
    }
}
