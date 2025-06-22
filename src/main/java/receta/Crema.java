package receta;

public class Crema {
    private int numerador;
    private int denominador;
    private String tipo;

    public Crema(int numerador, int denominador, String tipo) {
        this.numerador = numerador;
        this.denominador = denominador;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return numerador + "/" + denominador + " taza de crema " + tipo;
    }
}
