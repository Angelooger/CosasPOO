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
public class Doctorado extends Estudiante{
    protected int ArtC,ArtR;

    public int getArtC() {
        return ArtC;
    }

    public void setArtC(int ArtC) {
        this.ArtC = ArtC;
    }

    public int getArtR() {
        return ArtR;
    }

    public void setArtR(int ArtR) {
        this.ArtR = ArtR;
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
    public Doctorado(String Nombre, String aP, String aM, String Direccion,int ArtC, int ArtR) {
        super(Nombre, aP, aM, Direccion);
        this.ArtC = ArtC;
        this.ArtR = ArtR;
    }

    @Override
    public double asignarBeca() {
        return Beca=15000+this.ArtR*500+this.ArtC*100;
    }
    @Override
    public String toString(){
        return String.format("%s %s %s%n%s%n%.2f%n%d%n%d",this.Nombre,this.aP,this.aM,this.Direccion,this.Beca,this.ArtC,this.ArtR);
    }
    
}
