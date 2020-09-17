
package Modelo;
import Configuración.Conexión;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import Modelo.Medico;
/**
 *
 * @author Vincenzo Rosal
 */
public class MedicoDAO 
{
    Conexión cn = new Conexión();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r;
    
 
    
    public List listar()
    {
        String sql = "select * from medico";
        List<Medico>lista = new ArrayList<>();
        try
        {
            con=cn.Conexión();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next())
            {   
                Medico me = new Medico();
                me.setId(rs.getInt(1));
                me.setPrimer_nom(rs.getString(2));
                me.setSegundo_nom(rs.getString(3));
                me.setPrimer_ape(rs.getString(4));
                me.setSegundo_ape(rs.getString(5));
                me.setCod_espe(rs.getInt(6));
                me.setCod_horario(rs.getInt(7));
                me.setEmail(rs.getString(8));
                lista.add(me);
            }
        }
        catch (Exception e)
                {
                    
                }
        return lista;
    }
    
    public int agregar(Medico me)
    {
        String sql ="insert into medico(primer_Nombre, segundo_Nombre, primer_Apellido, segundo_Apellido, codEspecialidad, codHorario, Email) VALUES(?,?,?,?,?,?,?)";
        try
        {
            con=cn.Conexión();
            ps=con.prepareStatement(sql);
            ps.setString(1, me.getPrimer_nom());
            ps.setString(2, me.getSegundo_nom());
            ps.setString(3, me.getPrimer_ape());
            ps.setString(4, me.getSegundo_ape());
            ps.setInt(5, me.getCod_espe());
            ps.setInt(6, me.getCod_horario());
            ps.setString(7, me.getEmail());
            ps.executeUpdate();
        }
        catch(Exception e)
                {
                    
                }
        return r;
    }
    
     public Medico listarId(int id)
    {
        Medico med = new Medico();
        String sql="select * from medico where ID="+id;
        try
        {
            con = cn.Conexión();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next())
            {
                med.setPrimer_nom(rs.getString(2));
                med.setSegundo_nom(rs.getString(3));
                med.setPrimer_ape(rs.getString(4));
                med.setSegundo_ape(rs.getString(5));
                med.setCod_espe(rs.getInt(6));
                med.setCod_horario(rs.getInt(7));
                med.setEmail(rs.getString(8));
              
            }
        }
        catch (Exception e)
        {
            
        }
        return med;
    }
    public int actualizar(Medico me)
    {
        String sql ="update medico set primer_Nombre=?, segundo_Nombre=?, primer_Apellido=?, segundo_Apellido=?,codEspecialidad=?, codHorario=?, Email=?"
                + "where ID=?";
        try
        {
            con=cn.Conexión();
            ps=con.prepareStatement(sql);
            ps.setString(1, me.getPrimer_nom());
            ps.setString(2, me.getSegundo_nom());
            ps.setString(3, me.getPrimer_ape());
            ps.setString(4, me.getSegundo_ape());
            ps.setInt(5, me.getCod_espe());
            ps.setInt(6, me.getCod_horario());
            ps.setString(7, me.getEmail());
            ps.setInt(8, me.getId());
            ps.executeUpdate();
        }
        catch(Exception e)
                {
                    
                }
        return r;
    }
    
    public void eliminar(int id)
    {
        String sql="delete from medico where ID="+id;
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
