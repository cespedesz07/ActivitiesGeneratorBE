package com.cespedesz07.lectura;

import javax.persistence.*;

import com.cespedesz07.nivel.Nivel;
import com.cespedesz07.nocion.Nocion;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

import java.io.FileInputStream;

@Entity
public class Lectura {

    @Id
    @Column(name = "idlectura")
    private Integer id;

    @Column(name = "titulo_doc")
    private String tituloDoc;

    private String ruta;

    @ManyToOne
    @JoinColumn(name = "nocion_idnocion")
    @JsonIgnore
    private Nocion nocion;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTituloDoc() {
        return tituloDoc;
    }

    public void setTitulo_doc(String tituloDoc) {
        this.tituloDoc = tituloDoc;
    }

    public Nocion getNocion() {
        return nocion;
    }

    public void setNocion(Nocion nocion) {
        this.nocion = nocion;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
}
