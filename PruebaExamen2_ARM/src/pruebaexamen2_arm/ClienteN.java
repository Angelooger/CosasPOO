/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaexamen2_arm;

/**
 *
 * @author Angel
 */
public class ClienteN {
    private String nombre;
    private String apellidoP;
    private String apellidoM;
    private String direccion;
    private String numeroT;
    private String usuario;
    private String contraseña;
    private Reservacion reservacion1;
    private Reservacion reservacion2;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNumeroT() {
        return numeroT;
    }

    public void setNumeroT(String numeroT) {
        this.numeroT = numeroT;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Reservacion getReservacion1() {
        return reservacion1;
    }

    public void setReservacion1(Reservacion reservacion1) {
        this.reservacion1 = reservacion1;
    }

    public Reservacion getReservacion2() {
        return reservacion2;
    }

    public void setReservacion2(Reservacion reservacion2) {
        this.reservacion2 = reservacion2;
    }

    public ClienteN(String nombre, String apellidoP, String apellidoM, String direccion, String numeroT, String usuario, String contraseña, Reservacion reservacion1, Reservacion reservacion2) {
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.direccion = direccion;
        this.numeroT = numeroT;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.reservacion1 = reservacion1;
        this.reservacion2 = reservacion2;
    }
            
    
    
    
}
