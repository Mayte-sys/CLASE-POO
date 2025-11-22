/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica2;

import Trasportes.Automovil;
import Trasportes.Carro;

/**
 *
 * @author marga
 */
public class RunPractica2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Automovil auto = new Automovil();
        auto.setMarca("Ford");
        System.out.println("El automovil marca " + auto.getMarca());
        auto.encenderMotor();
        System.out.println(auto.avanzar());
        System.out.println(auto.estacionado());
        System.out.println("-----------Carro tarus------------");
        Carro tarus = new Carro();
        tarus.encenderMotor();
        tarus.displayInfo();
        tarus.avanzar();
        System.out.println("-----------Carro topaz------------");
        Carro topaz = new Carro("Ford", "2025", "Azul", 19.3);
        topaz.encenderMotor();
        topaz.displayInfo();
        topaz.avanzar();
        topaz.gasolina();  
    }
}
