/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.edu.ifms.estoque.dao;

import br.edu.ifms.estoque.model.Marca;
import java.util.List;

/**
 *
 * @author nicholas.santos
 */
public interface IMarcaDao extends IDao {

    public Marca buscarPorId(Long id);

    public List buscarPorNome(String nome);
}
