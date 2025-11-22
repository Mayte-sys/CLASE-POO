/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales;

/**
 *
 * @author marga
 */
public abstract class Animal {
 
    String nombre;
    
    public Animal(String nombre){
        this.nombre = nombre;
    }
    
    public abstract void hacerSonido();
    
    public void comer(){
        System.out.println(this. nombre + " comiendo");
    }
    
    public void despertar(){
        System.out.println(this.nombre + " despertando");
    }
    
    public String respirar(){
        return " respirando";
    }
}
