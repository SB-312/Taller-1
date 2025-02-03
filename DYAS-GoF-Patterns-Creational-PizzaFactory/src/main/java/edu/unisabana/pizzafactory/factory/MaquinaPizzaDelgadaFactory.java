package edu.unisabana.pizzafactory.factory;

import edu.unisabana.pizzafactory.interfaces.Maquina;
import edu.unisabana.pizzafactory.models.MaquinaPizzaDelgada;

public class MaquinaPizzaDelgadaFactory extends MaquinaFactory {

    @Override
    public Maquina crearMaquina() {
        return new MaquinaPizzaDelgada();
    }
}
