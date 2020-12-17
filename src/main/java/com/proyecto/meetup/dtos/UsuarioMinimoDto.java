package com.proyecto.meetup.dtos;

import com.sun.istack.NotNull;

public class UsuarioMinimoDto {

    @NotNull
    private Long idUsuario;

    @NotNull
    private String username;

    public UsuarioMinimoDto(){
        this.username="";
    }

    public UsuarioMinimoDto(Long idUsuario, String username){
        super();
        this.idUsuario=idUsuario;
        this.username=username;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "UsuarioMinimoDto{" +
                "idUsuario=" + idUsuario +
                ", username='" + username + '\'' +
                '}';
    }
}
