/**
 * Universidad del Valle
 * Facultad de Ingeniería
 * Departamento de Programación
 * @author José Leonel Rivera Barrera
 * @author carné: 24376
 * @author sección: 40
 */
public class Boleto {
    private String nombre;
    private float presupuesto;
    private String correo;
    private int cantidad;
/**
 * @param método constructor
 */
    public Boleto() {
        this.nombre = "";
        this.presupuesto = 0;
        this.correo = "";
        this.cantidad = 0;
    }
    public Boleto(String nombre, float presupuesto, String correo, int cantidad) {
        this.nombre = nombre;
        this.presupuesto = presupuesto;
        this.correo = correo;
        this.cantidad = cantidad;
    }
    

/**
 * @param nombre
 */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

/**
 * Método getNombre
 * @return nombre
 */
    public String getNombre() {
        return nombre;
    }
/**
 * @param presupuesto
 */
    public void setPresupuesto(float presupuesto) {
        this.presupuesto = presupuesto;
    }
/**
 * @return presupuesto del comprador
 */
    public float getPresupuesto() {
        return presupuesto;
    }

/**
 * @param correo
 */
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
/**
 * Método getCorreo
 * @return correo del comprador
 */
    public String getCorreo() {
        return correo;
    }
    
/**
 * @param cantidad
 */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
/**
 * Método getCantidad
 * @return cantidad de entradas compradas
 */
    public int getCantidad() {
        return cantidad;
    }
    /**
     * fin
     */

}