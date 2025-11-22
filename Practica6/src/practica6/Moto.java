/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica6;

import tipoDeMotor.ICombustion;
import transporte.Vehiculo;

/**
 *
 * @author marga
 */
public class Moto extends Vehiculo implements ICombustion{
    
    public Moto(String modelo, String marca, double gas){
        super(modelo, marca, gas);
    }

    @Override
    public String tipo() {
        return "Moto";
    }

    @Override
    public void cargarGas(double litrosGas) {
        System.out.println("Cargando Moto " + litrosGas + "litros");
    }
    @Override
    public void describir(){
        System.out.println("Es un moto color rojo con modelo " + modelo + " de marca " + marca);
    }
}
