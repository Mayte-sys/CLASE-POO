/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejemplo.agenda.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author marga
 */
public class DB {
    private static final String URL = "jdbc:mysql://localhost:3306/agenda_db";
    private static final String USER = "root";
    private static final String PASSWORD = "password";
    
    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Conexion exitosa");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Error cargando el driver JDBC", e);
        }
    }
    
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
