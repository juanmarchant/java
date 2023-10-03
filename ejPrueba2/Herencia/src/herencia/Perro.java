/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author candyfloss
 */
public class Perro extends Mascota {

    private int numI, edad;

    public Perro(int numI, int edad, String codigo, String nombreMascota, String nombreOwner) {
        super(codigo, nombreMascota, nombreOwner);
        this.numI = numI;
        this.edad = edad;
    }

    public int getNumI() {
        return numI;
    }

    public void setNumI(int numI) {
        this.numI = numI;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String onomatopeya() {
        return "guau";
    }

    public int years() {
        return edad * 7;
    }
}
