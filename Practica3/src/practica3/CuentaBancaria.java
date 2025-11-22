/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica3;

/**
 *
 * @author marga
 */
public class CuentaBancaria {
    
    
    public CuentaBancaria(){
        
    }
    public CuentaBancaria(String numeroCuenta, String titular, double saldo){
        
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldo;
    }
    /**
     * @return the numeroCuenta
     */
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    /**
     * @param numeroCuenta the numeroCuenta to set
     */
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    /**
     * @return the titular
     */
    public String getTitular() {
        return titular;
    }

    /**
     * @param titular the titular to set
     */
    public void setTitular(String titular) {
        this.titular = titular;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        if(saldo >= 0)
            this.saldo = saldo;
        else
            System.out.println("El salgo no puede ser negativo");
    }
    
    public void depositar(double monto){
        if(monto > 0)
            this.saldo += monto;
        else
            System.out.println("Monto invalido para deposito");
    }
    public void retirar(double monto){
        if(monto > 0 && monto <= this.saldo)
            this.saldo -= monto;
        else
            System.out.println("Saldo insuficiente o monto invalido");
    }
    private String numeroCuenta;
    private String titular;
    private double saldo;
}
