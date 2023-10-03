/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfazfarmancia;

/**
 *
 * @author candyfloss
 */
public class Jarabe extends Producto {

    private boolean dosificador;

    public Jarabe(boolean dosificador, String codigo, String nombre, int valorReferencial, int stock) {
        super(codigo, nombre, valorReferencial, stock);
        this.dosificador = dosificador;
    }

    public boolean isDosificador() {
        return dosificador;
    }

    public void setDosificador(boolean dosificador) {
        this.dosificador = dosificador;
    }

    @Override
    public int totalPagar(int cantidad) {
        if (existencia(cantidad)) {
            if (isDosificador()) {
                return (int) ((super.getValorReferencial() * cantidad) + (int) (UF * 0.75) * IVA);
            }
            return (int) ((super.getValorReferencial() * cantidad) * IVA);
        }
        return 0;
    }
}
