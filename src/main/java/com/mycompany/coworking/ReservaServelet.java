package com.mycompany.coworking;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import logica.Reserva;

@WebServlet(name = "ReservaServelet", urlPatterns = {"/ReservaServelet"})
public class ReservaServelet extends HttpServlet {

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
        HttpSession sesion = request.getSession();
        // Obtiene los datos de la reserva
        String nombre = request.getParameter("nombre");
        String fecha = request.getParameter("fecha");
        String lugarTrabajo = request.getParameter("lTrabajo");
        String horasTrabajo = request.getParameter("hTrabajo");
        // Valida los datos de la reserva
        if (nombre == null || nombre.trim().isEmpty()
                || fecha == null || fecha.trim().isEmpty()
                || lugarTrabajo == null || lugarTrabajo.trim().isEmpty()
                || horasTrabajo == null || horasTrabajo.trim().isEmpty()) {
            request.setAttribute("error", "Todos los campos son obligatorios");
            request.getRequestDispatcher("formulario.jsp").forward(request, response);
            return;
        }
        // Obtiene la lista de reservas de la sesión del usuario
        int id = generarIdUnico();
        // Obtiene la lista de reservas de la sesión del usuario
        List<Reserva> reservas = (List<Reserva>) sesion.getAttribute("Usuario");
        // Si no existe la lista de reservas, crea una nueva
        if (reservas == null) {
            reservas = new ArrayList<>();
        }
        // Agrega la reserva a la lista
        reservas.add(new Reserva(id, nombre, fecha, lugarTrabajo, horasTrabajo));
        // Actualiza la lista de reservas en la sesión del usuario
        sesion.setAttribute("Usuario", reservas);
        // Redirecciona a la lista de reservas
        response.sendRedirect("lista.jsp");
    }

    private int generarIdUnico() {
        return (int) (Math.random() * 1000);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
