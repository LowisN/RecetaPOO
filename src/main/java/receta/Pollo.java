/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package receta;

/**
 *
 * @author Rodrigo Garcia
 */
public class Pollo {
    private final String pieza;
    private final int cantidad;
    private boolean cocido;
    private boolean deshebrado;
    private boolean sazonado;

    public Pollo(String pieza, int cantidad) {
        this.pieza = pieza.toLowerCase();
        this.cantidad = cantidad;
        this.cocido = false;
        this.deshebrado = false;
        this.sazonado = false;
    }

    public void cocinar() {
        System.out.println("Agregando sal al " + pieza + " de pollo");
        this.sazonado = true;
        System.out.println("Cocinando " + cantidad + " pieza de " + pieza);
        Utileria.esperarMinutos(15);//15 minutos para cocinar el pollo
        this.cocido = true;
    }

    public void deshebradar() {
        if (!cocido) {
            System.out.println("Error! El pollo debe estar cocido antes de deshebrar");
            return;
        }
        System.out.println("Deshebranado " + pieza + " de pollo");
        Utileria.esperarMinutos(5); // 5 minutos para deshebrar
        this.deshebrado = true;
    }

    @Override
    public String toString() {
        return "Pollo{" + "pieza=" + pieza + ", cantidad=" + cantidad + ", cocido=" + cocido + ", deshebrado=" + deshebrado + ", sazonado=" + sazonado + '}';
    }

    
}
