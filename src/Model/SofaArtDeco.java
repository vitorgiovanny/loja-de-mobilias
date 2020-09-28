/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.interfaces.iSofa;

/**
 *
 * @author vitor
 */
public class SofaArtDeco implements iSofa{
    private String modelo;
    private String materialStofado;
    private int qtdLugares;

    @Override
    public void consultarCaracteristicas() {
        System.out.println("Modelo:" + this.getModelo());
        System.out.println("Material do Estofado:" + this.getMaterialStofado());
        System.out.print("Quantidade de Lugares:");
        System.out.print(this.getQtdLugares());
    }

    @Override
    public void cad(String modelo, String material, int qtd) {
        this.setModelo(modelo);
        this.setMaterialStofado(material);
        this.setQtdLugares(qtd);
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the materialStofado
     */
    public String getMaterialStofado() {
        return materialStofado;
    }

    /**
     * @param materialStofado the materialStofado to set
     */
    public void setMaterialStofado(String materialStofado) {
        this.materialStofado = materialStofado;
    }

    /**
     * @return the qtdLugares
     */
    public int getQtdLugares() {
        return qtdLugares;
    }

    /**
     * @param qtdLugares the qtdLugares to set
     */
    public void setQtdLugares(int qtdLugares) {
        this.qtdLugares = qtdLugares;
    }
    
    
    
}
