<%-- 
    Document   : Clinica
    Created on : 21/08/2020, 08:26:43 PM
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
        <title></title>
    </head>
    <body>
        <div class="d-flex">
            <div class="card col-sm-4">
                <div class="card-body">
                    <form action="Controlador?menu=Clinica" method="POST">
                        <div class="form-group">
                            <label>Primer Nombre</label>
                             <input type="text" value="${paciente.getPrimer_nom()}"name="txtprimer_nom" class="form-control">
                        </div>    
                        <div class="form-group">
                            <label>Segundo Nombre</label>
                            <input type="text" value="${paciente.getSegundo_nom()}" name="txtsegundo_nom" class="form-control">
                        </div>
                        <div class="form-group">
                            <label>Primer Apellido</label>
                            <input type="text" value="${paciente.getPrimer_apell()}" name="txtprimer_ape" class="form-control">
                        </div>    
                        <div class="form-group">
                            <label>Segundo Apellido</label>   
                            <input type="text" value="${paciente.getSegundo_apell()}" name="txtsegundo_ape" class="form-control">
                        </div>    
                        <div class="form-group">
                            <label>Fecha de Nacimiento</label>
                            <input type="text" value="${paciente.getFecha_nac()}" name="txtfecha" class="form-control">
                        </div>    
                        <div class="form-group">
                            <label>Género</label>
                            <input type="text" value="${paciente.getGenero()}" name="txtgenero" class="form-control">
                        </div>
                        <div class="form-group">
                            <label>Edad</label>
                            <input type="text" value="${paciente.getEdad()}" name="txtedad" class="form-control">
                        </div>    
                        <div class="form-group">
                            <label>Dirección</label>
                            <input type="text" value="${paciente.getDire()}" name="txtdire" class="form-control">
                        </div>    
                        <div class="form-group">
                            <label>Teléfono</label>
                            <input type="text" value="${paciente.getTele()}" name="txttelefono" class="form-control">
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
                        <th>FECHA NACIMIENTO</th>
                        <th>GÉNERO</th>
                        <th>EDAD</th>
                        <th>DIRECCIÓN</th>
                        <th>TELÉFONO</th>
                        <th>ACCION</th>
                    </tr>
                </thead>
                <tbody>  
                     <c:forEach var="pa" items="${pacientes}">
                    <tr>
                        <td>${pa.getId()}</td>
                        <td>${pa.getPrimer_nom()}</td>
                        <td>${pa.getSegundo_nom()}</td>
                        <td>${pa.getPrimer_apell()}</td>
                        <td>${pa.getSegundo_apell()}</td>
                        <td>${pa.getFecha_nac()}</td>
                        <td>${pa.getGenero()}</td>
                        <td>${pa.getEdad()}</td>
                        <td>${pa.getDire()}</td>
                        <td>${pa.getTele()}</td>
                        <td>
                            <a class="btn btn-warning" href="Controlador?menu=Clinica&accion=Editar&id=${pa.getId()}">Editar</a>
                            <a class="btn btn-danger" href="Controlador?menu=Clinica&accion=Eliminar&id=${pa.getId()}">Eliminar</a>
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
