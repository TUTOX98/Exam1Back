<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Start Page</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/style.css">
    </head>
    <body> 
        <header class="header">
            <h1 class="header-title">Reserva</h1>
        </header>
        <main class="main-content">
            <section class="form-section">
                <div class="form-container">
                    <form action="ReservaServelet" method="POST" class="reserva-form">
                        <div class="form-group">
                            <label for="nombre" class="form-label">Nombre</label>
                            <input required id="nombre" name="nombre" type="text" class="form-input"/>
                        </div>
                        <div class="form-group">
                            <label for="fecha" class="form-label">Fecha</label>
                            <input required type="date" id="fecha" name="fecha" class="form-input"/>
                        </div>
                        <div class="form-group">
                            <label for="lTrabajo" class="form-label">Lugar de trabajo</label>
                            <input required  type="text" id="lTrabajo" name="lTrabajo" class="form-input"/>
                        </div>
                        <div class="form-group">
                            <label for="hTrabajo" class="form-label">Horas de trabajo</label>
                            <input required type="number" id="hTrabajo" name="hTrabajo" class="form-input"/>
                        </div>
                        <button type="submit" class="btn">Enviar</button>
                    </form>
                </div>
            </section>
            <section class="list-section">                
                <form action="ListaReservasServlet" method="GET" class="list-form">
                    <button type="submit" class="btn-submit">Ver reservas</button>
                </form>
            </section>
        </main>
    </body>
</html>
