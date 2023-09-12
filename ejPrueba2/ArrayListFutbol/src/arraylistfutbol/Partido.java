/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraylistfutbol;

/**
 *
 * @author candyfloss
 */
public class Partido {

    private String codigoPartido, equipoLocal, equipoVisitante;
    private int golesLocal, golesVisitante;

    public Partido(String codigoPartido, String equipoLocal, String equipoVisitante, int golesLocal, int golesVisitante) {
        this.codigoPartido = codigoPartido;
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.golesLocal = golesLocal;
        this.golesVisitante = golesVisitante;
    }

    public String getCodigoPartido() {
        return codigoPartido;
    }

    public void setCodigoPartido(String codigoPartido) {
        this.codigoPartido = codigoPartido;
    }

    public String getEquipoLocal() {
        return equipoLocal;
    }

    public void setEquipoLocal(String equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public String getEquipoVisitante() {
        return equipoVisitante;
    }

    public void setEquipoVisitante(String equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }

    public int getGolesLocal() {
        return golesLocal;
    }

    public void setGolesLocal(int golesLocal) {
        this.golesLocal = golesLocal;
    }

    public int getGolesVisitante() {
        return golesVisitante;
    }

    public void setGolesVisitante(int golesVisitante) {
        this.golesVisitante = golesVisitante;
    }

    public String ganador() {
        if (golesLocal > golesVisitante) {
            return "Ganador Local -> " + equipoLocal + " -> " + golesLocal + " : " + golesVisitante + " <- " + equipoVisitante;
        } else if (golesVisitante > golesLocal) {
            return "Ganador Visitante -> " + equipoVisitante + " -> " + golesVisitante + " : " + golesLocal + " <- " + equipoLocal;
        } else {
            return "Los equipos empataron a " + golesLocal + "( " + equipoLocal + " | " + equipoVisitante + " )";
        }
    }
}
