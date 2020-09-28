
package View;

import Model.Classes.Concretos.fabrica.FabricaModerna;
import Model.SofaModerna;
import Model.cadastro.Cadastro;
import Model.interfaces.iSofa;

public class main {
    public static void main(String[] args) {

        iSofa sofa = new FabricaModerna().criarSofa();
        sofa.cad("3 lugares", "Chenile", 3);
        sofa.consultarCaracteristicas();
  
    }
}
