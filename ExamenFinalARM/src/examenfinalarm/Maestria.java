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
public class Maestria extends Estudiante{
    protected int NumArtJ;

    public int getNumArtJ() {
        return NumArtJ;
    }

    public void setNumArtJ(int NumArtJ) {
        this.NumArtJ = NumArtJ;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Estudiante.id = id;
    }

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

    public Maestria(String Nombre, String aP, String aM, String Direccion, int NumArtJ) {
        super(Nombre, aP, aM, Direccion);
        this.NumArtJ = NumArtJ;
        asignarBeca();
    }

    @Override
    public double asignarBeca() {
        
        return Beca=9000+this.NumArtJ*500;
    }
    @Override
    public String toString(){
        return String.format("%s %s %s%n%s%n%.2f%n%d",this.Nombre,this.aP,this.aM,this.Direccion,this.Beca,this.NumArtJ);
    }
}
