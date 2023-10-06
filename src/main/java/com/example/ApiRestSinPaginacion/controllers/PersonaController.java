package com.example.ApiRestSinPaginacion.controllers;

import com.example.ApiRestSinPaginacion.entities.Persona;
import com.example.ApiRestSinPaginacion.services.PersonaServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/personas")
public class PersonaController extends BaseControllerImpl<Persona, PersonaServiceImpl>{


}