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
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author mpucci
 */
@WebServlet(name = "srvUsuario", urlPatterns = {"/srvUsuario"})
public class srvUsuario extends HttpServlet {

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

        String accion = request.getParameter("accion");
        try {
            if (accion != null) {
                switch (accion) {
                    case "verificar":
                        verificar(request, response);
                        break;
                    case "cerrar":
                        cerrarsesion(request, response);
                    default:
                        response.sendRedirect("login.jsp");
                }
            } else {
                response.sendRedirect("login.jsp");
            }
        } catch (Exception e) {
            try {

            } catch (Exception ex) {
                System.out.println("Error : " + ex.getMessage());
            }
        }

        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet srvUsuario</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet srvUsuario at " + request.getContextPath() + "</h1>");
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
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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

            udao.insert(usu);
        } catch (Exception ex) {
            Logger.getLogger(srvUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
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

    private void verificar(HttpServletRequest request, HttpServletResponse response) throws IOException, Exception {
        HttpSession sesion;
        DAOUsuario dao;
        usuario usuario;
        usuario = this.obtenerUsuario(request);
        dao = new DAOUsuario();
        usuario = dao.identificar(usuario);

        if (usuario != null) {
            sesion = request.getSession();
            sesion.setAttribute("usuario", usuario);           
            getServletContext().getRequestDispatcher("/resultado.jsp").forward(request, response);
        } else {

            JOptionPane.showMessageDialog(null, "Credenciales Incorrectas \nIngrese Nuevamente", "Alert", JOptionPane.ERROR_MESSAGE);
            request.getRequestDispatcher("login.jsp").forward(request, response);

        }
    }

    private void cerrarsesion(HttpServletRequest request, HttpServletResponse response) throws IOException {
        HttpSession sesion = request.getSession();
        sesion.setAttribute("usuario", null);
        sesion.invalidate();
        response.sendRedirect("login.jsp");

    }

    private usuario obtenerUsuario(HttpServletRequest request) {
        usuario u = new usuario();
        u.setNickName(request.getParameter("txtUsu"));
        //u.setNombreUsuario(request.getParameter("txtUsu"));
        u.setClave(request.getParameter("txtPass"));
        
        return u;
    }

}
