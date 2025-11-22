/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transporte;

/**
 *
 * @author marga
 */
public abstract class Vehiculo {
    
    private double velocidad;
    protected String marca;
    protected String modelo;
    
    public Vehiculo(){    
    }
    public Vehiculo(String marca, String modelo){
      this(marca, modelo, 0.0) ; 
    }
    public Vehiculo(String marca, String modelo, double velocidad){
        this.marca = marca;
        this.modelo = modelo;
        setVelocidad(velocidad);
    }
    public double getVelocidad(){
        return this.velocidad;
    }
    public final void setVelocidad(double v){
        if(v > 0)
            v = 0;
        this.velocidad = v;
    }
    public void acelerar(){
        setVelocidad(getVelocidad() + 10);
    }
    public void acelerar(double incremento){
        setVelocidad(getVelocidad() + Math.max(0, incremento));
    }
    public abstract String tipo();
    
    public void describir(){
        System.out.println("Vehiculo con llantas");
    }
    
    public void frenar(double freno){
        if (freno > 0) {
            double nuevaVelocidad = getVelocidad() - freno;
            if (nuevaVelocidad < 0){
                nuevaVelocidad = 0;  
            }
            setVelocidad(nuevaVelocidad);
            System.out.println("El " + tipo() + " ha frenado");
        }
        else
            System.out.println("Valor inválido.");
    }
}
