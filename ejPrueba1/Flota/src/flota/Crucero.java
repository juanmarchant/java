/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flota;

/**
 *
 * @author candyfloss
 */
public class Crucero {
    private int valorDia, cantidadDias;
    private String tipoCabina, destino;

    public Crucero(int valorDia, int cantidadDias, String tipoCabina, String destino) {
        this.valorDia = valorDia;
        this.cantidadDias = cantidadDias;
        this.tipoCabina = tipoCabina;
        this.destino = destino;
    }

    public int getValorDia() {
        return valorDia;
    }

    public void setValorDia(int valorDia) {
        this.valorDia = valorDia;
    }

    public int getCantidadDias() {
        return cantidadDias;
    }

    public void setCantidadDias(int cantidadDias) {
        this.cantidadDias = cantidadDias;
    }

    public String getTipoCabina() {
        return tipoCabina;
    }

    public void setTipoCabina(String tipoCabina) {
        this.tipoCabina = tipoCabina;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }
    
    public int getRebaja(int edad){
        System.out.println("Estamos en rebajas");
        
        if(edad > 60 && tipoCabina  == "E" && destino == "C" ) {
            return (int) (valorDia * 0.741);
        }else if(edad > 55 && tipoCabina  == "E" && destino == "G" ) {
            return (int) (valorDia * 0.676);
        }else if(edad > 70 && tipoCabina  == "I" && destino == "P" ) {
            return (int) (valorDia * 0.794);
        }else{
            return 0;
        }
        
    }
    
    public boolean getVip(){
        return cantidadDias > 15 && destino == "G" && tipoCabina =="I";
    }
    
    public double getTotalPagar(int cantidadPasajes){
        if(getVip()){
            return (cantidadPasajes * valorDia * cantidadDias) * 0.65 ;
        }else{
            return (cantidadPasajes * valorDia * cantidadDias) ;
        }
    }
}
