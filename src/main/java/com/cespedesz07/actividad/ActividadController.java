package com.cespedesz07.actividad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping( path = "/actividad" )
public class ActividadController {

    @Autowired
    public ActividadRepository actividadRepository;

    @CrossOrigin
    @ResponseBody
    @GetMapping( path = "/all" )
    public Iterable<Actividad> getAllActividades() {
        return actividadRepository.findAll();
    }
}
