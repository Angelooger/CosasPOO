/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebae;

/**
 *
 * @author Angel
 */
public class EmpleadoComision {
    
    private String nombreEC;
    private String apellidoEC;
    private String nssEC;
    private double ventasBrutas;
    private double porcentajeComisionEC;
    private double ingresoEC;

    public String getNombreEC() {
        return nombreEC;
    }

    public void setNombreEC(String nombreEC) {
        this.nombreEC = nombreEC;
    }

    public String getApellidoEC() {
        return apellidoEC;
    }

    public void setApellidoEC(String apellidoEC) {
        this.apellidoEC = apellidoEC;
    }

    public String getNssEC() {
        return nssEC;
    }

    public void setNssEC(String nssEC) {
        this.nssEC = nssEC;
    }

    public double getVentasBrutas() {
        return ventasBrutas;
    }

    public void setVentasBrutas(double ventasBrutas) {
        this.ventasBrutas = ventasBrutas;
    }

    public double getPorcentajeComisionEC() {
        return porcentajeComisionEC;
    }

    public void setPorcentajeComisionEC(double porcentajeComisionEC) {
        this.porcentajeComisionEC = porcentajeComisionEC;
    }

    public double getIngreso() {
        return ingresoEC;
    }

    public void setIngreso(double ingreso) {
        this.ingresoEC = ingreso;
    }

    public EmpleadoComision(String nombreEC, String apellidoEC, String nssEC, double ventasBrutas, double porcentajeComisionEC) {
        this.nombreEC = nombreEC;
        this.apellidoEC = apellidoEC;
        this.nssEC = nssEC;
        this.ventasBrutas = ventasBrutas;
        this.porcentajeComisionEC = porcentajeComisionEC;
    }
    
    public void calcularIngreso(){
        ingresoEC=ventasBrutas*(porcentajeComisionEC/100);
        
    }
    
}
