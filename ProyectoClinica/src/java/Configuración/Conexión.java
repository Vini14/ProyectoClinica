
package Configuración;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author Vincenzo Rosal
 */
public class Conexión 
{
    Connection con = null;
    String url = "jdbc:mysql://localhost:3306/db_clinica";
    String user = "root";
    String pass = "";
    
    public Connection Conexión()
    {
        try
        {
           Class.forName("com.mysql.jdbc.Driver");
           con=DriverManager.getConnection(url,user,pass);
        }
        catch (Exception e)
        {
        }
        return con;
    }
}
