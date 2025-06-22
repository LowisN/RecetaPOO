/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package receta;

/**
 *
 * @author Rodrigo Garcia
 */
public class Chef {
    private final Cocina cocina;
    
    public Chef(Cocina cocina) {
        this.cocina = cocina;
    }
    
    public Licuadora getLicuadora() {
        return cocina.getLicuadora();
    }
    
    public Olla getOlla() {
        return cocina.getOlla();
    }
    
    public Comal getComal() {
        return cocina.getComal();
    }
    
    public Sarten getSarten() {
        return cocina.getSarten();
    }
    
    public Cuchillo getCuchillo() {
        return cocina.getCuchillo();
    }
    
    public void limpiarUtensilios() {
        cocina.limpiarUtensilios();
    }
    
    public void licuarSalsa() {
        getLicuadora().licuar();
    }
    
    public void asarChiles(Chile[] chiles) {
        for(Chile chile : chiles) {
            System.out.println("Asando chile: " + chile);
            getComal().asar(chile);
        }   
    }
    
    public void prepararChiles(Chile[] chiles) {
        for (Chile chile : chiles) {
            System.out.println("Asando chile...");
            Utileria.esperarMinutos(3);
            asarChiles(chiles);
        }
        System.out.println("Sudando chiles en bolsa...");
        Utileria.esperarMinutos(5);
        cocina.getBolsa().sudarChiles(chiles);
        for (Chile chile : chiles) {
            System.out.println("Pelando chile...");
            Utileria.esperarMinutos(2);
            chile.pelar(cocina.getBolsa());
        }
    }
}
