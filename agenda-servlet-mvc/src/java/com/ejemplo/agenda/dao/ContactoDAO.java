/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejemplo.agenda.dao;
import com.ejemplo.agenda.model.Contacto;
import com.ejemplo.agenda.util.DB;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author marga
 */
public class ContactoDAO {
   public List<Contacto> listar() {
        List<Contacto> contactos = new ArrayList<>();
        String sql = "SELECT * FROM contactos ORDER BY id DESC";
        
        try (Connection conn = DB.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            
            while (rs.next()) {
                Contacto contacto = new Contacto();
                contacto.setId(rs.getInt("id"));
                contacto.setNombre(rs.getString("nombre"));
                contacto.setTelefono(rs.getString("telefono"));
                contacto.setEmail(rs.getString("email"));
                contactos.add(contacto);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return contactos;
    }
    
    public void guardar(Contacto contacto) {
        String sql = "INSERT INTO contactos (nombre, telefono, email) VALUES (?, ?, ?)";
        
        try (Connection conn = DB.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setString(1, contacto.getNombre());
            stmt.setString(2, contacto.getTelefono());
            stmt.setString(3, contacto.getEmail());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void eliminar(int id) {
        String sql = "DELETE FROM contactos WHERE id = ?";
        
        try (Connection conn = DB.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
