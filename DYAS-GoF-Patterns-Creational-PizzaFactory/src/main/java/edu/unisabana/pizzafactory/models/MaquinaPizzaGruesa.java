package edu.unisabana.pizzafactory.models;

import java.util.logging.Level;
import java.util.logging.Logger;

import edu.unisabana.pizzafactory.interfaces.Maquina;


public class MaquinaPizzaGruesa implements Maquina {
    @Override
    public void amasar() {
        Logger.getLogger(MaquinaPizzaIntegral.class.getName())
                .log(Level.INFO, "[@@] Amasando pizza de masa gruesa.");
    }

    @Override
    public void hornear() {
        Logger.getLogger(MaquinaPizzaIntegral.class.getName())
                .log(Level.INFO, "[~~] Horneando pizza de masa gruesa.");
    }

    @Override
    public void moldear(Tamano tamano) {
        if (tamano == Tamano.PEQUENO) {
            Logger.getLogger(MaquinaPizzaIntegral.class.getName())
                    .log(Level.INFO, "[O] Moldeando pizza pequena de masa gruesa.");
        } else if (tamano == Tamano.MEDIANO) {
            Logger.getLogger(MaquinaPizzaIntegral.class.getName())
                    .log(Level.INFO, "[O] Moldeando pizza mediana de masa gruesa.");
        } else {
            Logger.getLogger(MaquinaPizzaIntegral.class.getName())
                    .log(Level.INFO, "INFO: Tamano de pizza no soportado" + tamano);
        }
    }
}
