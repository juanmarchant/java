/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfazfarmancia;

/**
 *
 * @author candyfloss
 */
public class Pastilla extends Producto {

    public Pastilla(String codigo, String nombre, int valorReferencial, int stock) {
        super(codigo, nombre, valorReferencial, stock);
    }
    
    @Override
    public int totalPagar(int cantidad){
        if(super.existencia(cantidad)){  
            return (int) ((super.getValorReferencial() * cantidad) *IVA);
        }
        return 0;
    }
}
