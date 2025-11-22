/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica5;

import animales.Delfin;
import animales.Leon;
import animales.Mariposa;
/**
 *
 * @author marga
 */
public class RunPractica5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        Delfin d = new Delfin("flipper");
        Mariposa m = new Mariposa("Monarca");
        Leon l = new Leon ("Rey Leon");
        
        System.out.println("Delfin " + d.respirar());
        d.despertar();
        d.hacerSonido();
        d.comer();
        d.nadar();
        
        System.out.println("Mariposa " + m.respirar());
        m.despertar();
        m.hacerSonido();
        m.comer();
        m.volar();
        
        System.out.println("Leon" + l.respirar());
        l.despertar();
        l.hacerSonido();
        l.comer();
        System.out.println(l.cazar());
    }
}
