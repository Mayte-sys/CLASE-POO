/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica7;
import estadoTransporte.IOperable;
import java.util.*;
import transporte.CapacidadExcedidaException;
import transporte.Transporte;

/**
 *
 * @author marga
 */
public class RunPractica7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Transporte> lista = new ArrayList<>();
        lista.add(new TransporteMaritimo("BAR-01", 100));
        lista.add(new TransporteTerrestre("AUT-01", 50));
        lista.add(new TransporteAereo("AV-777", 200));
        lista.add(new TransporteFerroviario("FERI-017", 300));
        
        int pasajeros  = 60;
        for (Transporte t : lista) {
            t.mover();
            try{
                t.transportar(pasajeros);
            }
            catch (CapacidadExcedidaException e){
                System.out.println("ERROR: " + e.getMessage());
            }
            if (t instanceof IOperable iOperable)
                iOperable.realizarMantenimiento();
            System.out.println("---------------------------------------------------------------");
        }   
    }   
}
