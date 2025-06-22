/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package receta;

/**
 *
 * @author Rodrigo Garcia
 */
public class BolsaZiploc {
    private boolean usada;
    private Object contenido;
    
    public BolsaZiploc() {
        this.usada = false;
        this.contenido = null;
    }
    
    public void sudarChiles(Chile[] chiles) {
        System.out.println("Colocando " + chiles.length + " chiles calientes en la bolsa para que suden");
        System.out.println("Cerrando la bolsa hermeticamente");
        System.out.println("Dejando sudar los chiles para facilitar el pelado");
        Utileria.esperarMinutos(10); //10 minutos para que suden los chiles
        this.usada = true;
    }
    
    public void meter(Object ingrediente) {
        if (contenido != null) {
            throw new IllegalStateException("La bolsa ya contiene algo");
        }
        this.contenido = ingrediente;
    }
    
    public void sacar(Object ingrediente) {
        if (contenido != ingrediente) {
            throw new IllegalStateException("Este ingrediente no esta en la bolsa");
        }
        this.contenido = null;
    }
}
