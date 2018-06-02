package com.cespedesz07.nocion;

import com.cespedesz07.lectura.Lectura;
import com.cespedesz07.nivel.Nivel;
import com.cespedesz07.secuenciaActividades.SecuenciaActividades;
import com.cespedesz07.tagNocion.TagNocion;
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

    @ManyToOne
    @JoinColumn(name = "nivel_idnivel")
    @JsonIgnore
    private Nivel nivel;

    @OneToMany(mappedBy = "nocion")
    @JsonIgnore
    private List<Lectura> lecturas;

    @OneToMany(mappedBy = "nocion")
    private List<TagNocion> tagsNociones;

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

    public List<Lectura> getLecturas() {
        return lecturas;
    }

    public void setLecturas(List<Lectura> lecturas) {
        this.lecturas = lecturas;
    }

    public List<TagNocion> getTagsNociones() {
        return tagsNociones;
    }

    public void setTagsNociones(List<TagNocion> tagsNociones) {
        this.tagsNociones = tagsNociones;
    }
}
