/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crucerocolaborativo;

/**
 *
 * @author candyfloss
 */
public class Viaje {
    private int valorDia;
    private char tipoCabina;

    public Viaje(int valorDia, char tipoCabina) {
        this.valorDia = valorDia;
        this.tipoCabina = tipoCabina;
    }

    public int getValorDia() {
        return valorDia;
    }

    public void setValorDia(int valorDia) {
        this.valorDia = valorDia;
    }

    public char getTipoCabina() {
        return tipoCabina;
    }

    public void setTipoCabina(char tipoCabina) {
        this.tipoCabina = tipoCabina;
    }
}
