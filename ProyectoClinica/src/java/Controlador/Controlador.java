/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;


import Modelo.Especialidad;
import Modelo.EspecialidadDAO;
import Modelo.Medico;
import Modelo.MedicoDAO;
import Modelo.Paciente;
import Modelo.PacienteDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Vincenzo Rosal
 */
public class Controlador extends HttpServlet {

  
    Paciente pa = new Paciente(); 
    Especialidad e = new Especialidad();
    PacienteDAO pDAO = new PacienteDAO();
    Medico me = new Medico();
    MedicoDAO mDAO = new MedicoDAO();
    EspecialidadDAO eDAO = new EspecialidadDAO();
    int idpa ;
    int idme;
    
     protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            String menu = request.getParameter("menu");
            String accion = request.getParameter("accion");
            if(menu.equals("Principal"))
            {
                request.getRequestDispatcher("Principal.jsp").forward(request, response);
            }
            if(menu.equals("Clinica"))
            {
                switch(accion)
                {
                    case "Listar":
                        List lista = pDAO.listar();
                        request.setAttribute("pacientes", lista);
                        break;
                        
                    case "Agregar":
                        String primer=request.getParameter("txtprimer_nom");
                        String segundo=request.getParameter("txtsegundo_nom");
                        String apellido=request.getParameter("txtprimer_ape");
                        String apellido2=request.getParameter("txtsegundo_ape");
                        String fecha_na=request.getParameter("txtfecha");
                        String gene=request.getParameter("txtgenero");
                        String eda=request.getParameter("txtedad");
                        String dir=request.getParameter("txtdire");
                        String tel=request.getParameter("txttelefono");
                        pa.setPrimer_nom(primer);
                        pa.setSegundo_nom(segundo);
                        pa.setPrimer_apell(apellido);
                        pa.setSegundo_apell(apellido2);
                        pa.setFecha_nac(fecha_na);
                        pa.setGenero(gene);
                        pa.setEdad(eda);
                        pa.setDire(dir);
                        pa.setTele(tel);
                        pDAO.agregar(pa);
                        request.getRequestDispatcher("Controlador?menu=Clinica&accion=Listar").forward(request, response);
                        
                    break;
                    
                    case "Editar":
                        idpa = Integer.parseInt(request.getParameter("id"));
                        Paciente p = pDAO.listarId(idpa);
                        request.setAttribute("paciente", p);
                        request.getRequestDispatcher("Controlador?menu=Clinica&accion=Listar").forward(request, response);
                        break; 
                        
                    case "Actualizar":
                        String primer_nom1=request.getParameter("txtprimer_nom");
                        String segundo_nom1=request.getParameter("txtsegundo_nom");
                        String primer_apell1=request.getParameter("txtprimer_ape");
                        String segundo_apell1=request.getParameter("txtsegundo_ape");
                        String fecha_nac1=request.getParameter("txtfecha");
                        String genero1=request.getParameter("txtgenero");
                        String edad1=request.getParameter("txtedad");
                        String dire1=request.getParameter("txtdire");
                        String tele1=request.getParameter("txttelefono");
                        pa.setPrimer_nom(primer_nom1);
                        pa.setSegundo_nom(segundo_nom1);
                        pa.setPrimer_apell(primer_apell1);
                        pa.setSegundo_apell(segundo_apell1);
                        pa.setFecha_nac(fecha_nac1);
                        pa.setGenero(genero1);
                        pa.setEdad(edad1);
                        pa.setDire(dire1);
                        pa.setTele(tele1);
                        pa.setId(idpa);
                        pDAO.actualizar(pa);
                        request.getRequestDispatcher("Controlador?menu=Clinica&accion=Listar").forward(request, response);
    
                    break; 
                        
                    case "Eliminar":
                        idpa = Integer.parseInt(request.getParameter("id"));
                        pDAO.eliminar(idpa);
                        request.getRequestDispatcher("Controlador?menu=Clinica&accion=Listar").forward(request, response);
                        break;    
                    default:
                        throw new AssertionError();
                }
                request.getRequestDispatcher("Clinica.jsp").forward(request, response);
            }
            if(menu.equals("Medico"))
            {
                 switch(accion)
                {
                    case "Listar":
                        List lista = mDAO.listar();
                        request.setAttribute("medicos", lista);
                        break;
                        
                    case "Agregar":
                        String primer=request.getParameter("txtprimer_nom");
                        String segundo=request.getParameter("txtsegundo_nom");
                        String apellido=request.getParameter("txtprimer_ape");
                        String apellido2=request.getParameter("txtsegundo_ape");
                        int espec = Integer.parseInt(request.getParameter("txtespe"));
                        int hora = Integer.parseInt(request.getParameter("txthorario"));
                        String email=request.getParameter("txtemail");
                        me.setPrimer_nom(primer);
                        me.setSegundo_nom(segundo);
                        me.setPrimer_ape(apellido);
                        me.setSegundo_ape(apellido2);
                        me.setCod_espe(espec);
                        me.setCod_horario(hora);
                        me.setEmail(email);
                        mDAO.agregar(me);
                        request.getRequestDispatcher("Controlador?menu=Medico&accion=Listar").forward(request, response);
                        
                    break;
                    
                    case "Editar":
                        idme = Integer.parseInt(request.getParameter("id"));
                        Medico m = mDAO.listarId(idme);
                        request.setAttribute("medico", m);
                        request.getRequestDispatcher("Controlador?menu=Medico&accion=Listar").forward(request, response);
                        break; 
                        
                    case "Actualizar":
                        String primer_nom1=request.getParameter("txtprimer_nom");
                        String segundo_nom1=request.getParameter("txtsegundo_nom");
                        String primer_apell1=request.getParameter("txtprimer_ape");
                        String segundo_apell1=request.getParameter("txtsegundo_ape");
                        int es = Integer.parseInt(request.getParameter("txtespe"));
                        int hor = Integer.parseInt(request.getParameter("txthorario"));
                        String email1=request.getParameter("txtemail");
                        me.setPrimer_nom(primer_nom1);
                        me.setSegundo_nom(segundo_nom1);
                        me.setPrimer_ape(primer_apell1);
                        me.setSegundo_ape(segundo_apell1);
                        me.setCod_espe(es);
                        me.setCod_horario(hor);
                        me.setEmail(email1);
                        me.setId(idme);
                        mDAO.actualizar(me);
                        request.getRequestDispatcher("Controlador?menu=Medico&accion=Listar").forward(request, response);
    
                    break; 
                        
                    case "Eliminar":
                        idme = Integer.parseInt(request.getParameter("id"));
                        mDAO.eliminar(idme);
                        request.getRequestDispatcher("Controlador?menu=Medico&accion=Listar").forward(request, response);
                        break;  
                        
                    case "BuscarEspecialidad":
                         String nombre =  request.getParameter("codigo");
                         e.setNombre(nombre);
                         e = eDAO.buscar(nombre);
                         request.setAttribute("e", e);
                         
                        break;
                    default:
                        throw new AssertionError();
                 }
                request.getRequestDispatcher("Medico.jsp").forward(request, response);
            }
             if(menu.equals("Laboratorio"))
            {
                request.getRequestDispatcher("Laboratorio.jsp").forward(request, response);
            }
              if(menu.equals("Inventario"))
            {
                request.getRequestDispatcher("Inventario.jsp").forward(request, response);
            }
    }
   
     
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
