/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

import java.util.ArrayList;

/**
 *
 * @author candyfloss
 */
public class Manejadora {

    private ArrayList<Mascota> mas = new ArrayList<Mascota>();

    public Manejadora() {
    }

    public ArrayList<Mascota> getMas() {
        return mas;
    }

    public void setMas(ArrayList<Mascota> mas) {
        this.mas = mas;
    }

    public int buscarMascota(String codigo) {

        for (int i = 0; i < mas.size(); i++) {
            if (codigo.compareToIgnoreCase(mas.get(i).getCodigo()) == 0) {
                return i;
            }
        }
        return -1;
    }

    public String ingresarMascota(Mascota ma) {
        if (buscarMascota(ma.getCodigo()) == -1) {
            mas.add(ma);
            return "Se ha agregado exitosamente la mascota " + ma.getNombreMascota();
        }
        return "No se ha apodido agregar la mascota... esta ya esta agregada :(";
    }

    public String eliminarMascota() {
        int count = 0;
        for (int i = 0; i < mas.size(); i++) {
            if (mas.get(i).getNombreOwner().compareToIgnoreCase("Pepe") == 0) {
                mas.remove(i);
                count++;
            }
        }

        if (count > 0) {
            return "Se han eliminado " + count + " mascotas";
        }
        return "No hay ninguna mascota con el duenno Pepe";
    }

    public int gatosPeloLargo() {
        int count = 0;
        for (int i = 0; i < mas.size(); i++) {

            if (mas.get(i) instanceof Gato && ((Gato) mas.get(i)).isPeloLargo()) {
                count++;
            }
        }
        return count;
    }

    public int perroSenior() {
        int count = 0;
        for (int i = 0; i < mas.size(); i++) {
            if (mas.get(i) instanceof Perro) {
                if (((Perro) mas.get(i)).years() > 60) {
                    count++;
                }
            }
        }
        return count;
    }
}
