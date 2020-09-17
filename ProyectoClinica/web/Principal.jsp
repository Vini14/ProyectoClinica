<%-- 
    Document   : Principal
    Created on : 27/08/2020, 09:59:29 PM
    Author     : Vincenzo Rosal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
    </head>
    <body>
         <nav class="navbar navbar-expand-lg navbar-light bg-info">
  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a style="margin-left: 10px;border: none" class="btn btn-outline-light  " href="#">Home <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
        <a style="margin-left: 10px;border: none" class="btn btn-outline-light" href="Controlador?menu=Clinica&accion=Listar" target="myFrame">Clinica</a>
      </li>
       <li class="nav-item">
        <a style="margin-left: 10px;border: none" class="btn btn-outline-light" href="Controlador?menu=Medico&accion=Listar" target="myFrame">Medico</a>
      </li>
        <li class="nav-item">
        <a style="margin-left: 10px;border: none" class="btn btn-outline-light" href="Controlador?menu=Laboratorio" target="myFrame">Laboratorio</a>
      </li>
        <li class="nav-item">
            <a style="margin-left: 10px;border: none" class="btn btn-outline-light" href="Controlador?menu=Inventario" target="myFrame">Inventario</a>
      </li>
    </ul>
   <div class="dropdown">
  <button style="border: none" class="btn btn-outline-light dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
    ${usuario.getNom()}
  </button>
  <div class="dropdown-menu text-center" >
    <a class="dropdown-item" href="#">
        <img src="Imagenes/1200px-User_icon_2.svg.png" alt="60" width="60"/>
    </a>
    <a class="dropdown-item" href="#">${usuario.getNom_usuario()}</a>
    <a class="dropdown-item" href="#">usuario@gmail.com</a>
    <div class="dropdown-divider"></div>
    <form action="Validar" method="POST">
        <button name="accion" value="Salir" class="dropdown-item" href="#">Salir</button>
    </form>
  </div>
    </div>
  </div>
</nav>
      <div class="m-4" style="height: 550px;">
          <iframe name="myFrame" style="height: 100%; width: 100%; border: none"></iframe>
      </div>

         <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
      <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
      <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>
    </body>
</html>
