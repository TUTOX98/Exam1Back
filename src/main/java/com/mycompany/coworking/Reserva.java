package com.mycompany.coworking;
public class Reserva {
    private int id;
    private String nombre;
    private String fecha;
    private String lugarTrabajo;
    private String horasTrabajo;

    public Reserva(int id, String nombre, String fecha, String lugarTrabajo, String horasTrabajo) {
        this.id = id;
        this.nombre = nombre;
        this.fecha = fecha;
        this.lugarTrabajo = lugarTrabajo;
        this.horasTrabajo = horasTrabajo;
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

    public String getLugarTrabajo() {
        return lugarTrabajo;
    }

    public void setLugarTrabajo(String lugarTrabajo) {
        this.lugarTrabajo = lugarTrabajo;
    }

    public String getHorasTrabajo() {
        return horasTrabajo;
    }

    public void setHorasTrabajo(String horasTrabajo) {
        this.horasTrabajo = horasTrabajo;
    }
}
