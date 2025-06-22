/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package receta;

/**
 *
 * @author Rodrigo Garcia
 */
public class Receta {
    private final Pollo pollo;
    private final Chile[] chiles;
    private final Tortilla[] tortillas;
    private final Salsa salsa;
    private final Rabano[] rabanos;
    private final Queso queso;
    private final Lechuga lechuga;
    private final Chef chef;
    private final Agua agua;
    private final Sal sal;
    private final Taza tazaAgua;
    private final Taza tazaCebollaOlla;
    private final Plato plato;
    private final Cuchara cucharaSal;
    private final Cocina cocina;
    private final Cilantro cilantro;
    private final Taza tazaCilantro;

    public Receta() {
        this.cocina = new Cocina();
        this.chef = new Chef(cocina); // Pasamos la cocina al chef
        this.pollo = new Pollo("Pechuga", 1); // 1 pechuga
        this.chiles = new Chile[4]; // 4 chiles
        this.tortillas = new Tortilla[3];// 3 tortillas para 3 enchiladas
        this.salsa = new Salsa(chef.getLicuadora()); // Pasamos la licuadora del chef
        this.rabanos = new Rabano[4];
        this.queso = new Queso(1, 4, "Cotija");
        this.lechuga = new Lechuga("Romana", 2.0);
        this.agua = new Agua(5, 2, "potable"); // 2 1/2 tazas de agua
        this.sal = new Sal(1, 2); // 1/2 cucharada de sal
        this.tazaAgua = new Taza();
        this.tazaCebollaOlla = new Taza();
        this.plato = new Plato();
        this.cucharaSal = new Cuchara();
        this.cilantro = new Cilantro(1, 4); // 1/4 taza de cilantro
        this.tazaCilantro = new Taza();

        inicializarIngredientes();
    }

    private void inicializarIngredientes() {
        for (int i = 0; i < chiles.length; i++) {
            chiles[i] = new Chile("Poblano");
        }
        for (int i = 0; i < tortillas.length; i++) {
            tortillas[i] = new Tortilla("Maiz");
        }
        for (int i = 0; i < rabanos.length; i++) {
            rabanos[i] = new Rabano();
        }
    }

    public void prepararPlatillo() {
        System.out.println("=== Iniciando preparacion de Enchiladas ===");
        System.out.println("Estado inicial de los ingredientes:");
        mostrarEstadoIngredientes();

        System.out.println("\nPreparando el pollo...");
        Olla olla = chef.getOlla();

        System.out.println("Agregando agua a la olla...");
        tazaAgua.llenar(agua);
        olla.agregar(tazaAgua);

        System.out.println("Calentando el agua...");
        olla.calentar();

        System.out.println("Agregando resto de ingredientes a la olla...");
        tazaCebollaOlla.llenar(new Cebolla(1, 2, "blanca")); // 1/2 taza de cebolla
        olla.agregar(pollo);
        olla.agregar(tazaCebollaOlla);

        System.out.println("Agregando cilantro a la olla...");
        tazaCilantro.llenar(cilantro);
        olla.agregar(tazaCilantro);

        System.out.println("Midiendo sal...");
        cucharaSal.llenar(sal); // Asegúrate de que esta línea existe y se ejecuta
        System.out.println("Agregando sal a la olla...");
        olla.agregar(cucharaSal);

        olla.cocinar();
        System.out.println(pollo);// mostramos estado del pollo
        System.out.println("\nDeshebranado el pollo...");
        pollo.deshebradar();
        System.out.println(pollo);// mostramos estado actualizado

        System.out.println("\nPreparando los chiles poblanos:");
        Comal comal = chef.getComal();
        comal.calentar();
        for (Chile chile : chiles) {
            System.out.println("- Asando chile poblano...");
            chile.asar(comal);
            System.out.println("- Limpiando chile poblano...");
            chile.limpiar();
        }

        System.out.println("\nPreparando la salsa...");
        salsa.preparar(chiles);

        System.out.println("\nPreparando las tortillas:");
        Sarten sarten = chef.getSarten();
        sarten.calentar();
        for (Tortilla tortilla : tortillas) {
            System.out.println("- Friendo tortilla...");
            tortilla.freir(sarten);
            System.out.println("- Rellenando tortilla con pollo...");
            tortilla.rellenar(pollo);
            System.out.println("- Enrollando tortilla...");
            tortilla.enrollar();
            plato.agregarTortilla(tortilla);
        }

        System.out.println("\nAgregando salsa a las enchiladas...");
        plato.vertirSalsa(salsa);

        System.out.println("\nPreparando y agregando guarnicion:");
        System.out.println("- Rallando lechuga...");
        lechuga.picar(chef.getCuchillo());
        plato.agregarGuarnicion(lechuga);

        System.out.println("- Cortando queso...");
        queso.cortar(chef.getCuchillo());
        plato.agregarGuarnicion(queso);

        System.out.println("- Rebanando rabanos...");
        for (Rabano rabano : rabanos) {
            rabano.rebanar(chef.getCuchillo());
            plato.agregarGuarnicion(rabano);
        }

        chef.limpiarUtensilios();

        System.out.println("\nEstado final de los ingredientes:");
        mostrarEstadoIngredientes();
        System.out.println("\nLas enchiladas estan listas!");
        System.out.println("Limpieza final de todos los utensilios:");
        chef.limpiarUtensilios();
    }

    private void mostrarEstadoIngredientes() {
        System.out.println("Pollo: " + pollo);
        System.out.println("Salsa: " + salsa);
        System.out.println("Queso: " + queso);
        System.out.println("Lechuga: " + lechuga);
        System.out.println("Chiles:");
        for (Chile chile : chiles) {
            System.out.println("  " + chile);
        }
        System.out.println("Tortillas:");
        for (Tortilla tortilla : tortillas) {
            System.out.println("  " + tortilla);
        }
        System.out.println("Rabanos:");
        for (Rabano rabano : rabanos) {
            System.out.println("  " + rabano);
        }
    }
}