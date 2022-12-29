/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controlador;

import Modelo.DAOUsuario;
import Modelo.usuario;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author mpucci
 */
@WebServlet(name = "srvRegistro", urlPatterns = {"/srvRegistro"})
public class srvRegistro extends HttpServlet {

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
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet srvRegistro</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet srvRegistro at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
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
        processRequest(request, response);
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

        /*
        String usuarios = request.getParameter("usuario");
        String nombre = request.getParameter("nombre");
        String pass = request.getParameter("clave");
        String correo = request.getParameter("mail");

        usuario usu = new usuario();
        usu.setNickName(usuarios);
        usu.setNombreUsuario(nombre);
        usu.setClave(pass);
        usu.setMail(correo);
        usu.setTel("12345");

        //JOptionPane.showMessageDialog(null, usu.getNickName(), "Alert", JOptionPane.ERROR_MESSAGE);

        DAOUsuario udao = new DAOUsuario();
        try {
          //  JOptionPane.showMessageDialog(null, udao.toString(), "Alert", JOptionPane.ERROR_MESSAGE);

            udao.insert(usu);
        } catch (Exception ex) {
            Logger.getLogger(srvRegistro.class.getName()).log(Level.SEVERE, null, ex);
        }
*/
        processRequest(request, response);
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

}
