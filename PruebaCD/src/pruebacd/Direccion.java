/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebacd;

/**
 *
 * @author Angel
 */
public class Direccion {
    private String calle;
    private String numero;
    private String delomun;
    private String cp;
    private String estado;
    private String nombre;

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDelomun() {
        return delomun;
    }

    public void setDelomun(String delomun) {
        this.delomun = delomun;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Direccion(String calle, String numero, String delomun, String cp, String estado, String nombre) {
        this.calle = calle;
        this.numero = numero;
        this.delomun = delomun;
        this.cp = cp;
        this.estado = estado;
        this.nombre = nombre;
    }
}
