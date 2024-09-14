/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mycompany.coworking;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import logica.Reserva;

/**
 *
 * @author nuvup
 */
@WebServlet(name = "EliminarReservaServelet", urlPatterns = {"/EliminarReservaServelet"})
public class EliminarReservaServelet extends HttpServlet {

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
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        // Obtiene la lista de reservas de la sesión del usuario
        List<Reserva> ListaEliminar = (List) request.getSession().getAttribute("Usuario");
        // Obtiene el ID de la reserva a eliminar
        int idReserva = Integer.parseInt(request.getParameter("idReserva"));
        // Itera sobre la lista de reservas
        for (Reserva usu : ListaEliminar) {
            if (usu.getId() == idReserva) {
                // Elimina la reserva de la lista
                ListaEliminar.remove(usu);
                // Salida del ciclo
                break;
            }
        }
        // Actualiza la lista de reservas en la sesión del usuario
        request.getSession().setAttribute("Usuario", ListaEliminar);
        // Redirecciona a la lista de reservas
        response.sendRedirect("lista.jsp");
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
