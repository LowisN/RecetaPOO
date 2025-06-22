/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package receta;

/**
 *
 * @author Rodrigo Garcia
 */
public class Comal {
    private boolean caliente;
    
    public Comal() {
        this.caliente = false;
    }
    
    public void calentar() {
        System.out.println("Calentando el comal...");
        Utileria.esperarMinutos(2);
        this.caliente = true;
    }
    
    public void asar(Chile chile) {
        if (!caliente) {
            throw new IllegalStateException("El comal no esta caliente");
        }
        System.out.println("> Asando " + chile + " en el comal");
        Utileria.esperarMinutos(5);
        System.out.println("> " + chile + " asado");
    }
    
    public void limpiar() {
        System.out.println("Limpiando el comal");
        this.caliente = false;
    }
}
