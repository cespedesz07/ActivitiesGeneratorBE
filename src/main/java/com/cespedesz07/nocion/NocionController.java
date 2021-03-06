package com.cespedesz07.nocion;

import com.cespedesz07.lectura.Lectura;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(path = "/nocion")
public class NocionController {

    @Autowired
    private NocionRepository nocionRepository;

    @CrossOrigin
    @GetMapping(path = "/all")
    @ResponseBody
    public Iterable<Nocion> getAllNociones() {
        return nocionRepository.findAll();
    }

    @CrossOrigin
    @GetMapping(path = "/{idNocion}")
    @ResponseBody
    public Nocion getNocion(@PathVariable int idNocion) {
        return nocionRepository.findOne( idNocion );
    }

    @CrossOrigin
    @ResponseBody
    @GetMapping( path = "/{idNocion}/lecturas" )
    public Iterable<Lectura> getLecturasByNocion(@PathVariable int idNocion ) {
        return nocionRepository.findOne(idNocion).getLecturas();
    }
}
