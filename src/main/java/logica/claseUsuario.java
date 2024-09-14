package logica;

public class claseUsuario {
 
    int id;
    private String nombre;
    private String fecha;
    private String espacioTrabajo;
    private String duracion;

    public claseUsuario() {
    }

    public claseUsuario(int id, String nombre, String fecha, String espacioTrabajo, String duracion) {
        this.id = id;
        this.nombre = nombre;
        this.fecha = fecha;
        this.espacioTrabajo = espacioTrabajo;
        this.duracion = duracion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getEspacioTrabajo() {
        return espacioTrabajo;
    }

    public void setEspacioTrabajo(String espacioTrabajo) {
        this.espacioTrabajo = espacioTrabajo;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }
    
}
