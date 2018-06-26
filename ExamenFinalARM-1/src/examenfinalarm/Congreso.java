/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenfinalarm;

/**
 *
 * @author Angel
 */
public class Congreso implements Recursos{
    protected String lugar,fechaI,fechaT,nombreO, nombreC;
    protected int numA;
    protected double cantidadA;

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getFechaI() {
        return fechaI;
    }

    public void setFechaI(String fechaI) {
        this.fechaI = fechaI;
    }

    public String getFechaT() {
        return fechaT;
    }

    public void setFechaT(String fechaT) {
        this.fechaT = fechaT;
    }

    public String getNombreO() {
        return nombreO;
    }

    public void setNombreO(String nombreO) {
        this.nombreO = nombreO;
    }

    public String getNombreC() {
        return nombreC;
    }

    public void setNombreC(String nombreC) {
        this.nombreC = nombreC;
    }

    public int getNumA() {
        return numA;
    }

    public void setNumA(int numA) {
        this.numA = numA;
    }

    public double getCantidadA() {
        return cantidadA;
    }

    public void setCantidadA(double cantidadA) {
        this.cantidadA = cantidadA;
    }

    public Congreso(String lugar, String fechaI, String fechaT, String nombreO, String nombreC, int numA, double cantidadA) {
        this.lugar = lugar;
        this.fechaI = fechaI;
        this.fechaT = fechaT;
        this.nombreO = nombreO;
        this.nombreC = nombreC;
        this.numA = numA;
        this.cantidadA = cantidadA;
    }

    @Override
    public double obtenerMontoDinero() {
        return this.cantidadA=3*30000+1500*numA;
    }
    @Override
    public String toString(){
        return String.format("%s%n%s%n%s - %s%n%d%n%s.2f%n",this.nombreC,this.nombreO,this.fechaI,this.fechaT,this.numA,this.cantidadA);
    }
}
