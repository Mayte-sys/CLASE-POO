/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales;

/**
 *
 * @author marga
 */
public class Cerdo extends Animal{
    
    public Cerdo(String nombre) {
        super(nombre);
    }
    
    @Override
    public void hacerSonido(){
        System.out.println("El cerdo oink");
    }
    
    @Override
    public String comer(){
        return "Cerdo Comiendo Verduras";
    }  
}
