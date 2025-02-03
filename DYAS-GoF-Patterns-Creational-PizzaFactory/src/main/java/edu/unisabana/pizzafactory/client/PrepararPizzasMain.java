package edu.unisabana.pizzafactory.client;

import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import edu.unisabana.pizzafactory.factory.MaquinaFactory;
import edu.unisabana.pizzafactory.factory.MaquinaPizzaDelgadaFactory;
import edu.unisabana.pizzafactory.factory.MaquinaPizzaGruesaFactory;
import edu.unisabana.pizzafactory.factory.MaquinaPizzaIntegralFactory;
import edu.unisabana.pizzafactory.interfaces.Maquina;
import edu.unisabana.pizzafactory.models.Ingrediente;
import edu.unisabana.pizzafactory.models.Tamano;

public class PrepararPizzasMain {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        Ingrediente[] ingredientes = new Ingrediente[] {
            new Ingrediente("queso", 1),
            new Ingrediente("jamon", 2)
        };

        MaquinaFactory factoryDelgada = new MaquinaPizzaDelgadaFactory();
        MaquinaFactory factoryGruesa = new MaquinaPizzaGruesaFactory();
        MaquinaFactory factoryIntegral = new MaquinaPizzaIntegralFactory();

        Maquina maquina;
        PrepararPizzasMain ppm = new PrepararPizzasMain();

        while (true) {
            System.out.println("Seleccione el tipo de pizza que desea preparar:");
            System.out.println("1. Pizza Delgada");
            System.out.println("2. Pizza Gruesa");
            System.out.println("3. Pizza Integral");
            System.out.println("4. Salir");
            int opcion = scanner.nextInt();

            if (opcion == 4) {
                System.out.println("Saliendo...");
                scanner.close();
                return;
            }

            Tamano tamano = ppm.escogerTamano();

            switch (opcion) {
                case 1:
                    maquina = factoryDelgada.crearMaquina();
                    ppm.prepararPizza(maquina, ingredientes, tamano);
                    break;
                case 2:
                    maquina = factoryGruesa.crearMaquina();
                    ppm.prepararPizza(maquina, ingredientes, tamano);
                    break;
                case 3:
                    maquina = factoryIntegral.crearMaquina();
                    ppm.prepararPizza(maquina, ingredientes, tamano);
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
            }
        }
    }

    public Tamano escogerTamano() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione el tamaño de la pizza:");
        System.out.println("1. Pequeño");
        System.out.println("2. Mediano");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                return Tamano.PEQUENO;
            case 2:
                return Tamano.MEDIANO;
            default:
                System.out.println("Opción no válida. Por favor, intente de nuevo.");
                return escogerTamano();
        }
    }

    public void prepararPizza(Maquina maquina, Ingrediente[] ingredientes, Tamano tamano) {
        maquina.amasar();
        maquina.moldear(tamano);
        aplicarIngredientes(ingredientes);
        maquina.hornear();
    }

    public void aplicarIngredientes(Ingrediente[] ingredientes) {
        Logger.getLogger(PrepararPizzasMain.class.getName())
                .log(Level.INFO, "APLICANDO INGREDIENTES!:{0}", Arrays.toString(ingredientes));
    }
}
