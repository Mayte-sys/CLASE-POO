/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica6;

import tipoDeMotor.ICombustion;
import tipoDeMotor.IElectricidad;
import transporte.Vehiculo;


/**
 *
 * @author marga
 */
public class Hibrido extends Vehiculo implements IElectricidad , ICombustion{

    public Hibrido(String modelo, String marca, double gas){
        super(modelo, marca, gas);
    }
            
    @Override
    public void cargar(double Kwh) {
        System.out.println("Cargando Vehiculo modo Electrico");
    }

    @Override
    public void cargarGas(double litrosGas) {
        System.out.println("Cargando Vehiculo modo Gasolina");
    }

    @Override
    public String tipo() {
        return "Auto Hibrido";
    }
    @Override
    public void describir(){
        System.out.println("Es un auto color azul con modelo " + modelo + " de marca " + marca);
    }
}
