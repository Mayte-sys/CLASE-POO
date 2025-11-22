/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejemplo.agenda.web;

import com.ejemplo.agenda.dao.ContactoDAO;
import com.ejemplo.agenda.model.Contacto;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 *
 * @author marga
 */
public class ContactoServlet extends HttpServlet{
    private ContactoDAO contactoDAO;
    
    @Override
    public void init() {
        contactoDAO = new ContactoDAO();
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String action = request.getParameter("action");
        if (action == null) action = "list";
        
        switch (action) {
            case "new":
                mostrarFormulario(request, response);
                break;
            case "delete":
                eliminarContacto(request, response);
                break;
            default:
                listarContactos(request, response);
        }
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String nombre = request.getParameter("nombre");
        String telefono = request.getParameter("telefono");
        String email = request.getParameter("email");
        
        Contacto contacto = new Contacto(nombre, telefono, email);
        contactoDAO.guardar(contacto);
        
        response.sendRedirect("contactos");
    }
    
    private void listarContactos(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        List<Contacto> contactos = contactoDAO.listar();
        request.setAttribute("contactos", contactos);
        request.getRequestDispatcher("/views/lista.jsp").forward(request, response);
    }
    
    private void mostrarFormulario(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        request.getRequestDispatcher("/views/form.jsp").forward(request, response);
    }
    
    private void eliminarContacto(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        
        int id = Integer.parseInt(request.getParameter("id"));
        contactoDAO.eliminar(id);
        response.sendRedirect("contactos");
    }
}
