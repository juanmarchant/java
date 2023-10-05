/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viajeejercicio;

/**
 *
 * @author candyfloss
 */
public class Transporte {
    private String tipoTransporte;
    private boolean escala;

    public Transporte(String tipoTransporte, boolean escala) {
        this.tipoTransporte = tipoTransporte;
        this.escala = escala;
    }

    public String getTipoTransporte() {
        return tipoTransporte;
    }

    public void setTipoTransporte(String tipoTransporte) {
        this.tipoTransporte = tipoTransporte;
    }

    public boolean isEscala() {
        return escala;
    }

    public void setEscala(boolean escala) {
        this.escala = escala;
    }
}
