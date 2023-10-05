/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viajeejercicio;

import java.util.ArrayList;

/**
 *
 * @author candyfloss
 */
public class Manejadora {

    private ArrayList<Viaje> via = new ArrayList<Viaje>();

    public Manejadora() {
    }

    public ArrayList<Viaje> getVia() {
        return via;
    }

    public void setVia(ArrayList<Viaje> via) {
        this.via = via;
    }

    public int buscarViaje(String codigo) {

        for (int i = 0; i < via.size(); i++) {
            if (codigo.compareToIgnoreCase(via.get(i).getCodigo()) == 0) {
                return i;
            }
        }
        return -1;
    }

    public String ingresarViaje(Viaje vj) {
        int pos = buscarViaje(vj.getCodigo());
        if (pos == -1) {
            via.add(vj);
            return "Se ha ingresado el viaje " + vj.getCodigo();
        }
        return "El viaje ya esta ingresado.. intentelo nuevamente con otro codigo";
    }

    public String eliminarViaje(String codigo) {
        int pos = buscarViaje(codigo);
        if (pos == -1) {
            return "El viaje ingresado no existe.. ingrese otro codigo";
        }
        via.remove(pos);
        return "El viaje con codigo -> " + codigo + " ha sido eliminado.";
    }

    public int contadorUS() {
        int count = 0;
        for (int i = 0; i < via.size(); i++) {
            if (via.get(i) instanceof ViajeInternacional) {
                if ((via.get(i).getDestino()).compareToIgnoreCase("Estados Unidos") == 0 && (via.get(i).getTra().getTipoTransporte()).compareToIgnoreCase("Barco") == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public int totalImpuestos(double procentajeImpuesto) {
        int total = 0;
        int impuesto;
        for (int i = 0; i < via.size(); i++) {
            if (via.get(i).getTra().isEscala()) {
                impuesto = via.get(i).calculoImpuesto(procentajeImpuesto);
                total += impuesto;
            }
        }
        return total;
    }

    public int totalEmbarque() {
        int total = 0;
        for (int i = 0; i < via.size(); i++) {
            if (via.get(i) instanceof ViajeInternacional) {
                total += (int) (Viaje.EMBARQUE * Viaje.DOLAR);
            }
        }
        return total;
    }
}
