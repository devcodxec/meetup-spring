package com.proyecto.meetup.repositories;

import com.proyecto.meetup.entities.Ciudad;
import org.springframework.data.repository.CrudRepository;

public interface CiudadDao extends CrudRepository<Ciudad,Long> {
}
