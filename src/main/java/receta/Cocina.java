package receta;

public class Cocina {
    private final Cuchillo cuchillo;
    private final Licuadora licuadora;
    private final Comal comal;
    private final BolsaZiploc bolsa;
    private final Olla olla;
    private final Sarten sarten;
    private final Taza taza;
    private final Cuchara cuchara;

    public Cocina() {
        this.cuchillo = new Cuchillo();
        this.licuadora = new Licuadora();
        this.comal = new Comal();
        this.bolsa = new BolsaZiploc();
        this.olla = new Olla();
        this.sarten = new Sarten();
        this.taza = new Taza();
        this.cuchara = new Cuchara();
    }

    public Cuchillo getCuchillo() {
        return cuchillo;
    }

    public Licuadora getLicuadora() {
        return licuadora;
    }

    public Comal getComal() {
        return comal;
    }

    public BolsaZiploc getBolsa() {
        return bolsa;
    }

    public Olla getOlla() {
        return olla;
    }

    public Sarten getSarten() {
        return sarten;
    }

    public Taza getTaza() {
        return taza;
    }

    public Cuchara getCuchara() {
        return cuchara;
    }

    public void limpiarUtensilios() {
        System.out.println("Limpiando todos los utensilios de la cocina...");
        Utileria.esperarMinutos(2);
        cuchillo.limpiar();
        licuadora.limpiar();
        comal.limpiar();
        olla.limpiar();
        sarten.limpiar();
        taza.limpiar();
        cuchara.limpiar();
    }
}
