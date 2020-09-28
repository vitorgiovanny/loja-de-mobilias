package Model.Classes.Concretos.fabrica;

import Model.CadeiraVitorioso;
import Model.MesaCentroVitorioso;
import Model.SofaVitorioso;
import Model.interfaces.iCadeira;
import Model.interfaces.iFabricaAbstrata;
import Model.interfaces.iMesaCentro;
import Model.interfaces.iSofa;

/**
 *
 * @author vitor
 */
public class FabricaVitorioso implements iFabricaAbstrata{

    @Override
    public iSofa criarSofa() {
       return new SofaVitorioso();
    }

    @Override
    public iCadeira criarCadeira() {
        return new CadeiraVitorioso();
    }

    @Override
    public iMesaCentro criarMesaCentro() {
        return new MesaCentroVitorioso();
    }
    
}
