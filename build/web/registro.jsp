<%-- 
    Document   : registro
    Created on : 27/12/2022, 11:40:01
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
                                <a class="nav-link text-secondary" aria-current="page" href="./login.jsp">Ingresar</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link text-light" aria-current="page" href="#">Registrarme</a>
                            </li>

                        </ul>
                    </div>
                </div>

            </nav>
        </header>

        <main>
            <img src="./images/7.jpg" class="img-fluid w-100 m-1" alt="..." style="height: 60vh;">
            <div class="conteinerFormInfo">

                <form action="srvUsuario" method="post" class="row g-3 col-4 mx-auto">
                    <h3 class="tituloFor text-secondary"><i>Formulario de Registro</i></h3>
                    <div class="col-12">
                        <label for="exampleInputEmail1" class="form-label text-light">Nombre y Apellido</label>
                        <input type="name" name="nombre" class="form-control" placeholder="Nombre y Apellido"
                               id="formContactoNombre" required="required">
                    </div>
                    <div class="col-md-6">
                        <label for="exampleInputEmail1" class="form-label text-light">Usuario</label>
                        <input type="usuario" name="usuario" class="form-control" placeholder="Usuario" id="formContactoUsuario" required="required">
                    </div>
                    <div class="col-md-6">
                        <label for="exampleInputEmail1" class="form-label text-light">Clave</label>
                        <input type="password" name="clave" class="form-control" placeholder="Contraseña" id="exampleInputPassword1" required="required">
                    </div>
                    <div class="col-12">
                        <label for="exampleInputEmail1" class="form-label text-light">Mail</label>
                        <input type="email" name="mail" class="form-control" placeholder="Dirección de correo electrónico"
                               id="formContactoEmail" required="required">
                    </div>

                    <div class="d-grid gap-2">

                        <button type="submit" name="enviar" class="btn btn-success" id="formContactoInfo"><b>Enviar
                            </b></button>
                    </div>
                </form>
            </div>
            <br><br><br>
            <script src="./bootstrap/js/bootstrap.min.js"></script>
        </main>

        <footer>
            <p class="text-secondary">&COPY; Copyright all rights reserved</p>
        </footer>
        
    </body>
</html>
