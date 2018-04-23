package com.cespedesz07.secuenciaActividades;

import com.cespedesz07.actividad.Actividad;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class SecuenciaActividades {

    @Id
    @Column(name = "idsecuencia_actividades")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String nombre;

    @Column(name = "fecha_generacion")
    private String fechaGeneracion;

    @Column(name = "idusuario_realizador")
    private Integer idUsuarioRealizador;

    @Column(name = "texto_idtexto")
    private Integer idTexto;

    @Column(name = "nivel_idnivel")
    private Integer idNivel;

    @Column(name = "nocion_idnocion")
    private Integer idNocion;

    @ManyToMany(cascade = {CascadeType.REFRESH, CascadeType.MERGE})
    @JoinTable(name = "secuencia_actividad_registro",
            joinColumns = @JoinColumn(
                    name = "secuencia_actividades_idsecuencia_actividades",
                    referencedColumnName = "idsecuencia_actividades"
            ),
            inverseJoinColumns = @JoinColumn(
                    name = "actividad_idactividad",
                    referencedColumnName = "idactividad"
            ))
    private List<Actividad> actividades;


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

    public String getFechaGeneracion() {
        return fechaGeneracion;
    }

    public void setFechaGeneracion(String fechaGeneracion) {
        this.fechaGeneracion = fechaGeneracion;
    }

    public Integer getIdUsuarioRealizador() {
        return idUsuarioRealizador;
    }

    public void setIdUsuarioRealizador(Integer idUsuarioRealizador) {
        this.idUsuarioRealizador = idUsuarioRealizador;
    }

    public Integer getIdTexto() {
        return idTexto;
    }

    public void setIdTexto(Integer idTexto) {
        this.idTexto = idTexto;
    }

    public Integer getIdNivel() {
        return idNivel;
    }

    public void setIdNivel(Integer idNivel) {
        this.idNivel = idNivel;
    }

    public Integer getIdNocion() {
        return idNocion;
    }

    public void setIdNocion(Integer idNocion) {
        this.idNocion = idNocion;
    }

    public List<Actividad> getActividades() {
        return actividades;
    }

    public void setActividades(List<Actividad> actividades) {
        this.actividades = actividades;
    }
}
