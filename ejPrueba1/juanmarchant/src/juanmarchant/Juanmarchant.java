/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package juanmarchant;

/**
 *
 * @author candyfloss
 */
public class Juanmarchant {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String rut, nombre, cargo;
        int totalHoras, valorHora, op;
        char turno;
        Informacion info = null;
        Empleado emp = null;

        do {
            System.out.println("""
                               1. Crear Empleado. (10 puntos)	
                               2. Valor hora (asignar valor hora) (10 puntos)
                               3. Mostrar información (toda la información) (10 puntos)	
                               4. Pagar al empleado (10 puntos)	
                               5. Salir 
                               """);
            System.out.print("\tIngrese una de las opciones mencionadas: ");
            op = Leer.datoInt();
            
            switch (op) {
                case 1->{
                    System.out.println("Creando al empleado...");
                    
                    do {                        
                        System.out.print("Ingrese el nombre de el empleado (4 caracteres +): "); nombre = Leer.dato();
                        nombre = nombre.trim();
                    } while (nombre.length() < 4);
                    
                    do {                        
                        System.out.print("Ingrese el Cargo de el empleado (Mozo | Cantinero | Administrativo | Limpieza): "); cargo = Leer.dato();
                        cargo = cargo.trim();
                    } while (cargo.compareToIgnoreCase("mozo") != 0 && cargo.compareToIgnoreCase("cantinero") != 0 && cargo.compareToIgnoreCase("administrativo") != 0 && cargo.compareToIgnoreCase("limpieza") !=0 );
                    
                    do {                        
                        System.out.print("Ingrese el rut de el empleado (20.286.769-3): "); rut = Leer.dato();
                        rut = rut.trim();
                    } while (rut.length() < 12);
                    
                    // Creamos informacion
                    info = new Informacion(rut, cargo, nombre);
                    
                    valorHora = 0;
                    do {                        
                        System.out.print("Ingrese el turno de el empleado (D: Dia | T: Tarde | N: Noche): "); turno = Leer.datoChar();
                    } while (turno != 'D' && turno != 'N' && turno != 'T');
                    
                    emp = new Empleado(info, turno, valorHora);
                    
                    System.out.println("Empleado creado exitosamente: "+ emp.getInfo().getNombre());
                    break;
                }
                case 2 ->{
                    if (emp!= null){
                        System.out.println("Asignando Valor Hora...");
                        emp.asignarHora();
                        System.out.println("Se ha asignado el valor hora -> $"+emp.getValorHora());
                        break;
                    }else{
                        System.out.println("Cree al empleado primero....");
                        break;
                    }
                }
                case 3 ->{
                    if (emp!= null){
                        
                        System.out.println("Mostrando informacion....");
                        
                        System.out.println("Nombre: "+emp.getInfo().getNombre());
                        System.out.println("Rut: "+emp.getInfo().getRut());
                        System.out.println("Cargo: "+emp.getInfo().getCargo());
                        
                        System.out.println("----------------");
                        System.out.println("Turno: "+emp.getTurno());
                        System.out.println("Valor Hora: $"+emp.getValorHora());
                        break;
                    }else{
                        System.out.println("Cree al empleado primero....");
                        break;
                    }
                }
                case 4 ->{
                    if (emp!= null){
                        System.out.print("Ingrese el total de horas trabajadas: "); totalHoras = Leer.datoInt();
                        System.out.println("Mostrando pago...");
                        emp.pagarEvento(totalHoras);
                        break;
                    }else{
                        System.out.println("Cree al empleado primero....");
                        break; 
                    }
                }
                case 5->{
                    System.out.println("Cerrando el sistema...");
                    break;
                }
                default->{
                    System.out.println("Recuerde ingresar una de las opciones mencionadas (1-5)");
                }
                
            }
        } while (op != 5);
    }

}
