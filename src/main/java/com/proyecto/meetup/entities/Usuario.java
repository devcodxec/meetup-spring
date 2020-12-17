package com.proyecto.meetup.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id_Usuario")
    private Long idUsuario;

    @Column(name="Nombres")
    private String nombres;
    @Column(name="Apellidos")
    private String apellidos;
    @Column(name = "Username")
    private String username;
    @Column(name="Password")
    private String password;
    @Column(name="Email")
    private String email;
    @Column(name="Nickname")
    private String nickname;
    @Column(name="Telefono")
    private String telefono;
    @Column(name="Direccion")
    private String direccion;
    @Column(name="Latitud")
    private Double latitud;
    @Column(name="Longitud")
    private Double longitud;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "Id_Ciudad")
    private Ciudad ciudad;

//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "usuario", cascade = CascadeType.ALL)
//    private List<Grupo> grupos;
//
//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "usuario", cascade = CascadeType.ALL)
//    private List<TemaUsuario> temaUsuarios;

    public Usuario(){
//        this.grupos=new ArrayList<>();
//        this.temaUsuarios=new ArrayList<>();
    }


    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
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

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

//    public List<Grupo> getGrupos() {
//        return grupos;
//    }
//
//    public void setGrupos(List<Grupo> grupos) {
//        this.grupos = grupos;
//    }
//
//    public List<TemaUsuario> getTemaUsuarios() {
//        return temaUsuarios;
//    }
//
//    public void setTemaUsuarios(List<TemaUsuario> temaUsuarios) {
//        this.temaUsuarios = temaUsuarios;
//    }

    @Override
    public String toString() {
        return "Usuario{" +
                "idUsuario=" + idUsuario +
                ", nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", nickname='" + nickname + '\'' +
                ", telefono='" + telefono + '\'' +
                ", direccion='" + direccion + '\'' +
                ", latitud=" + latitud +
                ", longitud=" + longitud +
                ", ciudad=" + ciudad +
                '}';
    }
}
