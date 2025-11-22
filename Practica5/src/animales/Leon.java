/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales;

/**
 *
 * @author marga
 */
public class Leon extends Animal{

    public Leon(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println("Leon hace sonido");
    }
    
    public String cazar(){
        return this.nombre + " cazando";
    }
}
