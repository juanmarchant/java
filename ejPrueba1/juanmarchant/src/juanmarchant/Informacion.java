/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juanmarchant;

/**
 *
 * @author candyfloss
 */
public class Informacion {

    private String rut, cargo, nombre;
    
    public Informacion(String rut, String cargo, String nombre) {
        this.rut = rut;
        this.cargo = cargo;
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
   
}
