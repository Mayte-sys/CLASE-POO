/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transporte;

/**
 *
 * @author marga
 */
public abstract class Transporte {
    
    private String id;
    private int capacidad;
    
    public Transporte(){
        
    }
    public Transporte(String id, int capacidad){
        this.id = id;
        this.capacidad = capacidad;
        setid(id);
        setCapacidad(capacidad);
    }

    private void setid(String id) {
        if (id == null || id.trim().isEmpty())
            this.id = "UNDEFINED";
        else 
            this.id = id;
    }

    private void setCapacidad(int capacidad) {
        if(capacidad <= 0)
            throw new IllegalArgumentException("La capacidad debe de ser mayor a 0");
        if(capacidad > 500)
            throw new IllegalArgumentException("la capacidad debe de ser menor a 500");
        this.capacidad = capacidad;
    }
    
    public String getid(){
        return this.id;
    }
    public int getCapacidad(){
        return this.capacidad;
    }
    public abstract String tipo();
    public abstract void mover();
    public void transportar(int pasajeros) throws CapacidadExcedidaException {
        if (pasajeros > capacidad)
            throw new CapacidadExcedidaException("Pasajeros (" + pasajeros + ") exceden capacidad (" + capacidad + ") en " + tipo());
        System.out.println("Transportando " + pasajeros + " pasajeros en " + tipo() + " [" + id + "]");
    }  
}
