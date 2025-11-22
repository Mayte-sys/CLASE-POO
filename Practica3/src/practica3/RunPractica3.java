/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica3;

/**
 *
 * @author marga
 */
public class RunPractica3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       System.out.println("-----------Cliente 1------------"); 
        CuentaBancaria cuentaBanamex = new CuentaBancaria();
        cuentaBanamex.setNumeroCuenta("52569871236");
        cuentaBanamex.setTitular("Idalia Martinez");
        cuentaBanamex.setSaldo(5000);
        
        System.out.println("Saldo inicial " + cuentaBanamex.getSaldo());
        
        cuentaBanamex.depositar(500);
        System.out.println("Despues de"
                + ""
                + "l deposito " + cuentaBanamex.getSaldo());
        
        cuentaBanamex.retirar(400);
        System.out.println("Despues del retiro " + cuentaBanamex.getSaldo());
        
        cuentaBanamex.retirar(6400);
        System.out.println("-----------Cliente 2------------");
        CuentaBancaria cuentaBbva = new CuentaBancaria("596333", "Teresa Zavala", 6000);
        cuentaBbva.depositar(0);
        cuentaBbva.retirar(500);
        System.out.println("Despues del retiro " + cuentaBbva.getSaldo());   
    }
}
