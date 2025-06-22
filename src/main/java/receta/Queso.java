/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package receta;

/**
 *
 * @author Rodrigo Garcia
 */
public class Queso {
    private int numerador;
    private int denominador;
    private String tipo;
    private boolean cortado;

    public Queso(int numerador, int denominador, String tipo) {
        this.numerador = numerador;
        this.denominador = denominador;
        this.tipo = tipo;
        this.cortado = false;
    }

    public void cortar(Cuchillo cuchillo) {
        if (cortado) {
            throw new IllegalStateException("El queso ya esta cortado");
        }
        System.out.println("Cortando " + this);
        cuchillo.cortar(this);
        this.cortado = true;
    }

    @Override
    public String toString() {
        return "Queso{" + "numerador=" + numerador + ", denominador=" + denominador + ", tipo=" + tipo + ", cortado=" + cortado + '}';
    }

}
