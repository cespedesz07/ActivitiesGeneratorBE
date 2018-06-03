package com.cespedesz07.tipoNocion;

import com.cespedesz07.tagNocion.TagNocion;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class TipoNocion {

    @Id
    @Column(name = "idtipo_nocion")
    private Integer id;

    private String palabrasEjemplo;

    private String tipo;

    @ManyToOne
    @JoinColumn(name = "tag_nocion_idtag_nocion")
    @JsonIgnore
    private TagNocion tagNocionForeign;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPalabrasEjemplo() {
        return palabrasEjemplo;
    }

    public void setPalabrasEjemplo(String palabrasEjemplo) {
        this.palabrasEjemplo = palabrasEjemplo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public TagNocion getTagNocionForeign() {
        return tagNocionForeign;
    }

    public void setTagNocionForeign(TagNocion tag) {
        this.tagNocionForeign = tag;
    }
}
