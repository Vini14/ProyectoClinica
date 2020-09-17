/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Configuración.Conexión;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import Modelo.Paciente;

/**
 *
 * @author Vincenzo Rosal
 */
public class PacienteDAO 
{
    Conexión cn = new Conexión();
    Connection con; 
    PreparedStatement ps;
    ResultSet rs; 
    int r;
    
    
    public List listar()
    {
        String sql = "select * from paciente";
        List<Paciente>lista = new ArrayList<>();
        try
        {
            con=cn.Conexión();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next())
            {   
                Paciente pa = new Paciente();
                pa.setId(rs.getInt(1));
                pa.setPrimer_nom(rs.getString(2));
                pa.setSegundo_nom(rs.getString(3));
                pa.setPrimer_apell(rs.getString(4));
                pa.setSegundo_apell(rs.getString(5));
                pa.setFecha_nac(rs.getString(6)); 
                pa.setGenero(rs.getString(7));
                pa.setEdad(rs.getString(8));
                pa.setDire(rs.getString(9));
                pa.setTele(rs.getString(10));
                lista.add(pa);
            }
        }
        catch (Exception e)
                {
                    
                }
        return lista;
    }
    
    public int agregar(Paciente pa)
    {
        String sql ="insert into paciente(Primer_nombre, Segundo_Nombre, Primer_Apellido, Segundo_Apellido, fecha_Nacimiento, Género, Edad, Dirección, Telefono) VALUES(?,?,?,?,?,?,?,?,?)";
        try
        {
            con=cn.Conexión();
            ps=con.prepareStatement(sql);
            ps.setString(1, pa.getPrimer_nom());
            ps.setString(2, pa.getSegundo_nom());
            ps.setString(3, pa.getPrimer_apell());
            ps.setString(4, pa.getSegundo_apell());
            ps.setString(5, pa.getFecha_nac());
            ps.setString(6, pa.getGenero());
            ps.setString(7, pa.getEdad());
            ps.setString(8, pa.getDire());
            ps.setString(9, pa.getTele());
            ps.executeUpdate();
        }
        catch(Exception e)
                {
                    
                }
        return r;
    }
    
    public Paciente listarId(int id)
    {
         Paciente pac = new Paciente();
        String sql="select * from paciente where ID="+id;
        try
        {
            con = cn.Conexión();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next())
            {
                pac.setPrimer_nom(rs.getString(2));
                pac.setSegundo_nom(rs.getString(3));
                pac.setPrimer_apell(rs.getString(4));
                pac.setSegundo_apell(rs.getString(5));
                pac.setFecha_nac(rs.getString(6)); 
                pac.setGenero(rs.getString(7));
                pac.setEdad(rs.getString(8));
                pac.setDire(rs.getString(9)); 
                pac.setTele(rs.getString(10));
            }
        }
        catch (Exception e)
        {
            
        }
        return pac;
    }
    public int actualizar(Paciente pa)
    {
        String sql ="update paciente set Primer_nombre=?, Segundo_Nombre=?, Primer_Apellido=?, Segundo_Apellido=?, fecha_Nacimiento=?, Género=?, Edad=?, Dirección=?, Telefono=?"
                + "where ID=?";
        try
        {
            con=cn.Conexión();
            ps=con.prepareStatement(sql);
            ps.setString(1, pa.getPrimer_nom());
            ps.setString(2, pa.getSegundo_nom());
            ps.setString(3, pa.getPrimer_apell());
            ps.setString(4, pa.getSegundo_apell());
            ps.setString(5, pa.getFecha_nac());
            ps.setString(6, pa.getGenero());
            ps.setString(7, pa.getEdad());
            ps.setString(8, pa.getDire());
            ps.setString(9, pa.getTele());
            ps.setInt(10, pa.getId());
            ps.executeUpdate();
        }
        catch(Exception e)
                {
                    
                }
        return r;
    }
    
    public void eliminar(int id)
    {
        String sql="delete from paciente where ID="+id;
        try
        {
            con=cn.Conexión();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        }
        catch (Exception e)
                {
                    
                }
    }
}
