/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifms.estoque;

import br.edu.ifms.estoque.view.TelaUnidadeMedidaAnterior;
import javax.swing.JFrame;

/**
 *
 * @author santos
 */
public class TesteUnidadeMedida {

    public static void main(String[] args) {
        TelaUnidadeMedidaAnterior tela = new TelaUnidadeMedidaAnterior();
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setSize(300, 200);
        tela.setVisible(true);
    }
}
