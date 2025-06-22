package receta;

public class Ajo {
    private final int dientes;
    private boolean picado;

    public Ajo(int dientes) {
        this.dientes = dientes;
        this.picado = false;
    }

    public int getDientes() {
        return dientes;
    }

    public void picar(Cuchillo cuchillo) {
        if (picado) {
            throw new IllegalStateException("El ajo ya esta picado");
        }
        cuchillo.picar(this);
        picado = true;
    }

    @Override
    public String toString() {
        return dientes + " dientes de ajo" + (picado ? " picados" : "");
    }
}
