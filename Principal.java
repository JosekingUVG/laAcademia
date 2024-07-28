import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        
            // Crea un objeto de la clase Scanner para leer datos desde la consola
            Scanner scanner = new Scanner(System.in);
            Boleto evento = new Boleto();
            Teatro teatro = new Teatro(); // Crea un objeto de la clase Teatro
        
            System.out.println("Ingrese el nombre del evento: ");
            String nombre=scanner.nextLine();
            evento.setNombre(nombre);
            
            System.out.println("Ingrese el presupuesto del evento: ");
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
        }
}