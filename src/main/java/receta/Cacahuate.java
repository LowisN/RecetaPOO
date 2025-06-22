package receta;

public class Cacahuate {
    private int numerador;
    private int denominador;
    private boolean picado;

    public Cacahuate(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public void picar(Cuchillo cuchillo) {
        if (picado) {
            throw new IllegalStateException("El cacahuate ya esta picado");
        }
        cuchillo.picar(this);
        picado = true;
    }

    @Override
    public String toString() {
        return numerador + "/" + denominador + " taza de cacahuates";
    }
}
