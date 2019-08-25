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
public class Teste {

    public static void main(String[] args) {
        Produto produto = new Produto("Teste", 1, 2, 3);
        Mesa exemplo = new Mesa("Descrição do produto", "Vendido", 1, 2, 3);

        produto.descreve_produto();
        exemplo.descreve_produto();
    }

}
