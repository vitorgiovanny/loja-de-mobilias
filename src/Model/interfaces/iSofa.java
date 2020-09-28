/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.interfaces;

import Model.cadastro.Cadastro;

/**
 *
 * @author vitor
 */
public interface iSofa {
    public void consultarCaracteristicas();
    public void cad(String modelo, String material, int qtd);
}
