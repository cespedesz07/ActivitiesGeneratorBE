package com.cespedesz07.nivel;

import javax.persistence.*;

import com.cespedesz07.nocion.Nocion;
import com.cespedesz07.texto.Texto;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;
import java.util.Set;

@Entity
public class Nivel {

    @Id
    @Column(name = "idnivel")
    private Integer id;

    private String nombre;

    @OneToMany(mappedBy = "nivel")
    @JsonIgnore // Esta Etiqueta evita que se muestre un JSON Recursivo
    private List<Texto> textos;

    @OneToMany(mappedBy = "nivel")
    private List<Nocion> nociones;


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

    public List<Texto> getTextos(){
        return textos;
    }

    public void setTextos( List<Texto> textos ) {
        this.textos = textos;
    }

    public List<Nocion> getNociones() {
        return nociones;
    }

    public void setNociones(List<Nocion> nociones) {
        this.nociones = nociones;
    }
}
