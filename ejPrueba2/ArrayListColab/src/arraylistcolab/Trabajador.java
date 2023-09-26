/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraylistcolab;

/**
 *
 * @author candyfloss
 */
public class Trabajador {

    private String cargo;
    private DatosPersonales unDato;
    private int[] horasNormales = new int[20];
    private int[] horasExtras = new int[20];

    public Trabajador(String cargo, DatosPersonales unDato) {
        this.cargo = cargo;
        this.unDato = unDato;

        for (int i = 0; i < horasNormales.length; i++) {
            horasNormales[i] = (int) (Math.floor(Math.random() * (0 - 8 + 1) + 8));
        }
        for (int i = 0; i < horasExtras.length; i++) {
            horasExtras[i] = (int) (Math.floor(Math.random() * (0 - 8 + 1) + 8));
        }
    }

    public int[] getHorasNormales() {
        return horasNormales;
    }

    public void setHorasNormales(int[] horasNormales) {
        this.horasNormales = horasNormales;
    }

    public int[] getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(int[] horasExtras) {
        this.horasExtras = horasExtras;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public DatosPersonales getUnDato() {
        return unDato;
    }

    public void setUnDato(DatosPersonales unDato) {
        this.unDato = unDato;
    }

    public int valorHoraNormal() {
        if (cargo.compareToIgnoreCase("Supervisor") == 0) {
            return 18500;
        } else if (cargo.compareToIgnoreCase("Profesional") == 0) {
            return 15700;
        } else if (cargo.compareToIgnoreCase("Tecnico") == 0) {
            return 12000;
        } else {
            return 10000;
        }
    }

    public int diasNoTrabajados() {
        int contador = 0;
        for (int i = 0; i < horasNormales.length; i++) {
            if (horasNormales[i] == 0) {
                contador++;
            }
        }
        return contador;
    }

    public int trabajoDuro() {
        int contador = 0;
        for (int i = 0; i < horasNormales.length; i++) {
            if ((horasNormales[i] + horasExtras[i]) > 12) {
                contador++;
            }
        }
        return contador;
    }

    public int totalHorasNormales() {
        int total = 0;
        for (int i = 0; i < horasNormales.length; i++) {
            total = total + horasNormales[i];
        }
        return total;
    }

    public int totalHorasExtras() {
        int total = 0;
        for (int i = 0; i < horasExtras.length; i++) {
            total = total + horasExtras[i];
        }
        return total;
    }

    public int sueldoBruto() {
        return (int) ((totalHorasNormales() * valorHoraNormal()) + (totalHorasExtras() * (valorHoraNormal() * 1.5)));

    }

}
