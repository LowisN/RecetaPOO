/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package receta;

/**
 *
 * @author Rodrigo Garcia
 */
public class Utileria {
    
    public static void esperarMinutos(int minutos) {
        try {
            //Simulamos que cada minuto es un segundo para no esperar tanto
            Thread.sleep(minutos * 1000);
        } catch (InterruptedException e) {
            System.out.println("Se interrumpio la espera");
            Thread.currentThread().interrupt();
        }
    }
    
}
