package com.cespedesz07.nivel;

import com.cespedesz07.texto.Texto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/nivel")
public class NivelController {

    @Autowired
    private NivelRepository nivelRepository;

    @CrossOrigin
    @RequestMapping(path = "/all", method = RequestMethod.GET)
    @ResponseBody
    public Iterable<Nivel> getAllNiveles() {
        return nivelRepository.findAll();
    }

    @CrossOrigin
    @ResponseBody
    @GetMapping( path = "{idNivel}/textos" )
    public Iterable<Texto> getTextosByNivel(@PathVariable("idNivel") int idNivel ) {
        return nivelRepository.findOne(idNivel).getTextos();
    }

}
