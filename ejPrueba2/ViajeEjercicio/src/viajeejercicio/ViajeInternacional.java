/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viajeejercicio;

/**
 *
 * @author candyfloss
 */
public class ViajeInternacional extends Viaje {

    public ViajeInternacional(String codigo, String destino, int valorKM, double distanciaKM, Transporte tra) {
        super(codigo, destino, valorKM, distanciaKM, tra);
    }
    
    @Override
    public int valorViaje(double porcentajeImpuesto){
        int totalTasa = (int) (EMBARQUE * DOLAR);
        return  (int) (valorInicial() + (0.4 * valorInicial() )- descuento()) + calculoImpuesto(porcentajeImpuesto) + totalTasa;
    }
}
