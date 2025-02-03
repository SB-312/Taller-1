package edu.unisabana.pizzafactory.interfaces;

import edu.unisabana.pizzafactory.models.Tamano;

public interface Maquina {
    void amasar();
    void hornear();
    void moldear(Tamano tamano);
}
