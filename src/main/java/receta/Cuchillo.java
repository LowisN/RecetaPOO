/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package receta;

/**
 *
 * @author Rodrigo Garcia
 */
public class Cuchillo {
    private boolean afilado;
    private boolean limpio;
    
    public Cuchillo() {
        this.afilado = true;
        this.limpio = true;
    }
    
    public void picar(Cebolla cebolla) {
        System.out.println("Picando cebolla en trozos pequenios");
        this.limpio = false;
    }
    
    public void picar(Ajo ajo) {
        System.out.println("Picando " + ajo.getDientes() + " dientes de ajo finamente");
        this.limpio = false;
    }
    
    public void picar(Chile chile) {
        System.out.println("Picando chile en trozos");
        this.limpio = false;
    }
    
    public void picar(Lechuga lechuga) {
        System.out.println("Picando lechuga en tiras finas");
        this.limpio = false;
    }
    
    public void cortar(Queso queso) {
        System.out.println("Cortando queso en trozos pequenios");
        this.limpio = false;
    }
    
    public void rebanar(Rabano rabano) {
        System.out.println("Rebanando rabano en rodajas finas");
        this.limpio = false;
    }
    
    public void picar(Cacahuate cacahuate) {
        System.out.println("Picando cacahuates en trozos pequenios");
        this.limpio = false;
    }
    
    public void limpiar() {
        System.out.println("Limpiando el cuchillo");
        this.limpio = true;
    }
}
