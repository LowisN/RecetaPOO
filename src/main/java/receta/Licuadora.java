/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package receta;

import java.util.List;//voy usar listas para los ingredientes que entran
import java.util.ArrayList;

/**
 *
 * @author Rodrigo Garcia
 */
public class Licuadora {
    private boolean encendida;
    private boolean limpia;
    private List<Object> ingredientes;
    private Leche leche;
    private Crema crema;
    private Pan pan;
    private Cebolla cebolla;
    private Ajo ajo;
    
    public Licuadora() {
        this.encendida = false;
        this.limpia = true;
        this.ingredientes = new ArrayList<>();
    }
    
    public void licuar(Leche leche, Crema crema, Pan pan, Cebolla cebolla, Ajo ajo) {
        this.leche = leche;
        this.crema = crema;
        this.pan = pan;
        this.cebolla = cebolla;
        this.ajo = ajo;
        
        this.encendida = true;
        System.out.println("Licuando: " + pan + ", " + cebolla + ", " + ajo + " con " + leche + " y " + crema);
        Utileria.esperarMinutos(3);
        this.encendida = false;
        this.limpia = false;
    }
    
    public void limpiar() {
        System.out.println("Lavando la licuadora");
        this.limpia = true;
    }
    
    public void agregar(Object ingrediente) {
        System.out.println("Agregando a la licuadora: " + ingrediente);
        ingredientes.add(ingrediente);
    }
    
    public void licuar() {
        if (ingredientes.isEmpty()) {
            throw new IllegalStateException("La licuadora esta vacia");
        }
        System.out.println("Licuando " + ingredientes.size() + " ingredientes");
    }
    
    public SalsaLicuada obtenerContenido() {
        if (ingredientes.isEmpty()) {
            throw new IllegalStateException("La licuadora esta vacia");
        }
        SalsaLicuada salsaLicuada = new SalsaLicuada(new ArrayList<>(ingredientes));
        ingredientes.clear();
        return salsaLicuada;
    }
}
