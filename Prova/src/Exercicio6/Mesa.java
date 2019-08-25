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
    private String desc;

    public Mesa(String desc, String status, double comprimento, double largura, double altura) {
        super(desc ,comprimento, largura, altura);
        this.desc = desc;
        this.status = status;
    }

    public void setDesc() {
        this.desc = desc;
    }

    public void setStatus() {
        this.status = status;
    }

    public String getDesc() {
        return desc;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public void descreve_produto() {
        System.out.println("A Mesa tem as seguintes dimensões:");
        System.out.println("Comprimento: " + getComprimento());
        System.out.println("Largura: " + getLargura());
        System.out.println("Altura: " + getAltura());
        System.out.println("Descrição: " + getDesc());
        System.out.println("Status de Venda: " + getStatus());
    }

}
