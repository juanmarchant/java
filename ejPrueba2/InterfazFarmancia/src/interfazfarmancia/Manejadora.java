/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfazfarmancia;

import java.util.ArrayList;

/**
 *
 * @author candyfloss
 */
public class Manejadora {

    private ArrayList<Producto> pro = new ArrayList<Producto>();

    public Manejadora() {
    }

    public ArrayList<Producto> getPro() {
        return pro;
    }

    public void setPro(ArrayList<Producto> pro) {
        this.pro = pro;
    }

    public int buscarProducto(String codigo) {
        for (int i = 0; i < pro.size(); i++) {
            if (codigo.compareToIgnoreCase(pro.get(i).getCodigo()) == 0) {
                return i;
            }
        }
        return -1;
    }

    public String ingresarProducto(Producto pp) {
        int pos = buscarProducto(pp.getCodigo());
        int auxiliar = 0;
        if (pos == -1) {
            pro.add(pp);
            return "Se ha agregado exitosamente el producto "+ pp.getNombre() ;
        } else {
            auxiliar = pro.get(pos).getStock() + pp.getStock();
            pro.get(pos).setStock(auxiliar);
            return "Este producto ya existe, se ha aumentado el stock ";
        }
    }

    public void eliminarProducto() {
        for (int i = 0; i < pro.size(); i++) {
            if (pro.get(i).getStock() == 0) {
                pro.remove(i);
                i--;
            }
        }
    }

}
