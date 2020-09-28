
package Model;

import Model.cadastro.Cadastro;
import Model.interfaces.iSofa;

/**
 *
 * @author vitor
 */
public class SofaModerna implements iSofa {
    private String modelo;
    private String materialStofado;
    private int qtdLugares;
    
    public SofaModerna(){}

    @Override
    public void consultarCaracteristicas() {
        System.out.println("Modelo:" + this.getModelo());
        System.out.println("Material do Estofado:" + this.getMaterialStofado());
        System.out.print("Quantidade de Lugares:");
        System.out.print(this.getQtdLugares());
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMaterialStofado() {
        return materialStofado;
    }

    public void setMaterialStofado(String materialStofado) {
        this.materialStofado = materialStofado;
    }

    public int getQtdLugares() {
        return qtdLugares;
    }


    public void setQtdLugares(int qtdLugares) {
        this.qtdLugares = qtdLugares;
    }

    @Override
    public void cad(String modelo, String material, int qtd) {
        this.setModelo(modelo);
        this.setMaterialStofado(material);
        this.setQtdLugares(qtd);
    }


    
    
}
