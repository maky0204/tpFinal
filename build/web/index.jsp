<%-- 
    Document   : index
    Created on : 26/12/2022, 09:36:21
    Author     : mpucci
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
                                <a class="nav-link text-light" aria-current="page" href="#">Inicio</a>
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

            <div id="carouselExampleControls" class="carousel slide" data-bs-ride="carousel">
                <div class="carousel-inner">
                    <div class="carousel-item active">
                        <img src="./images/1.jpg" class="img-fluid w-100 m-1" alt="..." style="height: 60vh;">
                    </div>
                    <div class="carousel-item">
                        <img src="./images/2.jpg" class="img-fluid w-100 m-1" alt="..." style="height: 60vh;">
                    </div>
                    <div class="carousel-item">
                        <img src="./images/5.jpeg" class="img-fluid w-100 m-1" alt="..." style="height: 60vh;">
                    </div>
                    <div class="carousel-item">
                        <img src="./images/6.jpg" class="img-fluid w-100 m-1" alt="..." style="height: 60vh;">
                    </div>

                </div>
                <button class="carousel-control-prev text-dark" type="button" data-bs-target="#carouselExampleControls" data-bs-slide="prev">
                    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                    <span class="visually-hidden">Previous</span>
                </button>
                <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleControls" data-bs-slide="next">
                    <span class="carousel-control-next-icon" aria-hidden="true"></span>
                    <span class="visually-hidden">Next</span>
                </button>
            </div>

                <h1 class="text-light text-center">Puedes Conocer Todos Nuestros Destinos</h1>

            <div class="d-grid gap-2 d-md-flex justify-content-md-center">
            <a href="./login.jsp" class="btn btn-primary btn-lg align-content-center" tabindex="-1" role="button" aria-disabled="false">Reservar Ahora</a>

            </div>
             <script src="./bootstrap/js/bootstrap.min.js"></script>
        </main>
        <footer>
            <p class="text-secondary">&COPY; Copyright all rights reserved</p>
        </footer>

       
    </body>
</html>
