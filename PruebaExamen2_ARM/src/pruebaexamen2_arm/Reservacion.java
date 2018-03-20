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
public class Reservacion {
    private String fechaR;
    private String horarioR;
    private String origenR;
    private String destinoR;

    public String getFechaR() {
        return fechaR;
    }

    public void setFechaR(String fechaR) {
        this.fechaR = fechaR;
    }

    public String getHorarioR() {
        return horarioR;
    }

    public void setHorarioR(String horarioR) {
        this.horarioR = horarioR;
    }

    public String getOrigenR() {
        return origenR;
    }

    public void setOrigenR(String origenR) {
        this.origenR = origenR;
    }

    public String getDestinoR() {
        return destinoR;
    }

    public void setDestinoR(String destinoR) {
        this.destinoR = destinoR;
    }

    public Reservacion(String fechaR, String horarioR, String origenR, String destinoR) {
        this.fechaR = fechaR;
        this.horarioR = horarioR;
        this.origenR = origenR;
        this.destinoR = destinoR;
    }
    
    
}
