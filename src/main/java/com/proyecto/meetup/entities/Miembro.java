package com.proyecto.meetup.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Miembro implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id_Miembro")
    private Long idMiembro;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="Id_Usuario")
    private Usuario usuario;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="Id_Grupo")
    private Grupo grupo;

    public Miembro(){

    }

    public Long getIdMiembro() {
        return idMiembro;
    }

    public void setIdMiembro(Long idMiembro) {
        this.idMiembro = idMiembro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    @Override
    public String toString() {
        return "Miembro{" +
                "idMiembro=" + idMiembro +
                ", usuario=" + usuario +
                ", grupo=" + grupo +
                '}';
    }
}
