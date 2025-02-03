package edu.unisabana.pizzafactory.factory;

import edu.unisabana.pizzafactory.interfaces.Maquina;
import edu.unisabana.pizzafactory.models.MaquinaPizzaIntegral;

public class MaquinaPizzaIntegralFactory extends MaquinaFactory {

    @Override
    public Maquina crearMaquina() {
        return new MaquinaPizzaIntegral();
    }
}
