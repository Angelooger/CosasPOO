/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaexamen;

/**
 *
 * @author Angel
 */
public abstract class Agente {
    protected String Nombre, Apellido, Puesto;
    protected int Numero=0;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getPuesto() {
        return Puesto;
    }

    public void setPuesto(String Puesto) {
        this.Puesto = Puesto;
    }

    public Agente(String Nombre, String Apellido, String Puesto) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Puesto = Puesto;
        this.Numero+=1;
    }
    
    
    
    
}
