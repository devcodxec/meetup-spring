package com.proyecto.meetup.rest_controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(TipoMensajeRestController.TIPO_MENSAJES)
public class TipoMensajeRestController {

    public static final String TIPO_MENSAJES = "/tipoMensajes";
}
