/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colegio;

/**
 *
 * @author candyfloss
 */
public class Alumno {
    private String nombreAlumno;
    int notaControl1,notaControl2,notaControl3,notaPrueba1,notaPrueba2;

    public Alumno(String nombreAlumno, int notaControl1, int notaControl2, int notaControl3, int notaPrueba1, int notaPrueba2) {
        this.nombreAlumno = nombreAlumno;
        this.notaControl1 = notaControl1;
        this.notaControl2 = notaControl2;
        this.notaControl3 = notaControl3;
        this.notaPrueba1 = notaPrueba1;
        this.notaPrueba2 = notaPrueba2;
    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    public int getNotaControl1() {
        return notaControl1;
    }

    public void setNotaControl1(int notaControl1) {
        this.notaControl1 = notaControl1;
    }

    public int getNotaControl2() {
        return notaControl2;
    }

    public void setNotaControl2(int notaControl2) {
        this.notaControl2 = notaControl2;
    }

    public int getNotaControl3() {
        return notaControl3;
    }

    public void setNotaControl3(int notaControl3) {
        this.notaControl3 = notaControl3;
    }

    public int getNotaPrueba1() {
        return notaPrueba1;
    }

    public void setNotaPrueba1(int notaPrueba1) {
        this.notaPrueba1 = notaPrueba1;
    }

    public int getNotaPrueba2() {
        return notaPrueba2;
    }

    public void setNotaPrueba2(int notaPrueba2) {
        this.notaPrueba2 = notaPrueba2;
    }
    
    public int obtenerPromedio(){
        int promedio;
        promedio = (this.notaControl1 + this.notaControl2 + this.notaControl3) / 3 ;
        return promedio;
    }
    
    public double notaPresentacion(int notaExamen){
        double notaPresentacion, notaFinal;
        notaPresentacion = (this.notaPrueba1*0.35) + (this.notaPrueba2*0.4) + (this.obtenerPromedio()*0.25);
        notaFinal = (notaPresentacion*0.6) + notaExamen*0.4;
        return notaFinal;
    }

    
}
