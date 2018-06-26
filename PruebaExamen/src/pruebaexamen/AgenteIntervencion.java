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
public class AgenteIntervencion extends Agente{
    protected String Especialidad, Clasificacion;

    public String getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(String Especialidad) {
        this.Especialidad = Especialidad;
    }

    public String getClasificacion() {
        return Clasificacion;
    }

    public void setClasificacion(String Clasificacion) {
        this.Clasificacion = Clasificacion;
    }

    public AgenteIntervencion(String Nombre, String Apellido, String Puesto, String Especialidad, String Clasificacion) {
        super(Nombre, Apellido, Puesto);
        this.Especialidad = Especialidad;
        this.Clasificacion = Clasificacion;
    }
    
    
}
