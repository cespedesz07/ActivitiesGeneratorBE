package com.cespedesz07.nocion;

import com.cespedesz07.nivel.Nivel;
import com.cespedesz07.secuenciaActividades.SecuenciaActividades;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class Nocion {

    @Id
    @Column(name = "idnocion")
    private Integer id;

    private String nombre;

    private boolean disponible;

    @Column(name = "xml_ctags")
    private String xmlCtags;

    @ManyToOne
    @JoinColumn(name = "nivel_idnivel")
    @JsonIgnore
    private Nivel nivel;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Nivel getNivel() {
        return nivel;
    }

    public void setNivel(Nivel nivel) {
        this.nivel = nivel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public String getXmlCtags() {
        return xmlCtags;
    }

    public void setXmlCtags(String xmlCtags) {
        this.xmlCtags = xmlCtags;
    }
}
