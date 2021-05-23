package com.toni.recyclerview2.model;

import java.io.Serializable;

public class Deporte implements Serializable {
    private int id;
    private String nombre;
    private String descripcion;
    private String imagen;

    public Deporte(int id, String nombre, String descripcion, String imagen) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.imagen = imagen;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getImagen() {
        return imagen;
    }
}
