/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica10;

/**
 *
 * @author marga
 */
public class RunPractica10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Contador contador = new Contador();
        LectorArchivo hilo1 = new LectorArchivo("sucursal1.txt", 1, contador);
        LectorArchivo hilo2 = new LectorArchivo("sucursal2.txt", 2, contador);
        LectorArchivo hilo3 = new LectorArchivo("sucursal3.txt", 3, contador);
        ContadorLineas hilo4 = new ContadorLineas(contador, hilo1, hilo2, hilo3);
        
        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();
    } 
}
