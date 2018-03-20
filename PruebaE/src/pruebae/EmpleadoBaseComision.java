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
public class EmpleadoBaseComision extends EmpleadoComision{
    private double sueldoBaseEC;
    
    public double getSueldoBaseEC() {
        return sueldoBaseEC;
    }

    public void setSueldoBaseEC(double sueldoBaseEC) {
        this.sueldoBaseEC = sueldoBaseEC;
    }

    public EmpleadoBaseComision(double sueldoBaseEC, String nombreEC, String apellidoEC, String nssEC, double ventasBrutas, double porcentajeComisionEC) {
        super(nombreEC, apellidoEC, nssEC, ventasBrutas, porcentajeComisionEC);
        this.sueldoBaseEC = sueldoBaseEC;
    }
    
    @Override
    public void calcularIngreso(){
        this.setIngreso(sueldoBaseEC+this.getVentasBrutas()*(this.getPorcentajeComisionEC()/100));
    }
}
