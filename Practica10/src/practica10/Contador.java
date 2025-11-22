/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica10;

/**
 *
 * @author marga
 */
public class Contador {
    private int total = 0;
    
    public synchronized void agregarLineas(int cantidad) {
        total += cantidad;
    }

    public int getTotalLineas() {
        return total;
    }
    
}
