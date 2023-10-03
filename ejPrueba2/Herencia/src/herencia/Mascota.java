/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author candyfloss
 */
public class Mascota {

    private String codigo, nombreMascota, nombreOwner;

    public Mascota(String codigo, String nombreMascota, String nombreOwner) {
        this.codigo = codigo;
        this.nombreMascota = nombreMascota;
        this.nombreOwner = nombreOwner;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public String getNombreOwner() {
        return nombreOwner;
    }

    public void setNombreOwner(String nombreOwner) {
        this.nombreOwner = nombreOwner;
    }

    public String onomatopeya() {
        return "";
    }

    @Override
    public String toString() {
        return "Mascota{" + "codigo=" + codigo + ", nombreMascota=" + nombreMascota + ", nombreOwner=" + nombreOwner + '}';
    }
    
    
}
