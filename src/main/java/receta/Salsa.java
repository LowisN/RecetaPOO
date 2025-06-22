/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package receta;

/**
 *
 * @author Rodrigo Garcia
 */
public class Salsa {
    private final Leche leche;
    private final Crema crema;
    private final Pan pan;
    private final Cacahuate cacahuate;
    private final Cebolla cebolla;
    private final Ajo ajo;
    private final Cuchillo cuchillo;
    private final Licuadora licuadora;
    private final Sarten sarten;
    private final Taza tazaLeche;
    private final Taza tazaCrema;
    private final Taza tazaCacahuate;
    private final Taza tazaCebolla;
    private boolean preparada;
    
    public Salsa(Licuadora licuadora) {
        this.leche = new Leche(1, 2, "entera"); // 1/2 taza
        this.crema = new Crema(1, 4, "acida"); // 1/4 taza
        this.pan = new Pan("bolillo"); // 1/2 bolillo
        this.cacahuate = new Cacahuate(1, 4); // 1/4 taza
        this.cebolla = new Cebolla(1, 2, "blanca"); // 1/2 taza
        this.ajo = new Ajo(2); // 2 dientes
        this.cuchillo = new Cuchillo();
        this.licuadora = licuadora;
        this.sarten = new Sarten();
        this.tazaLeche = new Taza();
        this.tazaCrema = new Taza();
        this.tazaCacahuate = new Taza();
        this.tazaCebolla = new Taza();
        this.preparada = false;
    }

    public void preparar(Chile[] chiles) {
        remojarPan();
        prepararIngredientes(chiles);
        licuar(chiles);
        cocinar();
        this.preparada = true;
    }

    private void remojarPan() {
        System.out.println("Midiendo leche y crema...");
        tazaLeche.llenar(this.leche);
        tazaCrema.llenar(this.crema);
        
        System.out.println("Remojando " + this.pan + " en la leche y crema medidas");
        this.pan.remojar((Leche)tazaLeche.vaciar(), (Crema)tazaCrema.vaciar());
        Utileria.esperarMinutos(5);//5 minutos para remojar el pan
    }

    private void prepararIngredientes(Chile[] chiles) {
        System.out.println("Preparando ingredientes para la salsa");
        
        System.out.println("Preparando chiles...");
        for (Chile chile : chiles) {
            chile.picar(cuchillo);
        }
        
        System.out.println("Midiendo cebolla...");
        tazaCebolla.llenar(this.cebolla);
        this.cebolla.picar(cuchillo);
        
        System.out.println("Midiendo cacahuates...");
        tazaCacahuate.llenar(this.cacahuate);
        this.cacahuate.picar(cuchillo);
        
        this.ajo.picar(cuchillo);
    }

    private void licuar(Chile[] chiles) {
        System.out.println("Agregando ingredientes a la licuadora...");
        for (Chile chile : chiles) {
            licuadora.agregar(chile);
        }
        licuadora.agregar(tazaCebolla.vaciar());
        licuadora.agregar(tazaCacahuate.vaciar());
        licuadora.agregar(this.pan);
        licuadora.agregar(this.ajo);
        
        System.out.println("Licuando ingredientes...");
        licuadora.licuar();
        Utileria.esperarMinutos(3);//3 minutos para licuar todo
    }

    private void cocinar() {
        System.out.println("Preparando sarten para cocinar...");
        sarten.calentar();
        sarten.agregar(licuadora.obtenerContenido());
        sarten.cocinar();
        System.out.println("Salsa lista!");
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;

        Salsa otra = (Salsa) obj;
        return otra.preparada == preparada &&
               otra.leche.equals(leche) &&
               otra.crema.equals(crema) &&
               otra.pan.equals(pan) &&
               otra.cacahuate.equals(cacahuate) &&
               otra.cebolla.equals(cebolla) &&
               otra.ajo.equals(ajo);
    }

    @Override
    public String toString() {
        return "Salsa{" +
                "leche=" + leche +
                ", crema=" + crema +
                ", pan='" + pan + '\'' +
                ", preparada=" + preparada +
                '}';
    }
}
