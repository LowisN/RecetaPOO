/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package receta;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rodrigo Garcia
 */
public class Plato {
    private List<Tortilla> tortillas;
    private Salsa salsa;
    private List<Object> guarniciones;
    
    public Plato() {
        this.tortillas = new ArrayList<>();
        this.guarniciones = new ArrayList<>();
    }
    
    public void agregarTortilla(Tortilla tortilla) {
        System.out.println("Colocando " + tortilla + " en el plato");
        tortillas.add(tortilla);
    }
    
    public void vertirSalsa(Salsa salsa) {
        if (tortillas.isEmpty()) {
            throw new IllegalStateException("No hay tortillas en el plato");
        }
        System.out.println("Vertiendo salsa sobre las enchiladas");
        this.salsa = salsa;
    }
    
    public void agregarGuarnicion(Object guarnicion) {
        System.out.println("Agregando " + guarnicion + " al plato");
        guarniciones.add(guarnicion);
    }
}
