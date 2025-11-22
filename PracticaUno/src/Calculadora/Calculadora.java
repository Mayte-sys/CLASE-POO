/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculadora;

/**
 *
 * @author marga
 */
public class Calculadora {
   
    public double suma(double a, double b){
        return a + b;
    }
    public double resta(double a, double b){
        return a - b;
    }
    public double multiplicacion(double a, double b){
        return a * b;
    }
    public void division(double a, double b){
        if(b == 0)
            System.out.println("No se puede dividir entre 0");
        else
            System.out.println("El resultado de la division es: " + (a / b));
    }
}
