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
public class Cliente {
    private String nombre;
    private String apellido;
    private String fechaNacimiento;
    private int numeroCliente;
    private Direccion direccion1;
    private Direccion direccion2;
    private Direccion direccion3;

    public Cliente(String nombre, String apellido, String fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.numeroCliente=0;
    }
    
    public Cliente(String nombre, String apellido, String fechaNacimiento, int numeroCliente, Direccion direccion1, Direccion direccion2, Direccion direccion3) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.numeroCliente = numeroCliente;
        this.direccion1 = direccion1;
        this.direccion2 = direccion2;
        this.direccion3 = direccion3;
    }
    
    

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public Direccion getDireccion1() {
        return direccion1;
    }

    public void setDireccion1(Direccion direccion1) {
        this.direccion1 = direccion1;
    }

    public Direccion getDireccion2() {
        return direccion2;
    }

    public void setDireccion2(Direccion direccion2) {
        this.direccion2 = direccion2;
    }

    public Direccion getDireccion3() {
        return direccion3;
    }

    public void setDireccion3(Direccion direccion3) {
        this.direccion3 = direccion3;
    }
    
    
}
