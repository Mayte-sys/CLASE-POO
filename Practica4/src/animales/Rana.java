/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales;


/**
 *
 * @author marga
 */
public class Rana extends Animal{
    
    public Rana(String nombre) {
        super(nombre);
    }
    
    @Override
    public void hacerSonido(){
        System.out.println("La rana croan");
    }
    
    /*@Override
    public String comer(){
        return "Rana Comiendo Incectos";
    }*/
    
    public void saltar(){
        System.out.println("La rana esta saltando");
    }
}
