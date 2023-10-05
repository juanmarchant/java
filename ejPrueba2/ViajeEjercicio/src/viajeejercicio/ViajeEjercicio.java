/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package viajeejercicio;

/**
 *
 * @author candyfloss
 */
public class ViajeEjercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // Clases hijas
        ViajeInternacional viaInter = null;
        ViajeNacional viaNacio = null;
        Transporte tra = null;
        // Variables Viaje

        String codigo, destino, tipoTransporte;
        int op, valorKM, pos, tipoViaje;
        double distanciaKM, porcentajeImpuesto;

        // Manejadora
        Manejadora ma = new Manejadora();

        do {
            System.out.println("\tViaje");
            System.out.println("1. Crear viajes (Nacionales e Internacionales) el código no debe estar duplicado.");
            System.out.println("2. Mostrar tipo de trasporte, ciudad de destino y valor Viaje de un Viaje X");
            System.out.println("3. Eliminar un viaje según su código, mostrando un mensaje adecuado.");
            System.out.println("4. Mostrar la cantidad de viajes a Estados Unidos con transporte tipo barco");
            System.out.println("5. Mostrar el total de Impuestos de todos los viajes con escala");
            System.out.println("6. Mostrar total recaudado por todos los viajes por concepto de tasa de embarque");
            System.out.println("7. Salir");
            op = Leer.datoInt();

            switch (op) {
                case 1:
                    System.out.println("\tCreando viaje");

                    System.out.print("Ingrese el codigo del viaje: ");
                    codigo = Leer.dato();

                    pos = ma.buscarViaje(codigo);
                    if (pos == -1) {
                        do {
                            System.out.print("Ingrese el tipo de viaje (1: Nacionales | 2: Internacionales): ");
                            tipoViaje = Leer.datoInt();

                        } while (tipoViaje < 1 || tipoViaje > 2);

                        if (tipoViaje == 1) {
                            System.out.print("Ingrese la ciudad de destino: ");
                            destino = Leer.dato();
                            
                            System.out.print("Ingrese la distancia a recorrer: (1.2km): ");
                            distanciaKM =  Leer.datoDouble();
                            
                            System.out.print("Ingrese el valor del KM (1500): ");
                            valorKM =  Leer.datoInt();
                            
                            do {                                
                                System.out.println("Ingrese el tipo de transporte (Avion | Bus | Barco) ");
                                tipoTransporte = Leer.dato().trim();
                            } while (tipoTransporte.compareToIgnoreCase("Avion") == 0 && tipoTransporte > 3);
                        }

                    }
                    System.out.println("Codigo de viaje ya registrado.. intente con otro");
                    break;
                case 7:
                    System.out.println("Cerrando sistema....");
                    break;
                default:
                    System.out.println("Ingrese una de las opciones mencionadas (1-7)");
            }

        } while (op != 7);
    }

}
