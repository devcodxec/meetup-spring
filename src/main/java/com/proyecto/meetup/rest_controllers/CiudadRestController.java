package com.proyecto.meetup.rest_controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(CiudadRestController.CIUDADES)
public class CiudadRestController {

    public static final String CIUDADES = "/ciudades";
}
