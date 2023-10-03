/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author candyfloss
 */
public class Gato extends Mascota {

    private boolean peloLargo;

    public Gato(boolean peloLargo, String codigo, String nombreMascota, String nombreOwner) {
        super(codigo, nombreMascota, nombreOwner);
        this.peloLargo = peloLargo;
    }
    
    public boolean isPeloLargo() {
        return peloLargo;
    }

    public void setPeloLargo(boolean peloLargo) {
        this.peloLargo = peloLargo;
    }

    @Override
    public String onomatopeya() {
        return "miau";
    }
}
