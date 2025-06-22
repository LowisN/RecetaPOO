/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package receta;

/**
 *
 * @author Rodrigo Garcia
 */
public class Taza {
    private Object contenido;
    private boolean vacia;
    
    public Taza() {
        this.vacia = true;
    }
    
    public void llenar(Agua agua) {
        verificarTazaVacia();
        this.contenido = agua;
        this.vacia = false;
    }
    
    public void llenar(Leche leche) {
        verificarTazaVacia();
        this.contenido = leche;
        this.vacia = false;
    }
    
    public void llenar(Cacahuate cacahuate) {
        verificarTazaVacia();
        this.contenido = cacahuate;
        this.vacia = false;
    }
    
    public void llenar(Cebolla cebolla) {
        verificarTazaVacia();
        this.contenido = cebolla;
        this.vacia = false;
    }
    
    public void llenar(Crema crema) {
        verificarTazaVacia();
        this.contenido = crema;
        this.vacia = false;
    }
    
    public void llenar(Cilantro cilantro) {
        verificarTazaVacia();
        this.contenido = cilantro;
        this.vacia = false;
    }
    
    private void verificarTazaVacia() {
        if (!vacia) {
            throw new IllegalStateException("La taza ya contiene liquido");
        }
    }
    
    public Object vaciar() {
        if (vacia) {
            throw new IllegalStateException("La taza esta vacia");
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
        System.out.println("Limpiando la taza");
        this.vacia = true;
        this.contenido = null;
    }
}
