package com.cespedesz07.texto;

import com.cespedesz07.actividad.Actividad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping( path = "/texto" )
public class TextoController {

    @Autowired
    private TextoRepository textoRepository;

    /*
    @CrossOrigin
    @ResponseBody
    @GetMapping( path = "nivel/{nivel}" )
    public Iterable<Texto> getTextoByNivel( @PathVariable("nivel") int nivel ) {
        return textoRepository.getTextoByNivel(nivel);
    }
    */
}
