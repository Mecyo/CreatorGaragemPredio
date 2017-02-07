/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creatorgaragempredio;

import interfaces.ICarro;
import interfaces.IGaragem;

/**
 *
 * @author Emerson
 */
public class GaragemPredio implements IGaragem{
    ICarro carro;
    @Override
    public String estacionar(ICarro carro) {
        this.carro = carro;
        return "Carro " + carro.toString() + " estacionado na Garagem Predio";
    }

    @Override
    public Boolean isEstacionado() {
        return this.carro == null;
    }
    
    @Override
    public String toString() {
        return "Garagem Prédio";
    }
    
}
