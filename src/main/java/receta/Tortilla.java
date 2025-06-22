/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package receta;

/**
 *
 * @author Rodrigo Garcia
 */
public class Tortilla {
    private final String tipo;
    private boolean frita;
    private boolean rellena;
    private boolean enrollada;

    public Tortilla(String tipo) {
        this.tipo = tipo;
        this.frita = false;
        this.rellena = false;
        this.enrollada = false;
    }

    public void freir(Sarten sarten) {
        if (frita) {
            throw new IllegalStateException("La tortilla ya esta frita");
        }
        sarten.freir(this);
        this.frita = true;
    }

    public void rellenar(Pollo pollo) {
        this.rellena = true;
    }

    public void enrollar() {
        this.enrollada = true;
    }
    
    @Override
    public String toString() {
        return "Tortilla de " + tipo + 
               " [frita=" + frita + 
               ", rellena=" + rellena + 
               ", enrollada=" + enrollada + "]";
    }
}
