package receta;

import java.util.List;

public class SalsaLicuada {
    private final List<Object> ingredientes;
    
    public SalsaLicuada(List<Object> ingredientes) {
        this.ingredientes = ingredientes;
    }
    
    @Override
    public String toString() {
        return "Salsa licuada con " + ingredientes.size() + " ingredientes";
    }
}
