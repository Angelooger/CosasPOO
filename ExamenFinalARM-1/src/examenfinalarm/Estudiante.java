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
public abstract class Estudiante implements Recursos {
    protected static int id=0;
    protected String Nombre,aP,aM,Direccion;
    protected double Beca;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getaP() {
        return aP;
    }

    public void setaP(String aP) {
        this.aP = aP;
    }

    public String getaM() {
        return aM;
    }

    public void setaM(String aM) {
        this.aM = aM;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public double getBeca() {
        return Beca;
    }

    public void setBeca(double Beca) {
        this.Beca = Beca;
    }

    public Estudiante(String Nombre, String aP, String aM, String Direccion) {
        this.Nombre = Nombre;
        this.aP = aP;
        this.aM = aM;
        this.Direccion = Direccion;
        this.Beca = Beca;
        this.id+=1;
    }
    public abstract double asignarBeca();
     @Override
    public double obtenerMontoDinero() {
        return getBeca();
    }
    @Override
    public String toString(){
        return String.format("%s %s %s%n%s%n%.2f",this.Nombre,this.aP,this.aM,this.Direccion,this.Beca);
    }
    
    
}
