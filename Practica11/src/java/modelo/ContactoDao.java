/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import DBCon.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author marga
 */
public class ContactoDao {
    public boolean agregarContacto(Contacto contacto) {
        
        String sql = "INSERT INTO tabla_contactos(nombre, email, telefono) VALUES (?, ?, ?)";
        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            
            ps.setString(1, contacto.getFname());
            ps.setString(2, contacto.getEmail());
            ps.setString(3, contacto.getPhone());
            
            int filasAfectadas = ps.executeUpdate();
            return filasAfectadas > 0;
            
        } catch (SQLException e) {
            System.err.println("Error al agregar contacto: " + e.getMessage());
            e.printStackTrace();
            return false;
        }
    }

    public List<Contacto> obtenerTodos() {
        List<Contacto> lista = new ArrayList<>();
        
        String sql = "SELECT * FROM tabla_contactos"; 
        
        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            
            while (rs.next()) { 
                Contacto c = new Contacto();
                
                c.setId(rs.getInt("id"));
                c.setFname(rs.getString("nombre"));
                c.setEmail(rs.getString("email"));
                c.setPhone(rs.getString("telefono"));
                lista.add(c);
            }
        } catch (SQLException e) {
            System.err.println("Error al obtener todos los contactos: " + e.getMessage());
            e.printStackTrace();
        }
        return lista;
    }
    
    public boolean actualizarContacto(Contacto contacto) {
        String sql = "UPDATE tabla_contactos SET nombre=?, email=?, telefono=? WHERE id=?";
        
        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            
   
            ps.setString(1, contacto.getFname());
            ps.setString(2, contacto.getEmail());
            ps.setString(3, contacto.getPhone());
            
           ps.setInt(4, contacto.getId());

            int filasAfectadas = ps.executeUpdate();
            return filasAfectadas > 0; // Retorna true si al menos una fila fue cambiada
            
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean eliminarContacto(int id) {
        String sql = "DELETE FROM tabla_contactos WHERE id=?";
        
        try (Connection con = DBCon.DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            
            ps.setInt(1, id);
            
            int filasAfectadas = ps.executeUpdate();
            return filasAfectadas > 0; 
            
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public Contacto obtenerPorId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
