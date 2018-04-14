package com.cespedesz07.actividad;

import com.cespedesz07.secuenciaActividades.SecuenciaActividades;

import javax.persistence.*;
import java.util.List;

@Entity
public class Actividad {

    @Id
    @Column( name = "idactividad" )
    private Integer id;

    private String nombre;

    private String descripcion;

    @ManyToMany(mappedBy = "actividades")
    private List<SecuenciaActividades> secuenciaActividades;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<SecuenciaActividades> getSecuenciaActividades() {
        return secuenciaActividades;
    }

    public void setSecuenciaActividades(List<SecuenciaActividades> secuenciaActividades) {
        this.secuenciaActividades = secuenciaActividades;
    }
}
