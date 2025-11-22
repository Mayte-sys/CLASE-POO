/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica6;
import java.util.*;
import transporte.Vehiculo;
import tipoDeMotor.ICombustion;
import tipoDeMotor.IElectricidad;

/**
 *
 * @author marga
 */
public class RunPractica6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    Hibrido b = new Hibrido("byd", "dolphin", 30.00);
    System.out.println(b.tipo());
    b.acelerar();
    
    Vehiculo h = new Hibrido("byd", "dolphin", 30.00);
    Vehiculo m = new Moto("Voltair", "Sway Power", 20.00);
    Vehiculo ae = new AutoElectrico("Tesla", "", 80.00);
    Vehiculo a = new Auto("Nissan", "2015", 60.00);
  
    List<Vehiculo> flota = Arrays.asList(h,m,ae,a);
        
    for(Vehiculo v:flota) {
        System.out.println("Tipo: " + v.tipo());
        v.describir();
        v.acelerar();
        v.frenar(10.00);
        if(v instanceof ICombustion iCombustion)
            iCombustion.cargarGas(23.69);
        if(v instanceof IElectricidad iElectricidad)
            iElectricidad.cargar(70.43);
    }
    }
}
