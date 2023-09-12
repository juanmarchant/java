/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clinica;

/**
 *
 * @author candyfloss
 */
public class Clinica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DatosPersonales dap = null;
        Ficha fic = null;
        int op;
        String nombre, genero, tipoPrevision, generoAux;
        double peso, estatura;
        
        do {
            System.out.println("""   
                \tClínica Olor a Clavel
                1. Crear Paciente
                2. Mostrar todos los datos
                3. Estado del Paciente y su Metabolismo Basal
                4. Total a pagar
                5. Modificar el género del paciente (validar que no sea el mismo que tenía)"
                6. Salir""");
            
            System.out.print("\tElija una opcion: ");
            op = Leer.datoInt();
            
            switch (op) {
                case 1 -> {
                    System.out.println("Creando paciente...");
                    
                    do {
                        System.out.print("Ingrese el nombre del paciente (mayor a 4 caracteres): ");
                        nombre = Leer.dato();
                        nombre = nombre.trim();
                    } while (nombre.length() < 4);
                    
                    do {
                        System.out.print("Ingrese el genero del paciente (Masculino | Femenino): ");
                        genero = Leer.dato();
                        genero = genero.trim();
                    } while (genero.compareToIgnoreCase("femenino") != 0 && genero.compareToIgnoreCase("masculino") != 0);
                    
                    do {
                        System.out.print("Ingrese la estatura de el paciente (ej: 1.74): ");
                        estatura = Leer.datoDouble();
                    } while (estatura < 1.2);
                    
                    do {
                        System.out.print("Ingrese la prevision (Isapre | Fonasa | Particular): ");
                        tipoPrevision = Leer.dato();
                        tipoPrevision = tipoPrevision.trim();
                        
                    } while (tipoPrevision.compareToIgnoreCase("isapre") != 0 && tipoPrevision.compareToIgnoreCase("fonasa") != 0 && tipoPrevision.compareToIgnoreCase("particular") != 0);
                    
                    do {
                        System.out.print("Ingrese el peso del paciente (ej: 82.5): ");
                        peso = Leer.datoDouble();
                    } while (peso < 1.0);

                    //Creando el paciente
                    dap = new DatosPersonales(nombre, genero);
                    fic = new Ficha(estatura, peso, tipoPrevision, dap);
                    System.out.println("Se ha creado el paciente " + fic.getDp().getNombre() + " exitosamente");
                    break;
                }
                case 2 -> {
                    if (fic != null) {
                        System.out.println("Mostrando al paciente....");
                        System.out.println("Nombre: " + fic.getDp().getNombre());
                        System.out.println("Genero: " + fic.getDp().getGenero());
                        System.out.println("Estatura: " + fic.getEstatura() + " mt");
                        System.out.println("Tipo Prevision: " + fic.getTipoPrevision());
                        System.out.println("Peso: " + fic.getPeso() + " kg");
                        break;
                    } else {
                        System.out.println("Primero cree al paciente..");
                        break;
                    }
                }
                case 3 -> {
                    if (fic != null) {
                        System.out.println("El estado del paciente es: " + fic.estadoPaciente() + " y su imc es: " + fic.imc());
                        break;
                    } else {
                        System.out.println("Primero cree al paciente");
                        break;
                    }
                }
                case 4 -> {
                    if (fic != null) {
                        System.out.println("El total a pagar es: " + fic.totalPagar());
                        break;
                    } else {
                        System.out.println("Primero cree al paciente");
                        break;
                    }
                }
                case 5 -> {
                    if (fic != null) {
                        generoAux = fic.getDp().getGenero();
                        do {
                            do {
                                System.out.print("Ingrese el genero del paciente (Masculino | Femenino): ");
                                genero = Leer.dato();
                                genero = genero.trim();
                            } while (genero.compareToIgnoreCase("femenino") != 0 && genero.compareToIgnoreCase("masculino") != 0);
                        } while (genero.compareToIgnoreCase(generoAux) == 0);
                        fic.getDp().setGenero(genero);
                        break;
                    } else {
                        System.out.println("Primero cree al paciente");
                        break;
                    }
                    
                }
                case 6 -> {
                    System.out.println("Cerrando el sistema...");
                    break;
                }
                default ->
                    System.out.println("Ingrese una de las opciones mencionadas (1-6)");
            }
        } while (op != 6);
        
    }
    
}
