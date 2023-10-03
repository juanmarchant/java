/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interfazfarmancia;

/**
 *
 * @author candyfloss
 */
public class InterfazFarmancia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Pastilla pas = null;
        Jarabe jar = null;
        String codigo, nombre, nombreC;
        boolean dosificador;
        int valorReferencial, stock, op = 0, op1 = 0, pos, cantidad;

        //Manejadora
        Manejadora ma = new Manejadora();

        do {
            System.out.println("\tFarmacia");
            System.out.println("1. Ingresar producto (Pastilla o Jarabe, si el producto existe, deberá sólo aumentar el stock)");
            System.out.println("2. Mostrar datos (mostrará toda la información de un producto X)");
            System.out.println("3. Comprar (Mostrará el total a pagar por un cliente X)");
            System.out.println("4. Eliminar producto (Eliminará todos los productos que tengan Stock igual a cero)");
            System.out.println("5. Salir");
            System.out.print("\tIngrese alguna de las opciones mencionadas (1-5): ");
            op = Leer.datoInt();

            switch (op) {
                case 1:
                    System.out.println("\tIngresando produto");

                    System.out.print("Ingrese el codigo: ");
                    codigo = Leer.dato();
                    System.out.print("Ingrese el nombre: ");
                    nombre = Leer.dato();
                    System.out.print("Ingrese el valor referencial: ");
                    valorReferencial = Leer.datoInt();
                    System.out.print("Ingrese el stock: ");
                    stock = Leer.datoInt();

                    do {
                        System.out.print("Ingrese que tipo de producto es (1: Jarabe | 2: Pastilla): ");
                        op1 = Leer.datoInt();
                    } while (op1 < 1 || op1 > 2);

                    if (op1 == 1) {
                        System.out.println("El Jarabe tiene dosificador? (true/false): ");
                        dosificador = Leer.datoBoolean();

                        jar = new Jarabe(dosificador, codigo, nombre, valorReferencial, stock);
                        System.out.println(ma.ingresarProducto(jar));
                    } else {
                        pas = new Pastilla(codigo, nombre, valorReferencial, stock);
                        System.out.println(ma.ingresarProducto(pas));
                    }
                    break;
                case 2:
                    System.out.println("\tMostrando Producto");
                    System.out.print("Ingrese el codigo: ");
                    codigo = Leer.dato();
                    pos = ma.buscarProducto(codigo);
                    if (pos == -1) {
                        System.out.println("El producto no se encuentra...");
                    } else {
                        System.out.println("Nombre: " + ma.getPro().get(pos).getNombre());
                        System.out.println("Codigo: " + ma.getPro().get(pos).getCodigo());
                        System.out.println("Valor Referencial: " + ma.getPro().get(pos).getNombre());
                        System.out.println("Stock: " + ma.getPro().get(pos).getStock());

                        if (ma.getPro().get(pos) instanceof Jarabe) {
                            System.out.println("Dosificador: " + ((Jarabe) ma.getPro().get(pos)).isDosificador());
                        }
                    }
                    break;
                case 3:

                    System.out.println("\tComprando Producto...");
                    System.out.print("Ingrese el codigo del producto: ");
                    codigo = Leer.dato();

                    pos = ma.buscarProducto(codigo);
                    if (pos == -1) {
                        System.out.println("El producto que estas intentando comprar no se encuentra.... registralo primero");
                    } else {
                        do {
                            System.out.println("Ingrese la cantidad que desea comprar: (0+) ");
                            cantidad = Leer.datoInt();
                        } while (cantidad < 0);

                        if (ma.getPro().get(pos).existencia(cantidad)) {
                            System.out.println("Ingrese el nombre del cliente");
                            nombreC = Leer.dato().trim();
                            if (((Pastilla) ma.getPro().get(pos)) instanceof Pastilla) {
                                System.out.println("El cliente " + nombreC + " tiene que pagar -> " + ((Pastilla) ma.getPro().get(pos)).totalPagar(cantidad));
                            } else {
                                System.out.println("El cliente " + nombreC + " tiene que pagar -> " + ((Jarabe) ma.getPro().get(pos)).totalPagar(cantidad));
                            }
                        }
                    }
                    break;
                case 4:
                    System.out.println("Eliminando productos con 0 stock..");
                    ma.eliminarProducto();
                    break;
                case 5:
                    System.out.println("Cerrando sistema.....");
                    break;
                default:
                    System.out.println("Ingrese alguna de las opciones mencionadas (1-5):");
            }

        } while (op != 5);
    }

}
