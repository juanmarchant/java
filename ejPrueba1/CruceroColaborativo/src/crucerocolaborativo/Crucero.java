/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crucerocolaborativo;

/**
 *
 * @author candyfloss
 */
public class Crucero {
   private int cantidaDias;
   private char destino;
   private Viaje vv;

    public Crucero(int cantidaDias, char destino, Viaje vv) {
        this.cantidaDias = cantidaDias;
        this.destino = destino;
        this.vv = vv;
    }

    public int getCantidaDias() {
        return cantidaDias;
    }

    public void setCantidaDias(int cantidaDias) {
        this.cantidaDias = cantidaDias;
    }

    public char getDestino() {
        return destino;
    }

    public void setDestino(char destino) {
        this.destino = destino;
    }

    public Viaje getVv() {
        return vv;
    }

    public void setVv(Viaje vv) {
        this.vv = vv;
    }
    
    public int rebaja(int edad){
        int reb = 0;
        if(vv.getTipoCabina() == 'E' && edad > 60 && destino == 'C'){
            reb = (int) ( vv.getValorDia() *0.259);
        }
        if(vv.getTipoCabina() == 'E' && edad > 55 && destino == 'G'){
            reb = (int) ( vv.getValorDia() *0.324);
        }
        
        if(vv.getTipoCabina() == 'I' && edad > 70 && destino == 'P'){
            reb = (int) ( vv.getValorDia() *0.206);
        }
        return reb;
    }

    public boolean esVip(){
       return cantidaDias > 15 && vv.getTipoCabina() =='I' && destino == 'G';
    }
    
    public int totalPagar(int cantidaPasajes){
        int total;
        total = vv.getValorDia() * cantidaPasajes * cantidaDias ;
        if(esVip()){
            return (int) (total * 0.65);
        }else{
            return total;
        } 
    }
}
