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
        String nombre = request.getParameter("nombre");
        String fecha = request.getParameter("fecha");
        String lugarTrabajo = request.getParameter("lTrabajo");
        String horasTrabajo = request.getParameter("hTrabajo");

        if (nombre == null || nombre.trim().isEmpty()
                || fecha == null || fecha.trim().isEmpty()
                || lugarTrabajo == null || lugarTrabajo.trim().isEmpty()
                || horasTrabajo == null || horasTrabajo.trim().isEmpty()) {
            request.setAttribute("error", "Todos los campos son obligatorios");
            request.getRequestDispatcher("formulario.jsp").forward(request, response);
            return;
        }
        int id = generarIdUnico();
        List<Reserva> reservas = (List<Reserva>) sesion.getAttribute("Usuario");
        if (reservas == null) {
            reservas = new ArrayList<>();
        }
        reservas.add(new Reserva(id, nombre, fecha, lugarTrabajo, horasTrabajo));
        sesion.setAttribute("Usuario", reservas);
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
