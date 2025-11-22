/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Trasportes;

/**
 *
 * @author marga
 */
public class Automovil {
    
    public Automovil(){
        
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    private String modelo;
    private String marca;
    
    public void encenderMotor(){
        
        System.out.println("Motor automovil encendido");
    }
    
    public String avanzar(){
        
        return "Automovil Avanzando";
    }
    
    public String estacionado(){
        
        return "Automovil Estacionado";
    }
}
