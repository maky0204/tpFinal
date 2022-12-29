<%-- 
    Document   : resultado
    Created on : 26/12/2022, 09:44:43
    Author     : mpucci
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page language="java"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="./bootstrap/css/bootstrap.min.css">
        <title>JSP Page</title>
    </head>

    <body class="bg-dark">
        <header>
            <nav class="navbar navbar-expand-lg bg-dark">

                <div class="container-fluid">

                    <div class="collapse navbar-collapse justify-content-end" id="navbarNav">
                        <ul class="navbar-nav ">
                            <li class="nav-item">
                                <a class="nav-link text-secondary" aria-current="page" href="./index.jsp">Inicio</a>
                            </li>
                            <li class="nav-item">
                                <!--text-light... agregado para poner el texto en color blanco-->
                                <a class="nav-link text-secondary" aria-current="page" href="./login.jsp">Ingresar</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link text-secondary" aria-current="page" href="./registro.jsp">Registrarme</a>
                            </li>

                        </ul>
                    </div>
                </div>

            </nav>
        </header>

        <main>


            <img src="./images/3.jpg" class="img-fluid w-100 m-1" alt="..." style="height: 60vh;">
            <h1 class="text-light text-center">Bienvenido</h1>

            <p class="text-light text-center">Usuario: <%= request.getParameter("txtUsu")%></p>
            <!--<p>Contraseña: <%= request.getParameter("txtPass")%></p>-->
            <br>

            <script src="./bootstrap/js/bootstrap.min.js"></script>
        </main>

        <footer>
            <p class="text-secondary">&COPY; Copyright all rights reserved</p>
        </footer>

    </body>

</html>
