/**
 * Universidad del Valle
 * Facultad de Ingeniería
 * Departamento de Programación
 * @author José Leonel Rivera Barrera
 * @author carné: 24376
 * @author sección: 40
 */
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Teatro {
    private LocalDate fecha;
    private int contador;
    private int contadorTickets = 1;
    private Boleto boleto;
    private Localidad localidad;
    private Localidad localidad1;
    private Localidad localidad2;
    private Localidad localidad3; 

    /**
     * Método constructor
     */
    public Teatro() {
        this.fecha = LocalDate.now();
        this.contador = 0;
        this.boleto = new Boleto();
        this.localidad = new Localidad();
        this.localidad1 = new Localidad("Localidad 1", 100, 100000, 140);
        this.localidad2 = new Localidad("Localidad 2", 150, 150000, 450);
        this.localidad3 = new Localidad("Localidad 3", 200, 200000,490);

    }
   

    

/**
 * metodo generar Ticket
 */

 


 public String generarTicket(float presupuesto, int cantidadBoletos) {
    String localidadAsignada = "";
    boolean espacioDisponible = false;

    if (presupuesto < this.localidad1.getPrecio()) {
        localidadAsignada = "No existe localidad para este presupuesto";
    } else if (presupuesto >= this.localidad1.getPrecio() && presupuesto < this.localidad2.getPrecio()) {
        localidadAsignada = this.localidad1.getNombre();
        espacioDisponible = this.localidad1.getCapacidad() >= cantidadBoletos;
    } else if (presupuesto >= this.localidad2.getPrecio() && presupuesto < this.localidad3.getPrecio()) {
        localidadAsignada = this.localidad2.getNombre();
        espacioDisponible = this.localidad2.getCapacidad() >= cantidadBoletos;
    } else {
        localidadAsignada = this.localidad3.getNombre();
        espacioDisponible = this.localidad3.getCapacidad() >= cantidadBoletos;
    }

    if (!espacioDisponible) {
        return "Lo sentimos, no hay espacio disponible en la localidad " + localidadAsignada;
    } else {
        // Generar el ticket y actualizar el espacio disponible en la localidad
        if (localidadAsignada.equals(this.localidad1.getNombre())) {
            this.localidad1.setCapacidad(this.localidad1.getCapacidad() - cantidadBoletos);
        } else if (localidadAsignada.equals(this.localidad2.getNombre())) {
            this.localidad2.setCapacidad(this.localidad2.getCapacidad() - cantidadBoletos);
        } else {
            this.localidad3.setCapacidad(this.localidad3.getCapacidad() - cantidadBoletos);
        }

        // Generar el número de ticket
        String fechaActual = new SimpleDateFormat("ddMMyyyy").format(new Date());
        String numeroTicket = fechaActual + "-" + contadorTickets;
        contadorTickets++;

        return "Ticket generado con éxito. Número de ticket: " + numeroTicket + ". Localidad: " + localidadAsignada + ". Cantidad de boletos: " + cantidadBoletos;
    }
}

public void setPresupuestoBoleto(float presupuesto) {
    this.boleto.setPresupuesto(presupuesto);
}

public void setCantidadBoleto(int cantidad) {
    this.boleto.setCantidad(cantidad);
}

}
