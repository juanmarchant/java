/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viajeejercicio;

/**
 *
 * @author candyfloss
 */
public abstract class Viaje implements IValores, IImpuesto {

    private String codigo, destino;
    private int valorKM;
    private double distanciaKM;
    private Transporte tra;

    public Viaje(String codigo, String destino, int valorKM, double distanciaKM, Transporte tra) {
        this.codigo = codigo;
        this.destino = destino;
        this.valorKM = valorKM;
        this.distanciaKM = distanciaKM;
        this.tra = tra;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getValorKM() {
        return valorKM;
    }

    public void setValorKM(int valorKM) {
        this.valorKM = valorKM;
    }

    public double getDistanciaKM() {
        return distanciaKM;
    }

    public void setDistanciaKM(double distanciaKM) {
        this.distanciaKM = distanciaKM;
    }

    public Transporte getTra() {
        return tra;
    }

    public void setTra(Transporte tra) {
        this.tra = tra;
    }

    public abstract int valorViaje(double porcentajeImpuesto);

    @Override
    public int calculoImpuesto(double porcentaje) {
        return (int) ((porcentaje / 100) * valorInicial());
    }

    public int valorInicial() {
        if (getTra().isEscala()) {
            return (int) ((valorKM * distanciaKM) * (0.5 * valorKM));
        }
        return (int) (valorKM * distanciaKM);
    }

    public double descuento() {
        if (destino.compareToIgnoreCase("Brasil") == 0) {
            return 0.083;
        } else if (destino.compareToIgnoreCase("Peru") == 0) {
            return 0.097;
        } else if (destino.compareToIgnoreCase("Argentina") == 0) {
            return 0.104;
        } else {
            return 0;
        }
    }

}
