package com.cespedesz07.texto;

import javax.persistence.*;

import com.cespedesz07.nivel.Nivel;

@Entity
public class Texto {

    @Id
    @Column(name = "idtexto")
    private Integer id;

    private String titulo_doc;

    private String autor;

    private String fuente;

    private String fecha;

    @ManyToOne
    @JoinColumn(name = "nivel_idnivel")
    private Nivel nivel;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo_doc() {
        return titulo_doc;
    }

    public void setTitulo_doc(String titulo_doc) {
        this.titulo_doc = titulo_doc;
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
}
