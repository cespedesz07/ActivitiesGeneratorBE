package com.cespedesz07.lectura;

import com.cespedesz07.texto.TextoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping( path = "/lectura" )
public class LecturaController {

    @Autowired
    private LecturaRepository lecturaRepository;
}
