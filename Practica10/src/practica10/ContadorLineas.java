/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica10;

/**
 *
 * @author marga
 */
public class ContadorLineas extends Thread{
    
    private Contador contador;
    private Thread[] lectura;
    
    public ContadorLineas(Contador contador, Thread... lectura) {
        this.contador = contador;
        this.lectura = lectura;
    }
    
    @Override
    public void run() {
        try {
            // Esperar a que todos los lectores terminen
            for (Thread lector : lectura) {
                lector.join();
            }
            System.out.println("\nTotal de lineas leidas: " + contador.getTotalLineas());
        } catch (InterruptedException excep) {
            excep.printStackTrace();
        }
    }
}
