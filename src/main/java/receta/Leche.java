package receta;

public class Leche {
    private int numerador;
    private int denominador;
    private String tipo;
    
    public Leche(int numerador, int denominador, String tipo) {
        this.numerador = numerador;
        this.denominador = denominador;
        this.tipo = tipo;
    }
    
    @Override
    public String toString() {
        return numerador + "/" + denominador + " taza de leche " + tipo;
    }
}
