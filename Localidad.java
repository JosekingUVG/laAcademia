public class Localidad {
    private String nombre;
    private int capacidad;
    private float poblacion;
    private float precio;
    /**
     * método constructor
     * 
     */
    public Localidad() {
        this.nombre = "";
        this.capacidad = 0;
        this.poblacion = 0;
        this.precio = 0;
        
    }
    public Localidad(String nombre, int capacidad, float poblacion, float precio) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.poblacion = poblacion;
        this.precio = precio;


    }
    /**
     * getters y setters
     * @return nombre */ 
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /** @return capacidad */
    public int getCapacidad() {
        return capacidad;
    }
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    /** @return poblacion */
    public float getPoblacion() {
        return poblacion;
    }
    public void setPoblacion(float poblacion) {
        this.poblacion = poblacion;
    }
    public float getPrecio() {
        return precio;
    }
    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
}
