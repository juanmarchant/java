/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfazfarmancia;

/**
 *
 * @author candyfloss
 */
public interface IEspeciales {
    //Constantes
    public static final double IVA = 1.19;
    public static final double UF = 26224.30;
    
    //Metodos
    public abstract boolean existencia(int cantidad);
    public abstract void despacho(int cantidad);
}
