
package Modelo;

/**
 *
 * @author Vincenzo Rosal
 */
public class Usuario {
    
    int id;
    String nom_usuario;
    String cont;
    String email;
    String nom;
    
    public Usuario()
    {
        
    }
    
    public Usuario(int id, String nom_usuario, String cont, String email, String nom)
    {
        this.id = id;
        this.nom_usuario = nom_usuario;
        this.cont = cont;
        this.email = email;
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom_usuario() {
        return nom_usuario;
    }

    public void setNom_usuario(String nom_usuario) {
        this.nom_usuario = nom_usuario;
    }

    public String getCont() {
        return cont;
    }

    public void setCont(String cont) {
        this.cont = cont;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
}
