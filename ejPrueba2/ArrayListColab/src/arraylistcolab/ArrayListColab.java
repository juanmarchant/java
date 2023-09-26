/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylistcolab;

/**
 *
 * @author candyfloss
 */
public class ArrayListColab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Trabajador tr = null;
        DatosPersonales dp = null;
        String cargo, nombreEmpresa, nombreTrabajador, rut;
        int op, pos;

        System.out.print("Ingrese el nombre de la empresa: ");
        nombreEmpresa = Leer.dato().trim();

        Empresa em = new Empresa(nombreEmpresa);

        do {
            System.out.println("\tEmpresa " + nombreEmpresa);
            System.out.println("1. Ingresar Trabajador");
            System.out.println("2. Mostrar los datos del Trabajador");
            System.out.println("3. Cantidad de profesionales");
            System.out.println("4. Nombre y Rut del trabajador con mayor sueldo bruto");
            System.out.println("5. Eliminar un trabajador ");
            System.out.println("6. Salir");

            System.out.print("\tIngrese una de las opciones(1-6): ");
            op = Leer.datoInt();

            switch (op) {
                case 1:
                    System.out.println("Creando trabajador...");

                    System.out.print("Ingrese el rut del trabajador: ");
                    rut = Leer.dato();

                    System.out.print("Ingrese el nombre del trabajador: ");
                    nombreTrabajador = Leer.dato();

                    System.out.print("Ingrese el cargo del trabajador (Supervisor|Profesional|Tecnico): ");
                    cargo = Leer.dato();
                    dp = new DatosPersonales(rut, nombreTrabajador);
                    tr = new Trabajador(cargo, dp);
                    System.out.println(em.ingresarTrabajador(tr));
                    break;
                case 2:
                    System.out.println("Mostrando Trabajador....");
                    System.out.print("Ingrese el rut del trabajador: ");
                    rut = Leer.dato();
                    pos = em.buscar(rut);
                    if (pos == -1) {
                        System.out.println("El trabajador ingresado no existe..");
                    } else {
                        System.out.println("Nombre: " + em.getTra().get(pos).getUnDato().getNombre());
                        System.out.println("Rut: " + em.getTra().get(pos).getUnDato().getRut());
                        System.out.println("Cargo: " + em.getTra().get(pos).getCargo());
                        System.out.println("Total Horas Normales: " + em.getTra().get(pos).totalHorasNormales());
                        System.out.println("Total Horas Extras: " + em.getTra().get(pos).totalHorasExtras());
                        System.out.println("Valor Hora: $" + em.getTra().get(pos).valorHoraNormal());
                    }
                    break;
                case 3:
                    System.out.println("Hay un total de: " + em.cantidadProfesionales() + " trabajadores");
                    break;
                case 4:
                    System.out.println("Trabajador mayor sueldo bruto...");
                    System.out.println("Nombre: "+ em.getTra().get(em.mayorSueldoBruto()).getUnDato().getNombre());
                    System.out.println("Rut: "+ em.getTra().get(em.mayorSueldoBruto()).getUnDato().getRut());
                    break;
                case 5:
                    System.out.println("Eliminando trabajador....");
                    System.out.print("Ingrese el rut del trabajador: ");
                    rut = Leer.dato();
                    pos = em.buscar(rut);
                    if (pos == -1) {
                        System.out.println("El trabajador ingresado no existe..");
                    } else {
                        System.out.println(em.eliminarTrabajador(rut));
                    }
                    break;
                case 6:
                    System.out.println("Cerrando el sistema");
                    break;
                default:
                    System.out.println("Ingrese una de las opciones mencionadas(1-6)");
            }
        } while (op != 6);

    }

}
