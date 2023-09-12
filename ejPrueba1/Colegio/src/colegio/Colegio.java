/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package colegio;
/**
 *
 * @author candyfloss
 */
public class Colegio {
    public static void main(String[] args) {
        Alumno alumno1 =null;
        int opcion, nuevaNota=0,notaControl1=0,notaControl2=0,notaControl3=0,notaPrueba1=0,notaPrueba2=0, notaExamen=0;
        String nombreAlumno;
        boolean alumnoCreado = false;
        while(true){
            System.out.println("\tAlumnos");
            System.out.println("1. Crear alumno");
            System.out.println("2. Mostrar toda la información del alumno (nombre y notas de pruebas y controles)");
            System.out.println("3. Modificar la nota de la prueba 2, mostrando la nueva nota");
            System.out.println("4. Promedio de controles");
            System.out.println("5. Nota final y si aprobó o no la asignatura");
            System.out.println("6. Salir");
            
            //Leer la opcion
            System.out.print("\tElije una opcion: ");
            opcion = Leer.datoInt();
            
            switch(opcion){
                case 1:
                    System.out.print("Ingrese el nombre del alumno: ");
                    nombreAlumno = Leer.dato();
                    // Notas Control
                    System.out.print("Ingrese  la primera nota control del alumno: ");
                    notaControl1 = Leer.datoInt();
                    System.out.print("Ingrese  la segunda nota control  del alumno: ");
                    notaControl2 = Leer.datoInt();
                    System.out.print("Ingrese  la tercera nota control  del alumno: ");
                    notaControl3 = Leer.datoInt();
                    // Notas Prueba
                    System.out.print("Ingrese  la primera nota prueba del alumno: ");
                    notaPrueba1 = Leer.datoInt();
                    System.out.print("Ingrese  la segunda nota prueba del alumno: ");
                    notaPrueba2 = Leer.datoInt();
                    
                    
                    // Se crea el alumno 
                    alumno1 = new Alumno(nombreAlumno,notaControl1,notaControl2,notaControl3, notaPrueba1,notaPrueba2);
                    System.out.println("Alumno Creado exitosamente "+alumno1.getNombreAlumno());
                    alumnoCreado = true;
                    break;
                case 2:
                    if(alumnoCreado != true){
                        System.out.flush(); 
                        System.out.println("Primero crea un alumno");
                        break;
                    }else{
                        System.out.flush(); 
                        System.out.println("\tAlumno");
                        System.out.println("Nombre alumno: "+ alumno1.getNombreAlumno());
                        System.out.println("Nota Control 1: "+ alumno1.getNotaControl1());
                        System.out.println("Nota Control 2: "+ alumno1.getNotaControl2());
                        System.out.println("Nota Control 3: "+ alumno1.getNotaControl3()+"\n");
                        System.out.println("Nota Prueba 1: "+ alumno1.getNotaPrueba1());
                        System.out.println("Nota Prueba 2: "+ alumno1.getNotaPrueba2());
                        break;
                    }
                case 3:
                    if(alumnoCreado != true){
                        System.out.flush(); 
                        System.out.println("Primero crea un alumno");
                        break;
                    }else{
                        System.out.print("Ingrese la nueva nota de la prueba 2: ");
                        nuevaNota = Leer.datoInt();
                        alumno1.setNotaPrueba2(nuevaNota);
                        System.out.println("Se a cambiado la nota de la prueba 2 a "+alumno1.getNotaPrueba2());
                        break;
                    }
                case 4:
                    if(alumnoCreado != true){
                        System.out.flush(); 
                        System.out.println("Primero crea un alumno");
                        break;
                    }else{
                        System.out.println("El promedio de los controles del alumno "+alumno1.getNombreAlumno()+" es "+alumno1.obtenerPromedio());
                        break;
                    }
                case 5:
                    if(alumnoCreado != true){
                        System.out.flush(); 
                        System.out.println("Primero crea un alumno");
                        break;
                    }else{
                        System.out.print("Ingrese la nota examen de "+alumno1.getNombreAlumno()+": ");
                        notaExamen = Leer.datoInt();
                        
                        if(alumno1.notaPresentacion(notaExamen)<39.5){
                            System.out.println("El alumno "+alumno1.getNombreAlumno()+" ha reprobado con nota final: "+Math.round(alumno1.notaPresentacion(notaExamen)));
                            break;
                        }else{
                            System.out.println("El alumno "+alumno1.getNombreAlumno()+" ha aprobado con nota final: "+Math.round(alumno1.notaPresentacion(notaExamen)));
                            break;
                        }
                            
                        
                    }
                case 6:
                    System.out.println("Juan Marchant, el mas grande de los grandes");
                    return;
                default:
                    System.out.println("Ingrese una de las opciones mencionadas (1-6)");
            }
        }
    }
}
