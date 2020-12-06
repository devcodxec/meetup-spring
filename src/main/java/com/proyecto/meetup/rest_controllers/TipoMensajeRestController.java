package com.proyecto.meetup.rest_controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(TipoMensajeController.TIPO_MENSAJES)
public class TipoMensajeController {

    public static final String TIPO_MENSAJES = "/tipoMensajes";
}
