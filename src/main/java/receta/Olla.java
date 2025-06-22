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
public class Olla {
    private List<Object> contenido;
    private boolean caliente;
    
    public Olla() {
        this.caliente = false;
        this.contenido = new ArrayList<>();
    }
    
    public void calentar() {
        System.out.println("Calentando la olla con agua...");
        Utileria.esperarMinutos(5);
        this.caliente = true;
    }
    
    public void agregar(Pollo pollo) {
        System.out.println("Agregando a la olla: " + pollo);
        contenido.add(pollo);
    }
      public void agregar(Taza taza) {
        if (taza.estaVacia()) {
            throw new IllegalStateException("No se puede agregar una taza vacia");
        }
        Object contenidoTaza = taza.vaciar();
        System.out.println("Agregando a la olla: " + contenidoTaza);
        contenido.add(contenidoTaza);
    }    public void agregar(Cuchara cuchara) {
        if (cuchara.estaVacia()) {
            throw new IllegalStateException("No se puede agregar una cuchara vacia");
        }
        Object contenidoCuchara = cuchara.vaciar();
        System.out.println("Agregando a la olla: " + contenidoCuchara);
        contenido.add(contenidoCuchara);
    }

    public void cocinar() {
        if (contenido.isEmpty()) {
            throw new IllegalStateException("La olla esta vacia");
        }
        System.out.println("Cocinando ingredientes en la olla...");
        Utileria.esperarMinutos(20);// 20 minutos para cocinar el pollo
        
        // nbuscar el pollo entre los ingredientes y cocinarlo
        for (Object ingrediente : contenido) {
            if (ingrediente instanceof Pollo pollo) {//revisar esto con el profe
                pollo.cocinar();
            }
        }
    }
    
    public void limpiar() {
        System.out.println("Limpiando la olla");
        this.contenido = null;
        this.caliente = false;
    }

}
