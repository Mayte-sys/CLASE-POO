/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales;

/**
 *
 * @author marga
 */
public class Mariposa extends Animal implements IVolar{

    public Mariposa(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println(this.nombre + " hace sonido");
    }

    @Override
    public void volar() {
        System.out.println(this.nombre + " comiendo");
    }
    
    public String migrar(){
        return this.nombre + " esta migrando";
    }
}
