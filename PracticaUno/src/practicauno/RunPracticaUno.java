/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicauno;

import Calculadora.Calculadora;

/**
 *
 * @author marga
 */
public class RunPracticaUno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Calculadora casio = new Calculadora();
        System.out.println("El resultado de la suma es: " + casio.suma(10,60));
        System.out.println("El resultado de la resta es: " + casio.resta(10,60));
        System.out.println("El resultado de la multiplicacion es: " + casio.multiplicacion(10,60));
        casio.division(10, 60);
    }
    
}
