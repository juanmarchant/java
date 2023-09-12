/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package flota;

/**
 *
 * @author candyfloss
 */
public class Flota {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Declaracion de variables
        int op, valorDia, cantidadDias, edad, cantidaPasajes;
        String tipoCabina, destino, nuevoDestino;
        Crucero crucero1 = null;

        do {
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
                    System.out.println("Creando Crucero....");

                    System.out.print("Ingrese el valor del dia: ");
                    valorDia = Leer.datoInt();
                    System.out.print("Ingrese el tipo de cabina: ");
                    tipoCabina = Leer.dato();
                    System.out.print("Ingrese la cantidad de dias: ");
                    cantidadDias = Leer.datoInt();
                    System.out.print("Ingrese el destino: ");
                    destino = Leer.dato();

                    //Se crea el crucero
                    crucero1 = new Crucero(valorDia, cantidadDias, tipoCabina, destino);
                    System.out.println("Crucero creado exitosamente..");
                    break;
                }
                case 2 -> {
                    if (crucero1 != null) {
                        System.out.println("Mostrando crucero...");
                        System.out.println("Valor del dia: " + crucero1.getValorDia()
                                + "\nTipo de cabina: " + crucero1.getTipoCabina()
                                + "\nCantidad de dias: " + crucero1.getCantidadDias()
                                + "\nDestino: " + crucero1.getDestino());
                        break;
                    } else {
                        System.out.println("Primero crea un crucero");
                        break;
                    }

                }
                case 3 -> {
                    if (crucero1 != null) {
                        System.out.print("Ingrese su edad: ");
                        edad = Leer.datoInt();

                        if (crucero1.getRebaja(edad) != 0) {
                            System.out.println("El valor del dia ahora es: " + crucero1.getRebaja(edad));
                        } else {
                            System.out.println("No tienes rebaja");
                        }
                        break;
                    } else {
                        System.out.println("Primero crea un crucero");
                        break;
                    }

                }
                case 4 -> {
                    if(crucero1 != null){
                        
                        System.out.print("Ingrese la cantidad de pasajes: ");
                        cantidaPasajes = Leer.datoInt();                       
                        System.out.println("El total a pagar es: "+crucero1.getTotalPagar(cantidaPasajes));                        
                    } else {
                        System.out.println("Primero crea un crucero");
                        break;
                    }
                    
                }
                case 5 ->{
                    if(crucero1 != null){
                        System.out.print("Ingrese el nuevo destino: ");
                        destino = crucero1.getDestino();
                        nuevoDestino = Leer.dato();
                        
                        crucero1.setDestino(nuevoDestino);
                        
                        System.out.println("El destino del crucero a sido cambiado: "+destino+"->"+nuevoDestino);
                        break;
                    }else{
                        System.out.println("Primero crea un crucero");
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
