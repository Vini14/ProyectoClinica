
package Modelo;

/**
 *
 * @author Vincenzo Rosal
 */
public class Especialidad 
{
    int id;
    String nombre;
    String descri;
    
    public Especialidad()
    {
        
    }
    
    public Especialidad(int id, String nombre, String descri)
    {
        this.id = id;
        this.nombre = nombre;
        this.descri = descri;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescri() {
        return descri;
    }

    public void setDescri(String descri) {
        this.descri = descri;
    }
    
    
}
