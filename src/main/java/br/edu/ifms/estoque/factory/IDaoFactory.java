/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.edu.ifms.estoque.factory;

/**
 *
 * @author nicholas.santos
 */
public interface IDaoFactory {

    Object createObject(String sgbd);
}
