/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylistfutbol;

/**
 *
 * @author candyfloss
 */
public class ArrayListFutbol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Partido pp = null;
        String codigoPartido, equipoLocal, equipoVisitante, nombreTorneo, codigoBuscar;
        int golesLocal, golesVisitante, op, pos;

        System.out.print("Ingrese el nombre del torneo: ");
        nombreTorneo = Leer.dato();

        Torneo tor = new Torneo(nombreTorneo);

        do {
            System.out.println("\tTorneo " + nombreTorneo);
            System.out.println("1. Crear partido");
            System.out.println("2. Mostrar un partido");
            System.out.println("3. Eliminar partido");
            System.out.println("4. Mostrar ganador");
            System.out.println("5. Salir");

            System.out.print("\t Ingrese una opcion (1-5): ");
            op = Leer.datoInt();

            switch (op) {
                case 1:

                    System.out.println("Creando partido...");

                    System.out.print("Ingrese el codigo del partido: ");
                    codigoPartido = Leer.dato();

                    System.out.print("Nombre equipo local: ");
                    equipoLocal = Leer.dato();

                    System.out.print("Nombre equipo equipo visitante: ");
                    equipoVisitante = Leer.dato();

                    System.out.print("Goles equipo local: ");
                    golesLocal = Leer.datoInt();

                    System.out.print("Goles equipo Visitante: ");
                    golesVisitante = Leer.datoInt();

                    pp = new Partido(codigoPartido, equipoLocal, equipoVisitante, golesLocal, golesVisitante);

                    System.out.println(tor.agregarPartido(pp));
                    break;
                case 2:
                    System.out.println("Mostrando partido...");
                    System.out.print("Ingrese el codigo del partido: ");
                    codigoBuscar = Leer.dato();
                    pos = tor.buscarCodigo(codigoBuscar);
                    if (pos == -1) {
                        System.out.println("El partido ingresado no existe..");
                    } else {
                        System.out.println("Codigo del partido: "
                                + tor.getParti().get(pos).getCodigoPartido());
                        System.out.println("Nombre equipo local: " + tor.getParti().get(pos).getEquipoLocal());
                        System.out.println("Nombre equipo visitante: " + tor.getParti().get(pos).getEquipoVisitante());
                        System.out.println("Goles local: " + tor.getParti().get(pos).getGolesLocal());
                        System.out.println("Goles visitante: " + tor.getParti().get(pos).getGolesVisitante());
                    }
                    break;
                case 3:
                    System.out.println("Eliminando partido...");
                    System.out.print("Ingrese el codigo del partido: ");
                    codigoBuscar = Leer.dato();
                    System.out.println(tor.eliminarPartido(codigoBuscar));
                    break;
                case 4:
                    System.out.println("Mostrando ganador");
                    System.out.print("Ingrese el codigo del partido: ");
                    codigoBuscar = Leer.dato();
                    pos = tor.buscarCodigo(codigoBuscar);

                    if (pos == -1) {
                        System.out.println("El partido ingresado no existe");
                    } else {
                        System.out.println(tor.getParti().get(pos).ganador());
                    }
                    break;
                case 5:
                    System.out.println("Cerrando sistema...");
                    break;
                default:
                    System.out.println("Ingrese una de las opciones mencionadas(1-5)");
            }
        } while (op != 5);
    }

}
