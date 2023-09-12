/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juanmarchant;

/**
 *
 * @author candyfloss
 */
public class Empleado {

    private Informacion info;
    private char turno;
    private int valorHora, totalHoras;

    public Empleado(Informacion info, char turno, int valorHora) {
        this.info = info;
        this.turno = turno;
        this.valorHora = valorHora;
    }

    public Informacion getInfo() {
        return info;
    }

    public void setInfo(Informacion info) {
        this.info = info;
    }

    public char getTurno() {
        return turno;
    }

    public void setTurno(char turno) {
        this.turno = turno;
    }

    public int getValorHora() {
        return valorHora;
    }

    public void setValorHora(int valorHora) {
        this.valorHora = valorHora;
    }

    public void asignarHora() {

        if (info.getCargo().compareToIgnoreCase("mozo") == 0 && turno == 'D') {
            valorHora = 8000;
        } else if (info.getCargo().compareToIgnoreCase("cantinero") == 0 && turno == 'N') {
            valorHora = 12000;
        } else if (info.getCargo().compareToIgnoreCase("limpieza") == 0 && turno == 'T') {
            valorHora = 9500;
        } else {
            valorHora = 7000;
        }

    }

    public void pagarEvento(int totalHoras){
        int total = valorHora * totalHoras;
        
        
        if(turno == 'N'){
            total = (int) (total * 1.10);
        }
        if (info.getCargo().compareToIgnoreCase("limpieza") == 0) {
            total = (int) (total * 1.05);
        }
        
        System.out.println("El total a pagar a el empleado es:  $" + total);
    }
}
