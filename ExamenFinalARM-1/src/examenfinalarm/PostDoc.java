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
public class PostDoc extends Doctorado{
    protected int NumP;

    public int getNumP() {
        return NumP;
    }

    public void setNumP(int NumP) {
        this.NumP = NumP;
    }

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

    public PostDoc(String Nombre, String aP, String aM, String Direccion, int ArtC, int ArtR,int NumP) {
        super(Nombre, aP, aM, Direccion, ArtC, ArtR);
        this.NumP = NumP;
    }
    @Override
    public double asignarBeca() {
        return Beca=24000+this.ArtR*300+this.ArtC*100+this.NumP*1000;
    }
    @Override
    public String toString(){
        return String.format("%s %s %s%n%s%n%.2f%n%d%n%d%n%d",this.Nombre,this.aP,this.aM,this.Direccion,this.Beca,this.ArtC,this.ArtR,this.NumP);
    }
}
