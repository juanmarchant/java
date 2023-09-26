/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraylistcolab;

import java.util.ArrayList;

/**
 *
 * @author candyfloss
 */
public class Empresa {

    private String nombre;
    private ArrayList<Trabajador> tra = new ArrayList<Trabajador>();

    public Empresa(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Trabajador> getTra() {
        return tra;
    }

    public void setTra(ArrayList<Trabajador> tra) {
        this.tra = tra;
    }

    public int buscar(String rut) {
        for (int i = 0; i < tra.size(); i++) {
            if (rut.compareToIgnoreCase(tra.get(i).getUnDato().getRut()) == 0) {
                return i;
            }
        }
        return -1;
    }

    public String ingresarTrabajador(Trabajador tr) {
        if (buscar(tr.getUnDato().getRut()) == -1) {
            tra.add(tr);
            return "Se ha agregado exitosamente el trabajador: " + tr.getUnDato().getNombre() + " -> " + tr.getUnDato().getRut();
        }
        return "NO se ha podido agregar el trabajador.. ya existente: " + tr.getUnDato().getNombre() + " -> " + tr.getUnDato().getRut();
    }

    public String eliminarTrabajador(String rut) {
        int pos = buscar(rut);
        if (pos != -1) {
            tra.remove(pos);
            return "Se ha eliminado al trabajador: " + rut;
        }
        return "No se ha eliminado el trabajador(no existe): " + rut;
    }

    public int cantidadProfesionales() {
        return tra.size();
    }

    public int mayorSueldoBruto() {
        
        int pos = 0;
        int mayorIgual = tra.get(0).sueldoBruto();
        
        for (int i = 0; i < tra.size(); i++) {
            if (tra.get(i).sueldoBruto() > mayorIgual) {
                mayorIgual = tra.get(i).sueldoBruto();
                pos =  i;
            }
        }
        return pos;
    }
}
