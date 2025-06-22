package receta;

public class Pan {
    private String tipo;
    private boolean remojado;
    
    public Pan(String tipo) {
        this.tipo = tipo;
        this.remojado = false;
    }
    
    public void remojar(Leche leche, Crema crema) {
        if (remojado) {
            throw new IllegalStateException("El pan ya esta remojado");
        }
        this.remojado = true;
    }
    
    @Override
    public String toString() {
        return tipo;
    }
}
