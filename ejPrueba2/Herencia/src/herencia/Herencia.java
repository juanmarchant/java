/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herencia;

/**
 *
 * @author candyfloss
 */
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gato ga = null;
        Perro pe = null;
        String codigo, nombreMascota, nombreOwner;
        boolean peloLargo;
        int op = 0, op1 = 0, pos, edad, numI;

        // Manejadora
        Manejadora ma = new Manejadora();

        do {
            System.out.println("1. Ingresar Mascota (Ingresará un perro o gato a la colección, verificando que no exista)");
            System.out.println("2. Mostrar datos de una mascota dado su código (Mostrará toda la información que tiene la mascota)");
            System.out.println("3. onomatopeya (dado el código, mostrará el nombre de la mascota y como dice. Ejemplo si la mascotase llama Tomita y es un gato, mostrará tomita dice Miauuuu)");
            System.out.println("4. Cantidad de perros Senior");
            System.out.println("5. Cantidad de gatos con pelo largo");
            System.out.println("6. Eliminar mascota");
            System.out.println("7. Salir");

            System.out.print("\tIngrese una de las opciones mencionadas  (1-7)");
            op = Leer.datoInt();
            switch (op) {
                case 1:
                    System.out.print("Ingrese codigo de la mascota: ");
                    codigo = Leer.dato();
                    System.out.print("Ingrese nombre de la mascota: ");
                    nombreMascota = Leer.dato();

                    System.out.print("Ingrese el nombre del Owner: ");
                    nombreOwner = Leer.dato();

                    do {
                        System.out.print("Que mascota desea ingresar ? (1: Gato| 2: Perro): ");
                        op1 = Leer.datoInt();
                    } while (op1 < 1 || op1 > 2);

                    if (op1 == 1) {
                        System.out.println("Ingresando Gato");
                        System.out.print("Su mascota tiene pelo largo?  true/false: ");
                        peloLargo = Leer.datoBoolean();
                        ga = new Gato(peloLargo, codigo, nombreMascota, nombreOwner);

                        System.out.println(ma.ingresarMascota(ga));
                    } else {
                        System.out.println("Ingresando Perro");
                        System.out.print("Ingrese la edad del perro: ");
                        edad = Leer.datoInt();
                        System.out.print("Ingrese el numero de inscripcion: ");
                        numI = Leer.datoInt();

                        pe = new Perro(numI, edad, codigo, nombreMascota, nombreOwner);
                        System.out.println(ma.ingresarMascota(pe));
                    }
                    break;
                case 2:
                    System.out.print("Ingrese el codigo de la mascota: ");
                    codigo = Leer.dato();
                    pos = ma.buscarMascota(codigo);
                    if (pos == -1) {
                        System.out.println("La mascota no se encuentra...");
                    } else {
                        System.out.println("Nombre Mascota:  " + ma.getMas().get(pos).getNombreMascota());
                        System.out.println("Codigo:  " + ma.getMas().get(pos).getCodigo());
                        System.out.println("Nombre Owner:  " + ma.getMas().get(pos).getNombreOwner());

                        if (ma.getMas().get(pos) instanceof Gato) {
                            System.out.println("Pelo Largo: " + ((Gato) ma.getMas().get(pos)).isPeloLargo());
                        } else {
                            System.out.println("Edad: " + ((Perro) ma.getMas().get(pos)).getEdad());
                            System.out.println("Numero Inscripcion: " + ((Perro) ma.getMas().get(pos)).getNumI());
                        }
                    }
                    break;
                case 3:
                    System.out.print("Ingrese el codigo de la mascota: ");
                    codigo = Leer.dato();
                    pos = ma.buscarMascota(codigo);
                    if (pos == -1) {
                        System.out.println("La mascota no existe...");
                    } else {

                        System.out.println("Nombre de la mascota: " + ma.getMas().get(pos).getNombreMascota());

                        if (ma.getMas().get(pos) instanceof Perro) {
                            System.out.println("haceee " + ((Perro) ma.getMas().get(pos)).onomatopeya());
                        } else {
                            System.out.println("haceee " + ((Gato) ma.getMas().get(pos)).onomatopeya());
                        }
                    }
                    break;
                case 4:
                    System.out.println("La cantidad de perros seniors es " + ma.perroSenior()
                    );
                    break;
                case 5:
                    System.out.println("La cantidad de gatos con pelo largo es: " + ma.gatosPeloLargo());
                    break;
                case 6:
                    System.out.println("La cantidad de mascotas eliminadas cuyo Owner es Pepe es: " + ma.eliminarMascota());
                    break;
                case 7:
                    System.out.println("Cerrando sistema....");
                    break;
                default:
                    System.out.println("Ingrese una de las opciones 1-7");
            }

        } while (op
                != 7);
    }

}
