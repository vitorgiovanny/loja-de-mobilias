
package Model;

import Model.interfaces.iCadeira;


public class CadeiraModerna implements iCadeira{
    private String material;
    private String modelo;
    private int unidade;
    
    public CadeiraModerna(){}
    
    @Override
    public void consultarCaracteristicas() {
        System.out.println("Modelo:" + this.getModelo());
        System.out.println("Material do Estofado:" + this.getMaterial());
        System.out.print("Quantidade de Lugares:");
        System.out.print(this.getUnidade());
    }

    @Override
    public void cad(String modelo, String material, int unidade) {
      this.setMaterial(material);
      this.setModelo(modelo);
      this.setUnidade(unidade);
    }

    /**
     * @return the material
     */
    public String getMaterial() {
        return material;
    }

    /**
     * @param material the material to set
     */
    public void setMaterial(String material) {
        this.material = material;
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
     * @return the unidade
     */
    public int getUnidade() {
        return unidade;
    }

    /**
     * @param unidade the unidade to set
     */
    public void setUnidade(int unidade) {
        this.unidade = unidade;
    }
    


    
}
