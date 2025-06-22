package receta;

public class Cebolla {
    private int numerador;
    private int denominador;
    private String tipo;
    private boolean picada;
    
    public Cebolla(int numerador, int denominador, String tipo) {
        this.numerador = numerador;
        this.denominador = denominador;
        this.tipo = tipo;
        this.picada = false;
    }
    
    public void picar(Cuchillo cuchillo) {
        if (picada) {
            throw new IllegalStateException("La cebolla ya esta picada");
        }
        cuchillo.picar(this);
        picada = true;
    }
    
    public boolean estaPicada() {
        return picada;
    }
    
    @Override
    public String toString() {
        return numerador + "/" + denominador + " taza de cebolla " + tipo;
    }
}
