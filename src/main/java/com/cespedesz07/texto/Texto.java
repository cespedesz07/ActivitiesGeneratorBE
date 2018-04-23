package com.cespedesz07.texto;

import javax.persistence.*;

import com.cespedesz07.nivel.Nivel;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

import java.io.FileInputStream;

@Entity
public class Texto {

    @Id
    @Column(name = "idtexto")
    private Integer id;

    @Column(name = "titulo_doc")
    private String tituloDoc;

    private String autor;

    private String fuente;

    private String fecha;

    @ManyToOne
    @JoinColumn(name = "nivel_idnivel")
    private Nivel nivel;

    @JsonIgnore
    private String ruta;

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

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getFuente() {
        return fuente;
    }

    public void setFuente(String fuente) {
        this.fuente = fuente;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Nivel getNivel() {
        return nivel;
    }

    public void setNivel(Nivel nivel) {
        this.nivel = nivel;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
}
