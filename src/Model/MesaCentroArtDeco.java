package Model;

import Model.interfaces.iMesaCentro;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vitor
 */
public class MesaCentroArtDeco implements iMesaCentro{
    private String modelo;
    private String marca;
    
    public MesaCentroArtDeco(){
        
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
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public void consultarCaracteristicas() {
        System.out.println(this.getMarca());
        System.out.println(this.getModelo());
    }

    @Override
    public void cad(String modelo, String marca) {
       this.setMarca(marca);
       this.setModelo(modelo);
    }
    
    
}
