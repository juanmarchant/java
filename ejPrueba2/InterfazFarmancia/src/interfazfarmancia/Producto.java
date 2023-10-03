/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfazfarmancia;

/**
 *
 * @author candyfloss
 */
public abstract class Producto implements IEspeciales {

    private String codigo, nombre;
    private int valorReferencial, stock;

    public Producto(String codigo, String nombre, int valorReferencial, int stock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.valorReferencial = valorReferencial;
        this.stock = stock;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getValorReferencial() {
        return valorReferencial;
    }

    public void setValorReferencial(int valorReferencial) {
        this.valorReferencial = valorReferencial;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public abstract int totalPagar(int cantidad);

    //Metodos
    @Override
    public boolean existencia(int cantidad) {
        if (stock >= cantidad) {
            despacho(cantidad);
            return true;
        }
        return false;
    }

    @Override
    public void despacho(int cantidad) {
        stock -= cantidad;
    }

}
