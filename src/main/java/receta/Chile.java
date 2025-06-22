/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package receta;

/**
 *
 * @author Rodrigo Garcia
 */
public class Chile {
    private final String tipo;
    private boolean asado;
    private boolean pelado;
    private boolean limpio;
    private boolean cortado;
    private boolean picado;

    public Chile(String tipo) {
        this.tipo = tipo;
        this.asado = false;
        this.pelado = false;
        this.limpio = false;
        this.cortado = false;
        this.picado = false;
    }

    public void asar(Comal comal) {
        if (asado) {
            throw new IllegalStateException("El chile ya esta asado");
        }
        comal.asar(this);
        this.asado = true;
    }

    public void pelar(BolsaZiploc bolsa) {
        if (!asado) {
            throw new IllegalStateException("El chile debe estar asado antes de pelarlo");
        }
        if (pelado) {
            throw new IllegalStateException("El chile ya esta pelado");
        }
        System.out.println("Metiendo " + this + " en la bolsa para que sude");
        bolsa.meter(this);
        Utileria.esperarMinutos(5);// 5 minutos para que sude
        bolsa.sacar(this);
        System.out.println("Pelando " + this + ", quitando la piel quemada");
        this.pelado = true;
    }

    public void limpiar() {
        this.limpio = true;
        System.out.println("> Chile poblano pelado y sin semillas");
    }

    // public void cortarEnTiras() {
    // this.cortado = true;
    // System.out.println("> Chile poblano cortado en tiras");
    // } para que cortar si se va a licuar

    public void picar(Cuchillo cuchillo) {
        if (picado) {
            throw new IllegalStateException("El chile ya esta picado");
        }
        System.out.println("Picando chile " + tipo);
        cuchillo.picar(this);
        picado = true;
    }

    @Override
    public String toString() {
        StringBuilder estado = new StringBuilder("Chile " + tipo);// con StringBuilder para no crear tantos objetos String
        if (asado)
            estado.append(" asado");// append para agregar al StringBuilder
        if (pelado)
            estado.append(" pelado");
        if (limpio)
            estado.append(" limpio");
        if (cortado)
            estado.append(" cortado");
        if (!asado && !pelado && !limpio && !cortado)
            estado.append(" crudo");// si no se ha hecho nada
        return estado.toString();
    }
}
