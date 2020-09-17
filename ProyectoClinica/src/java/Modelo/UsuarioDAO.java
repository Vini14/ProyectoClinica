
package Modelo;
import Configuración.Conexión;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author Vincenzo Rosal
 */
public class UsuarioDAO 
{
    Conexión cn = new Conexión();
    Connection con; 
    PreparedStatement ps;
    ResultSet rs;
    
    public Usuario validar(String nombre_usuario, String contraseña)
    {
        Usuario usu = new Usuario();
        String sql = "select * from Usuario where Nombre_Usuario=? and Contraseña=?";
        try
        {
            con = cn.Conexión();
            ps = con.prepareStatement(sql);
            ps.setString(1, nombre_usuario);
            ps.setString(2, contraseña);
            rs = ps.executeQuery();
            while(rs.next())
            {
                usu.setId(rs.getInt("ID"));
                usu.setNom_usuario(rs.getString("Nombre_Usuario"));
                usu.setCont(rs.getString("Contraseña"));
                usu.setNom(rs.getString("Nombre"));
                usu.setEmail(rs.getString("Email"));
            }
        }
            catch (Exception e)
                    {
                    
                    }
        return usu;
    }
}
