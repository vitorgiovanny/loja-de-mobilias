/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Classes.Concretos.fabrica;

import Model.SofaModerna;
import Model.interfaces.iCadeira;
import Model.interfaces.iFabricaAbstrata;
import Model.interfaces.iMesaCentro;
import Model.interfaces.iSofa;
import Model.CadeiraModerna;
import Model.MesaCentroModerna;
import Model.SofaModerna;
/**
 *
 * @author vitor
 */
public class FabricaModerna implements iFabricaAbstrata{

    @Override
    public iSofa criarSofa() {
        return new SofaModerna();
    }

    @Override
    public iCadeira criarCadeira() {
        return new CadeiraModerna();
    }

    @Override
    public iMesaCentro criarMesaCentro() {
       return new MesaCentroModerna();
    }
    
}
