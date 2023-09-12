/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author PC30
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion,n1,n2, total;
        float peso;
        String nombre;
        while (true){
            System.out.println("Los informáticos\n*************\n1. Saludar\n2. Sumar 2 números\n3. Dieta \n4. Salir\n");
            System.out.print("\tElije una opcion: ");
            opcion = Leer.datoInt();
            if (opcion >= 1 && opcion <= 4 ){
                if (opcion == 1){
                    System.out.print("Ingrese su nombre: ");
                    nombre = Leer.dato();
                    System.out.println("Hola "+nombre+" BIENVENIDO A JAVA");
                    System.out.flush(); 
                }
                if (opcion == 2){
                    total = 0;
                    System.out.print("Ingrese el primer numero: ");
                    n1 = Leer.datoInt();
                    System.out.print("Ingrese el segundo numero: ");
                    n2 = Leer.datoInt();
                    total = n1 + n2;
                    System.out.println("La suma de los dos numeros "+ n1 + "+" + n2+" es "+ total);
                    System.out.flush(); 
                }
                if (opcion == 3){
                    System.out.print("Ingresa tu peso: ");
                    peso = Leer.datoFloat();
                    if (peso < 60){
                        System.out.println("Debes comer mas\n");
                    }
                    else if (peso >= 60 && peso <=75){
                        System.out.println("Estas en el peso ideal\n");
                    }
                    else{
                        System.out.println("Debes hacer dieta\n");
                    }
                    System.out.flush(); 
                }
                if (opcion == 4){
                    break;
                }
            }
            else{
                System.out.println("Ingresa una de las opciones mencionadas");
            }   
        }
                  
    }
    
}

/* Con Switch */
/*
switch(opcion){
    case 1:
        System.out.print("Ingrese su nombre: ");
        nombre = Leer.dato();
        System.out.println("Hola "+nombre+" BIENVENIDO A JAVA");
        System.out.flush(); 
        break;
    case 2:
        total = 0;
        System.out.print("Ingrese el primer numero: ");
        n1 = Leer.datoInt();
        System.out.print("Ingrese el segundo numero: ");
        n2 = Leer.datoInt();
        total = n1 + n2;
        System.out.println("La suma de los dos numeros "+ n1 + "+" + n2+" es "+ total);
        System.out.flush(); 
        break;
    case 3:
        System.out.print("Ingresa tu peso: ");
        peso = Leer.datoFloat();
        if (peso < 60){
            System.out.println("Debes comer mas\n");
        }
        else if (peso >= 60 && peso <=75){
            System.out.println("Estas en el peso ideal\n");
        }
        else{
            System.out.println("Debes hacer dieta\n");
        }
        System.out.flush();
        break;
    case 4:
        break;
    default:
        System.out.println("Ingrese una de las opciones mencionadas");
}
*/
