/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Contacto;
import modelo.ContactoDao;
/**
 *
 * @author marga
 */
public class EditarContacto extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));
        ContactoDao dao = new ContactoDao();
        Contacto c = dao.obtenerPorId(id);

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<h2>Editar Contacto</h2>");

        out.println("<form action='EditarContacto' method='POST'>");
        out.println("<input type='hidden' name='id' value='" + c.getId() + "'>");

        out.println("Nombre:<br>");
        out.println("<input type='text' name='fname' value='" + c.getFname() + "'><br><br>");

        out.println("Email:<br>");
        out.println("<input type='text' name='email' value='" + c.getEmail() + "'><br><br>");

        out.println("Teléfono:<br>");
        out.println("<input type='text' name='phone' value='" + c.getPhone() + "'><br><br>");

        out.println("<button type='submit'>Guardar Cambios</button>");
        out.println("</form>");

        out.println("<br><a href='EnviaDatos'>Volver</a>");
        out.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));
        String fname = request.getParameter("fname");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");

        Contacto c = new Contacto(id, fname, email, phone);
        ContactoDao dao = new ContactoDao();
        dao.actualizarContacto(c);

        response.sendRedirect("EnviaDatos");
    }
}

