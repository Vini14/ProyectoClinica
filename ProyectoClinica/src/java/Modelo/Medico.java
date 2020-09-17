
package Modelo;

/**
 *
 * @author Vincenzo Rosal
 */
public class Medico 
{
    int id;
    int cod_espe;
    int cod_horario;        
    String primer_nom;
    String segundo_nom;
    String primer_ape;
    String segundo_ape;
    String email;
    
    
    public Medico()
    {
        
    }
    
    public Medico(int id, int cod_espe, int cod_horario, String primer_nom, String segundo_nom, String primer_ape, String segundo_ape, String email)
    {
        this.id = id;
        this.cod_espe = cod_espe;
        this.cod_horario = cod_horario;
        this.primer_nom = primer_nom;
        this.segundo_nom = segundo_nom;
        this.segundo_ape = segundo_ape;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCod_espe() {
        return cod_espe;
    }

    public void setCod_espe(int cod_espe) {
        this.cod_espe = cod_espe;
    }

    public int getCod_horario() {
        return cod_horario;
    }

    public void setCod_horario(int cod_horario) {
        this.cod_horario = cod_horario;
    }
    

    public String getPrimer_nom() {
        return primer_nom;
    }

    public void setPrimer_nom(String primer_nom) {
        this.primer_nom = primer_nom;
    }

    public String getSegundo_nom() {
        return segundo_nom;
    }

    public void setSegundo_nom(String segundo_nom) {
        this.segundo_nom = segundo_nom;
    }

    public String getPrimer_ape() {
        return primer_ape;
    }

    public void setPrimer_ape(String primer_ape) {
        this.primer_ape = primer_ape;
    }

    public String getSegundo_ape() {
        return segundo_ape;
    }

    public void setSegundo_ape(String segundo_ape) {
        this.segundo_ape = segundo_ape;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}


