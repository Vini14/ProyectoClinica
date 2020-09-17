/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Vincenzo Rosal
 */
public class Paciente 
{

    int id;
    String primer_nom;
    String segundo_nom;
    String primer_apell;
    String segundo_apell;
    String fecha_nac;
    String genero;
    String edad;
    String dire;
    String tele;
    
    public Paciente()
    {
        
    }
    
    public Paciente(int id, String primer_nom, String segundo_nom, String primer_apell, String segundo_apell, String fecha_nac, String genero, String edad, String dire, String tele)
    {
        this.id = id;
        this.primer_nom = primer_nom;
        this.segundo_nom = segundo_nom;
        this.primer_apell = primer_apell;
        this.segundo_apell = segundo_apell;
        this.fecha_nac = fecha_nac;
        this.genero = genero;
        this.edad = edad;
        this.dire = dire;
        this.tele = tele;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getPrimer_apell() {
        return primer_apell;
    }

    public void setPrimer_apell(String primer_apell) {
        this.primer_apell = primer_apell;
    }

    public String getSegundo_apell() {
        return segundo_apell;
    }

    public void setSegundo_apell(String segundo_apell) {
        this.segundo_apell = segundo_apell;
    }

    public String getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(String fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getDire() {
        return dire;
    }

    public void setDire(String dire) {
        this.dire = dire;
    }

    public String getTele() {
        return tele;
    }

    public void setTele(String tele) {
        this.tele = tele;
    }
    
    
}
