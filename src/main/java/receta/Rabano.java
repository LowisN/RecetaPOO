/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package receta;

/**
 *
 * @author Rodrigo Garcia
 */
public class Rabano {
    private boolean rebanado;

    public Rabano() {
        this.rebanado = false;
    }

    public void rebanar(Cuchillo cuchillo) {
        if (rebanado) {
            throw new IllegalStateException("El rabano ya esta rebanado");
        }
        System.out.println("Rebanando " + this);
        cuchillo.rebanar(this);
        this.rebanado = true;
    }

    @Override
    public String toString() {
        return "Rabano" + (rebanado ? " rebanado" : " sin rebanar");
    }
}
