/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio6;

/**
 *
 * @author Horus
 */
public class Mesa extends Produto {

    private String status;

    public Mesa(String status, double comprimento, double largura, double altura) {
        super(comprimento, largura, altura);
        this.status = status;
    }

    public void setStatus() {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public void descreve_produto() {
        System.out.println("O Mesa tem as seguintes dimensões:");
        System.out.println("Comprimento: " + getComprimento());
        System.out.println("Largura: " + getLargura());
        System.out.println("Altura: " + getAltura());
        System.out.println("Status de Venda: " + getStatus());
    }

}
