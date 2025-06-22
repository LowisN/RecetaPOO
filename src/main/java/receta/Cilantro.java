/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package receta;

/**
 *
 * @author Rodrigo Garcia
 */
public class Cilantro {
    private int numerador;
    private int denominador;
    
    public Cilantro(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }
    
    @Override
    public String toString() {
        return numerador + "/" + denominador + " taza de cilantro";
    }
}
