/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaa;

/**
 *
 * @author Angel
 */
public class Alumno {
    private int id;
    private String nombre;
    private String apellido;
    private int edad;
    private double promedio;
    public static int contador=0;

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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public Alumno(String nombre, String apellido, int edad, double promedio) {
        this.id=Alumno.contador;
        Alumno.incrementar_contador();
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.promedio = promedio;
    }
    
    public static void incrementar_contador(){
        Alumno.contador++;
    }
    
    
}
