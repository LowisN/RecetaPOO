/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package receta;

/**
 *
 * @author Rodrigo Garcia
 */
public class Lechuga {
    private String tipo;
    private double tazas;
    private boolean rallada;

    public Lechuga(String tipo, double tazas) {
        this.tipo = tipo;
        this.tazas = tazas;
        this.rallada = false;
    }

    public void picar(Cuchillo cuchillo) {
        if (rallada) {
            throw new IllegalStateException("La lechuga ya esta rallada");
        }
        System.out.println("Picando " + this);
        cuchillo.picar(this);
        this.rallada = true;
    }

    @Override
    public String toString() {
        return tazas + " tazas de lechuga " + tipo + (rallada ? " rallada" : " sin rallar");
    }
}
