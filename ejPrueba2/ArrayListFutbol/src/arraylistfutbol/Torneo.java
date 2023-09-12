/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraylistfutbol;

import java.util.ArrayList;

/**
 *
 * @author candyfloss
 */
public class Torneo {

    private String nombreTorneo;
    private ArrayList<Partido> parti = new ArrayList<Partido>();

    public Torneo(String nombreTorneo) {
        this.nombreTorneo = nombreTorneo;
    }

    public String getNombreTorneo() {
        return nombreTorneo;
    }

    public void setNombreTorneo(String nombreTorneo) {
        this.nombreTorneo = nombreTorneo;
    }

    public ArrayList<Partido> getParti() {
        return parti;
    }

    public void setParti(ArrayList<Partido> parti) {
        this.parti = parti;
    }

    public int buscarCodigo(String codigoPartido) {

        for (int i = 0; i < parti.size(); i++) {

            if (codigoPartido.compareToIgnoreCase(parti.get(i).getCodigoPartido()) == 0) {
                return i;
            }
        }
        return -1;
    }

    public String agregarPartido(Partido pp) {
        if (buscarCodigo(pp.getCodigoPartido()) == -1) {
            parti.add(pp);
            return "Se ha agregado el partido exitosamente -> " + pp.getCodigoPartido();
        }
        return "No se ha podido agregar el partido.. codigo ya existente" + pp.getCodigoPartido();
    }

    public String eliminarPartido(String codigoPartido) {
        int pos = buscarCodigo(codigoPartido);
        if (pos != -1) {
            parti.remove(pos);
            return "Partido con codigo -> " + codigoPartido + " eliminado con exito";
        }
        return "Codigo no existe -> " + codigoPartido + " no se puede eliminar";
    }
}
