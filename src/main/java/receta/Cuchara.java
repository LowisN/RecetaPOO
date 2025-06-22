/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package receta;

/**
 *
 * @author Rodrigo Garcia
 */
public class Cuchara {
    private Object contenido;
    private boolean vacia;
    
    public Cuchara() {
        this.vacia = true;
    }
    
    public void llenar(Object ingrediente) {
        if (!vacia) {
            throw new IllegalStateException("La cuchara ya contiene algo");
        }
        System.out.println("Llenando cuchara con " + ingrediente);
        this.contenido = ingrediente;
        this.vacia = false;
    }
    
    public Object vaciar() {
        if (vacia) {
            throw new IllegalStateException("La cuchara esta vacia");
        }
        Object contenidoActual = this.contenido;
        this.contenido = null;
        this.vacia = true;
        return contenidoActual;
    }
    
    public boolean estaVacia() {
        return vacia;
    }
    
    public void limpiar() {
        System.out.println("Limpiando la cuchara");
        this.contenido = null;
        this.vacia = true;
    }
}
