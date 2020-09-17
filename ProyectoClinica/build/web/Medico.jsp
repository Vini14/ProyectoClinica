<%-- 
    Document   : Medico
    Created on : 11/09/2020, 01:06:55 AM
    Author     : Vincenzo Rosal
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
       <div class="d-flex">
            <div class="card col-sm-4">
                <div class="card-body">
                    <form action="Controlador?menu=Medico" method="POST">
                        <div class="form-group">
                            <label>Primer Nombre</label>
                             <input type="text" value="${medico.getPrimer_nom()}"name="txtprimer_nom" class="form-control">
                        </div>    
                        <div class="form-group">
                            <label>Segundo Nombre</label>
                            <input type="text" value="${medico.getSegundo_nom()}" name="txtsegundo_nom" class="form-control">
                        </div>
                        <div class="form-group">
                            <label>Primer Apellido</label>
                            <input type="text" value="${medico.getPrimer_ape()}" name="txtprimer_ape" class="form-control">
                        </div>    
                        <div class="form-group">
                            <label>Segundo Apellido</label>   
                            <input type="text" value="${medico.getSegundo_ape()}" name="txtsegundo_ape" class="form-control">
                        </div> 
                        <div class="form-group">
                            <label>Especialidad</label>
                            <input type="text" value="${c.getNombre()}" name="txtespe" class="form-control">
                            <div class=" col-sm-12 d-flex">
                            <input type="text" name="codigo" value="${c.getNombre()}" class="form-control" placeholder="Especialidad">
                            <input type="submit" name="accion" value="BuscarEspecialidad" class="btn btn-outline-info col-sm-6">
                            </div>
                        <div class="form-group">
                            <label>Horario</label>
                            <input type="text" value="${medico.getCod_horario()}" name="txthorario" class="form-control">
                        </div>
                        </div>
                        <div class="form-group">
                            <label>Email</label>
                            <input type="text" value="${medico.getEmail()}" name="txtemail" class="form-control">
                        </div>    
                            <input type="submit" name="accion" value="Agregar" class="btn btn-info">
                            <input type="submit" name="accion" value="Actualizar" class="btn btn-info">
                </form>
            </div>
        </div>
        <div class="col-sm-8">
            <table class="table table-hover">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>PRIMER NOMBRE</th>
                        <th>SEGUNDO NOMBRE</th>
                        <th>PRIMER APELLIDO</th>
                        <th>SEGUNDO APELLIDO</th>
                        <th>ESPECIALIDAD</th>
                        <th>HORARIO</th>
                        <th>EMAIL</th>
                        <th>ACCION</th>
                    </tr>
                </thead>
                <tbody>  
                     <c:forEach var="me" items="${medicos}">
                    <tr>
                        <td>${me.getId()}</td>
                        <td>${me.getPrimer_nom()}</td>
                        <td>${me.getSegundo_nom()}</td>
                        <td>${me.getPrimer_ape()}</td>
                        <td>${me.getSegundo_ape()}</td>
                        <td>${me.getCod_espe()}</td>
                        <td>${me.getCod_horario()}</td>
                        <td>${me.getEmail()}</td>
                        <td>
                            <a class="btn btn-warning" href="Controlador?menu=Medico&accion=Editar&id=${me.getId()}">Editar</a>
                            <a class="btn btn-danger" href="Controlador?menu=Medico&accion=Eliminar&id=${me.getId()}">Eliminar</a>
                        </td>
                    </tr>
                   </c:forEach>
                </tbody>
            </table>
        </div>
        </div>
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>
   
    </body>
</html>
