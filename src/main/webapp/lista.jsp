<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.mycompany.coworking.Reserva" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="css/style.css">
    </head>
    <body>
        <header class="header">
            <h1 class="header-title">Reserva</h1>
        </header>
        <%
            List<Reserva> reservas = (List) request.getSession().getAttribute("Usuario");
        %>
        <main>
            <div class="container-list">
                <% for (Reserva re : reservas) {%>
                <div class="div-list">
                    <div class="div-details">
                        <label class="label-id">ID: <strong><%= re.getId()%></strong></label>
                        <label class="label-name">Nombre: <strong><%= re.getNombre()%></strong></label>
                        <label class="label-date">Fecha: <strong><%= re.getFecha()%></strong></label>
                        <label class="label-workplace">Lugar de Trabajo: <strong><%= re.getLugarTrabajo()%></strong></label>
                        <label class="label-hours">Horas de Trabajo: <strong><%= re.getHorasTrabajo()%></strong></label>
                    </div>
                    <form action="EliminarReservaServelet" method="POST" class="form-eliminate">
                        <input type="hidden" name="idReserva" value="<%= re.getId()%>">
                        <button type="submit" class="btn-submit btn-eliminate">Eliminar reserva</button>
                    </form>
                </div>
                <% }%>
                <form action="index.jsp" method="GET" class="form-back">
                    <button type="submit" class="btn-submit btn-back">Volver al Menú</button>
                </form>
            </div>
        </main>
    </body>
</html>
