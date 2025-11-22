/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica8;

/**
 *
 * @author marga
 */
public class Producto {
    private int id;
    private String nombre;
    private String categoria;
    
    public Producto(){    
    }
    
    public Producto(int id, String nombre, String categoria){
        this.id = id;
        this.nombre = nombre;
        this.categoria = categoria;  
    }
    
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCategoria() {
        return categoria;
    }
    @Override
    public String toString() {
        return "Producto{id = " + id + ", nombre = '" + nombre + "', categoria = '" + categoria + "'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Producto producto = (Producto) obj;
        return id == producto.id;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }
    
}
