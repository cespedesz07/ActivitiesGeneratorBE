package com.cespedesz07.tagNocion;

import com.cespedesz07.nocion.Nocion;
import com.cespedesz07.tipoNocion.TipoNocion;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class TagNocion {

    @Id
    @Column(name = "idtag_nocion")
    private Integer id;

    private String tag;

    @ManyToOne
    @JoinColumn(name = "nocion_idnocion")
    @JsonIgnore
    private Nocion nocion;

    @OneToMany(mappedBy = "tagNocionForeign")
    private List<TipoNocion> tiposNociones;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Nocion getNocion() {
        return nocion;
    }

    public void setNocion(Nocion nocion) {
        this.nocion = nocion;
    }

    public List<TipoNocion> getTiposNociones() {
        return tiposNociones;
    }

    public void setTiposNociones(List<TipoNocion> tiposNociones) {
        this.tiposNociones = tiposNociones;
    }
}
