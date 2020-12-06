package com.proyecto.meetup.repositories;

import com.proyecto.meetup.entities.Ciudad;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CiudadDao extends CrudRepository<Ciudad,Long> {

   List<Ciudad> findAll();
}
