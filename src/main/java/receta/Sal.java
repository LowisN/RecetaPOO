package receta;

public class Sal {
    private int numerador;
    private int denominador;
    
    public Sal(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }
    
    @Override
    public String toString() {
        return numerador + "/" + denominador + " cucharadas de sal";
    }
}
