/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.SQLException;
import java.util.List;
import modelo.Contacto;
import modelo.ContactoDao;

/**
 *
 * @author marga
 */
public class EnviaDatos extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        
        String fname = request.getParameter("fname");
        String lname = request.getParameter("lname");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Datos</title>");
            out.println("</head>");
            out.println("<body>");
            
            ContactoDao dao = new ContactoDao();
            
            // CREAR (C)
            Contacto nuevoContacto = new Contacto(fname, email, phone);
            boolean exito = dao.agregarContacto(nuevoContacto);
            
            /*if (exito) {
                out.println("Contacto Guardado Exitosamente!</h2>");
            } else {
                out.println("<Error: No se pudo guardar el contacto. Revise la consola.</h2>");
            }*/
            
             out.println("<h2>Lista de contactos</h2>");

            List<Contacto> contactos = dao.obtenerTodos();

            out.println("<table border='1' cellpadding='5' cellspacing='0'>");
            out.println("<tr>");
            out.println("<th>ID</th>");
            out.println("<th>Nombre</th>");
            out.println("<th>Email</th>");
            out.println("<th>Teléfono</th>");
            out.println("<th>Acciones</th>");
            out.println("</tr>");
        
            
            for (Contacto c : contactos) {
                out.println("<tr>");
                out.println("<td>" + c.getId() + "</td>");
                out.println("<td>" + c.getFname() + "</td>");
                out.println("<td>" + c.getEmail() + "</td>");
                out.println("<td>" + c.getPhone() + "</td>");

                out.println("<td>"
                        + "<a href='EditarContacto?id=" + c.getId() + "'>Modificar</a> | "
                        + "<a href='EliminarContacto?id=" + c.getId() + "' onclick=\"return confirm('¿Seguro que deseas eliminar?');\">Eliminar</a>"
                        + "</td>");

                out.println("</tr>");
            }

            out.println("</table>");

            out.println("<br><a href='index.html'>Volver al formulario</a>");
            out.println("</body></html>");
        }
    }   // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            System.getLogger(EnviaDatos.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            System.getLogger(EnviaDatos.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private String getId() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
