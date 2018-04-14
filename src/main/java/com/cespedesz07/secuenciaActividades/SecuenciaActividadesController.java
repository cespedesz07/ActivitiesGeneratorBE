package com.cespedesz07.secuenciaActividades;

import com.cespedesz07.actividad.Actividad;
import com.cespedesz07.actividad.ActividadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Iterator;

@RestController
@RequestMapping(path = "secuencia/")
public class SecuenciaActividadesController {

    @Autowired
    private SecuenciaActividadesRepository secuenciaActividadesRepository;
    private ActividadRepository actividadRepository;

    @CrossOrigin
    @ResponseBody
    @PostMapping(path = "registrar/" )
    public void registerSecuencia( @RequestBody SecuenciaActividades secuenciaActividades ) {
        secuenciaActividadesRepository.save( secuenciaActividades );
    }
}
