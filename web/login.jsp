<%-- 
    Document   : login
    Created on : 26/12/2022, 13:29:38
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
                                <a class="nav-link text-secondary" aria-current="page" href="./index.jsp">Inicio</a>
                            </li>
                            <li class="nav-item">
                                <!--text-light... agregado para poner el texto en color blanco-->
                                <a class="nav-link text-light" aria-current="page" href="#">Ingresar</a>
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
            <img src="./images/4.jpg" class="img-fluid w-100 m-1" alt="..." style="height: 60vh;">
            <div class="conteinerFormInfo">

                <form method="post" action="srvUsuario?accion=verificar" class="row g-3 col-4 mx-auto">
                    <h3 class="tituloFormRRHH text-secondary" id="subtituloFormContacto"><i>Ingresar como Usuario</i></h3>
                    <div class="col-12">
                        <label for="exampleInputEmail1" class="form-label text-light">Nombre de Usuario</label>
                        <input type="text" name="txtUsu" class="form-control" id="txtUsu" aria-describedby="emailHelp" placeholder="Usuario">
                    </div>
                    <div class="col-12">
                        <label for="exampleInputPassword1" class="form-label text-light">Password</label>
                        <input type="password" name="txtPass" class="form-control" id="txtPass" placeholder="Clave">
                    </div>

                    <div class="d-grid gap-2">
                        <div class="mb-3 form-check">
                            <input type="checkbox" class="form-check-input" id="exampleCheck1">
                            <label class="form-check-label text-light" for="exampleCheck1">Recuerdame</label>
                        </div>
                        <button type="submit" name="verificar" value="Verificar" class="btn btn-primary">Ingresar</button>
                    </div>
                    <a href="./registro.jsp">No Tengo Usuario</a>
                </form>
                <br><br><br>

            </div>


            <script src="./bootstrap/js/bootstrap.min.js"></script>

        </main>
        
        <footer>
            <p class="text-secondary">&COPY; Copyright all rights reserved</p>
        </footer>
    </body>
</html>
