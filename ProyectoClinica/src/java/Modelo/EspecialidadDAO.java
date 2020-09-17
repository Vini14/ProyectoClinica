
package Modelo;

import Configuración.Conexión;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import Modelo.Especialidad;

/**
 *
 * @author Vincenzo Rosal
 */
public class EspecialidadDAO 
{
    Conexión cn = new Conexión();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r;
    
    public Especialidad buscar(String nombre)
    {
        Especialidad espe = new Especialidad();
        String sql = "select * from especialidad where nombre="+nombre;
        try
        {
            con = cn.Conexión();
            ps = con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next())
            {
                espe.setId(rs.getInt(1));
                espe.setNombre(rs.getString(2));
                espe.setDescri(rs.getString(3));
            }
        }
        catch(Exception e)
                {
                    
                }
        return espe;
    }
    
}
