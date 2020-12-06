package com.proyecto.meetup.rest_controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(UsuarioRestController.USUARIOS)
public class UsuarioRestController {

    public static final String USUARIOS = "/usuarios";
}
