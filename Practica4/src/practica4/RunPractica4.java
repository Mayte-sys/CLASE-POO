/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica4;
import animales.*;

/**
 *
 * @author marga
 */
public class RunPractica4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Animal a = new Animal("Manchas");
        Cerdo c = new Cerdo("Peppa Ping");
        Rana r = new Rana ("Rene");
        
        a.mostrarNombre();
        a.hacerSonido();
        System.out.println(a.comer());
        
        c.mostrarNombre();
        System.out.println(c.comer());
        c.hacerSonido();
        
        r.mostrarNombre();
        r.hacerSonido();
        System.out.println(r.comer());
        r.saltar();
    }
}
