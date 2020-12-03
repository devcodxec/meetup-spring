package com.proyecto.meetup.repositories;

import com.proyecto.meetup.entities.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioDao extends CrudRepository<Usuario,Long> {

}
