/**
 * Universidad del Valle
 * Facultad de Ingeniería
 * Departamento de Programación
 * @author José Leonel Rivera Barrera
 * @author carné: 24376
 * @author sección: 40
 */

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        
            // Crea un objeto de la clase Scanner para leer datos desde la consola
            Scanner scanner = new Scanner(System.in);
            Boleto evento = new Boleto();
            Teatro teatro = new Teatro(); // Crea un objeto de la clase Teatro

            //Iniciar el ciclo:

            
            int op=0;
            while (op!=4) {
                System.out.println("Bienvenido al teatro");
                System.out.println("Menú:");
                System.out.println("1. Generar ticket");
                System.out.println("2. Ver Disponibilidad");
                System.out.println("3. Boletos Vendidos");
                System.out.println("4. Salir");
                System.out.println("Ingrese su opción: ");
                op=scanner.nextInt();
                scanner.nextLine();




            /**
             * Opción 1: Generar Ticket
             */
                switch (op) {
                    case 1:
                    System.out.println("Ingrese el nombre del Comprador: ");
                    String nombre=scanner.nextLine();
                    evento.setNombre(nombre);
                    
                    System.out.println("Ingrese el presupuesto del comprador: ");
                    float presupuesto=scanner.nextFloat();
                    evento.setPresupuesto(presupuesto);
                    
                    System.out.println("Ingrese el correo del comprador: ");
                    String correo=scanner.next();
                    evento.setCorreo(correo);
                    
                    System.out.println("Ingrese la cantidad de boletos: ");
                    int cantidadBoletos=scanner.nextInt();
                    evento.setCantidad(cantidadBoletos);
                    
                    
                    String resultado = teatro.generarTicket(evento.getPresupuesto(), evento.getCantidad());
                    System.out.println(resultado);
                        break;

                    /**
                     * Opcion 2 mostrar disponibilidad
                     */

                    case 2:
                    String capacidadStr = teatro.mostrarCapacidad();
                    System.out.println("Disponibilidad:");
                    System.out.println(capacidadStr);
                    break;

                    /**
                     * Opcion 3: Mostrar boletos vendidos
                     */
                    
                    case 3:
                    int boletosVendidos = teatro.getBoletosVendidos();
                    System.out.println("Boletos vendidos: " + boletosVendidos);
                    break;

                    /**
                     * Opcion 4: Salir
                     */
                    
                    case 4:
                    System.out.println("Gracias por su visita!");
                    scanner.close();
                    break;
                    
                    /**
                     * Opción no válida
                     */
                
                    default:
                    System.out.println("Opción no disponible. Intente nuevamente.");
                        break;
                }
            }
        

        }
}
