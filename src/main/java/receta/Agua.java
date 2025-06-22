/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package receta;

/**
 *
 * @author Rodrigo Garcia
 */
public class Agua {
    private int numerador;
    private int denominador;
    private String tipo;
    
    public Agua(int numerador, int denominador, String tipo) {
        this.numerador = numerador;
        this.denominador = denominador;
        this.tipo = tipo;
    }
    
    @Override
    public String toString() {
        return numerador + "/" + denominador + " tazas de agua " + tipo;
    }
}
