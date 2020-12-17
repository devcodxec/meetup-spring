package com.proyecto.meetup.dtos;

import com.fasterxml.jackson.annotation.JsonInclude;

public class UsuarioDto extends  UsuarioMinimoDto{

    private String nombres;

    private String apellidos;

    private String email;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String telefono;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String direccion;

    private Double latitud;

    private Double longitud;

    public UsuarioDto(Long idUsuario, String username, String nombres, String apellidos, String email){
        super(idUsuario, username);
        this.nombres=nombres;
        this.apellidos=apellidos;
        this.email=email;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Double getLatitud() {
        return latitud;
    }

    public void setLatitud(Double latitud) {
        this.latitud = latitud;
    }

    public Double getLongitud() {
        return longitud;
    }

    public void setLongitud(Double longitud) {
        this.longitud = longitud;
    }

    @Override
    public String toString() {
        return "UsuarioDto{" +
                "nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", email='" + email + '\'' +
                ", telefono='" + telefono + '\'' +
                ", direccion='" + direccion + '\'' +
                ", latitud=" + latitud +
                ", longitud=" + longitud +
                '}';
    }
}
