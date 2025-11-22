/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Trasportes;

/**
 *
 * @author marga
 */
public class Carro {
    
    String marca;
    String modelo;
    String color;
    double gasolina; 
   
    public Carro(){
        
    }
    
    public Carro(String marca, String modelo, String color, double gasolina){
        
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.gasolina = gasolina;
    }
    
    public void displayInfo(){
        System.out.println("Marca: " + marca + " Modelo: " +  modelo + " Color: " + color);
    }                                      
    public void encenderMotor(){
        
        System.out.println("Motor automovil encendido");
    }
    public String avanzar(){
        
        return "Automovil Avanzando";
    } 
    public void gasolina(){
        if(gasolina < 3.5)
            System.out.println("Falta gasolina");
        else
            System.out.println("Gasolina competa");
    }
}
