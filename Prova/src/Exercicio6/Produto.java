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
public class Produto {

    private double comprimento, largura, altura;
    private String desc;

    public Produto(String desc, double comprimento, double largura, double altura) {
        this.comprimento = comprimento;
        this.largura = largura;
        this.altura = altura;
        this.desc = desc;
    }

    public double getComprimento() {
        return comprimento;
    }

    public double getLargura() {
        return largura;
    }

    public double getAltura() {
        return altura;
    }

    public String getDesc() {
        return desc;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setDesc() {
        this.desc = desc;
    }

    public void descreve_produto() {
        System.out.println("O produto tem as seguintes dimensões:");
        System.out.println("Comprimento: " + getComprimento());
        System.out.println("Largura: " + getLargura());
        System.out.println("Altura: " + getAltura());
        System.out.println("Descrição: " + getDesc());
    }

}
