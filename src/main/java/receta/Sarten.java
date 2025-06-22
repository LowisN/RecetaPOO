/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package receta;

/**
 *
 * @author Rodrigo Garcia
 */
public class Sarten {
    private Object contenido;
    private boolean caliente;
    
    public Sarten() {
        this.caliente = false;
    }
    
    public void calentar() {
        System.out.println("Calentando el sarten...");
        Utileria.esperarMinutos(2); //2 minutos para calentar
        this.caliente = true;
    }
    
    public void agregar(Object contenido) {
        if (!caliente) {
            throw new IllegalStateException("El sarten no esta caliente");
        }
        if (this.contenido != null) {
            throw new IllegalStateException("El sarten ya tiene contenido");
        }
        System.out.println("Vertiendo en el sarten caliente: " + contenido);
        this.contenido = contenido;
    }
    
    public void agregar(Tortilla tortilla) {
        if (!caliente) {
            throw new IllegalStateException("El sarten no esta caliente");
        }
        if (this.contenido != null) {
            throw new IllegalStateException("El sarten ya tiene contenido");
        }
        System.out.println("Vertiendo en el sarten caliente: " + contenido);
        this.contenido = tortilla;
    }

    public void agregar(SalsaLicuada salsa) {
        if (!caliente) {
            throw new IllegalStateException("El sarten no esta caliente");
        }
        if (this.contenido != null) {
            throw new IllegalStateException("El sarten ya tiene contenido");
        }
        System.out.println("Vertiendo la salsa licuada en el sarten caliente");
        this.contenido = salsa;
    }

    public void cocinar() {
        if (contenido == null) {
            throw new IllegalStateException("El sarten esta vacio");
        }
        System.out.println("Cocinando en el sarten hasta espesar...");
        Utileria.esperarMinutos(10); //10 minutos para que espese
    }
    
    public void freir(Tortilla tortilla) {
        if (!caliente) {
            throw new IllegalStateException("El sarten no esta caliente");
        }
        System.out.println("Friendo " + tortilla + " en el sarten");
        Utileria.esperarMinutos(2); //2 minutos para freír cada tortilla
    }
    
    public void limpiar() {
        System.out.println("Limpiando el sarten");
        this.contenido = null;
        this.caliente = false;
    }
}
