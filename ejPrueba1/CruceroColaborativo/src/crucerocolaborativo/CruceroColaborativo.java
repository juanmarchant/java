/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package crucerocolaborativo;

/**
 *
 * @author candyfloss
 */
public class CruceroColaborativo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables
        Viaje via = null;
        Crucero cru = null;
        int valorDia, cantidaDias, op, edad, cantidaPasajes;
        char tipoCabina, destino;

        do {
            // Menu
            System.out.println("""
            \tTablitas flotadoras
            1. Crear Crucero
            2. Mostrar toda la informacion del crucero
            3. Rebaja
            4. Total a pagar
            5. Modificar destino
            6. Salir
            """);
            System.out.print("\tElija una opcion: ");
            op = Leer.datoInt();

            switch (op) {
                case 1 -> {
                    System.out.println("Creando Crucero...");

                    //Validar datos
                    do {
                        System.out.print("Ingrese el valor del dia ($20.000+): ");
                        valorDia = Leer.datoInt();
                    } while (valorDia < 20001);

                    do {
                        System.out.print("Ingrese el tipo de cabina (Exterior: E | Interior: I): ");
                        tipoCabina = Leer.datoChar();
                        tipoCabina = Character.toUpperCase(tipoCabina);
                    } while (tipoCabina != 'I' && tipoCabina != 'E');

                    do {
                        System.out.print("Ingrese la cantidad de dias (6+): ");
                        cantidaDias = Leer.datoInt();
                    } while (cantidaDias < 7);

                    do {
                        System.out.print("Ingrese el destino (Patagonia: P | Grecia: G | Caribe: C): ");
                        destino = Leer.datoChar();
                        destino = Character.toUpperCase(destino);
                    } while (destino != 'G' && destino != 'P' && destino != 'C');

                    //Se crea el crucero y viaje
                    via = new Viaje(valorDia, tipoCabina);
                    cru = new Crucero(cantidaDias, destino, via);
                    System.out.println("El crucero con destino a " + cru.getDestino() + " se ha creado exitosamente.");
                    break;

                }
                case 2 -> {
                    if (cru != null) {
                        System.out.println("Mostrando crucero...");
                        System.out.println("Valor del dia: " + cru.getVv().getValorDia()
                                + "\nTipo de cabina: " + cru.getVv().getTipoCabina()
                                + "\nCantidad de dias: " + cru.getCantidaDias()
                                + "\nDestino: " + cru.getDestino());
                        break;
                    } else {
                        System.out.println("Primero crea un crucero");
                        break;
                    }
                }
                case 3 -> {
                    if (cru != null) {

                        do {
                            System.out.print("Ingrese su edad (1+): ");
                            edad = Leer.datoInt();
                        } while (edad < 1);

                        if (cru.rebaja(edad) != 0) {
                            System.out.println("Tiene una rebaja de " + cru.rebaja(edad) + " de un total de " + cru.getVv().getValorDia());
                        } else {
                            System.out.println("No ha obtenido ninguna rebaja");
                        }
                        break;

                    } else {
                        System.out.println("Primero crea un crucero");
                        break;
                    }
                }
                case 4 -> {

                    if (cru != null) {

                        do {
                            System.out.println("Ingrese la cantidad de pasajes: ");
                            cantidaPasajes = Leer.datoInt();

                        } while (cantidaPasajes < 0);
                        System.out.println("El total a pagar es: " + cru.totalPagar(cantidaPasajes));
                        break;
                    } else {
                        System.out.println("Primero crea un crucero");
                        break;
                    }
                }
                case 5 -> {
                    if (cru != null) {
                        char destinoAux = cru.getDestino();
                        do {
                            System.out.print("Ingrese el destino: ");
                            destino = Leer.datoChar();
                            destino = Character.toUpperCase(destino);
                        } while (destino != 'G' && destino != 'P' && destino != 'C');
                        cru.setDestino(destino);
                        System.out.println("Se ha cambiado el destino: " + destinoAux + " -> " + cru.getDestino());

                        break;
                    } else {
                        System.out.println("Primero crea un crucero");
                        break;
                    }
                }
                case 6 ->
                    System.out.println("Cerrando Sistema...");
                default ->
                    System.out.println("Elija una de las opciones mencionadas (1-6)");
            }
        } while (op != 6);
    }

}
