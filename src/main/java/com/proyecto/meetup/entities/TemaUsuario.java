package com.proyecto.meetup.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class TemaUsuario implements Serializable {

    private static final long serialVersionUID = 1L;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id_TemaUsuario")
    private Long idTemaUsuario;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="Id_Tema")
    private Tema tema;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="Id_Usuario")
    private Usuario usuario;

    public TemaUsuario(){

    }

    public Long getIdTemaUsuario() {
        return idTemaUsuario;
    }

    public void setIdTemaUsuario(Long idTemaUsuario) {
        this.idTemaUsuario = idTemaUsuario;
    }

    public Tema getTema() {
        return tema;
    }

    public void setTema(Tema tema) {
        this.tema = tema;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "TemaUsuario{" +
                "idTemaUsuario=" + idTemaUsuario +
                ", tema=" + tema +
                ", usuario=" + usuario +
                '}';
    }
}
