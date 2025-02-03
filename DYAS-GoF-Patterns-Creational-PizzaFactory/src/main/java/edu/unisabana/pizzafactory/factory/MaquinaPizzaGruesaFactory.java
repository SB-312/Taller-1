package edu.unisabana.pizzafactory.factory;

import edu.unisabana.pizzafactory.interfaces.Maquina;
import edu.unisabana.pizzafactory.models.MaquinaPizzaGruesa;

public class MaquinaPizzaGruesaFactory extends MaquinaFactory {

    @Override
    public Maquina crearMaquina() {
        return new MaquinaPizzaGruesa();
    }
}
