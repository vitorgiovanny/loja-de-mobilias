
package Model.Classes.Concretos.fabrica;

import Model.CadeiraArtDeco;
import Model.MesaCentroArtDeco;
import Model.SofaArtDeco;
import Model.interfaces.iCadeira;
import Model.interfaces.iFabricaAbstrata;
import Model.interfaces.iMesaCentro;
import Model.interfaces.iSofa;


public class FabricaArtDeco implements iFabricaAbstrata {

    @Override
    public iSofa criarSofa() {
        return new SofaArtDeco();
    }

    @Override
    public iCadeira criarCadeira() {
        return new CadeiraArtDeco();
    }

    @Override
    public iMesaCentro criarMesaCentro() {
        return new MesaCentroArtDeco();
    }
    
}
