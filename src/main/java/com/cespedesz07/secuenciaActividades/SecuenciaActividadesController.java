package com.cespedesz07.secuenciaActividades;

import com.cespedesz07.actividad.Actividad;
import com.cespedesz07.actividad.ActividadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Iterator;

@RestController
@RequestMapping(path = "/secuencia")
public class SecuenciaActividadesController {

    @Autowired
    private SecuenciaActividadesRepository secuenciaActividadesRepository;

    @CrossOrigin
    @ResponseBody
    @PostMapping(path = "/registrar" )
    public void registerSecuencia( @RequestBody SecuenciaActividades secuenciaActividades ) {
        secuenciaActividadesRepository.save( secuenciaActividades );
    }

    @CrossOrigin
    @ResponseBody
    @GetMapping( path = "/{idSecuencia}" )
    public SecuenciaActividades getSecuencia( @PathVariable int idSecuencia ) {
        return secuenciaActividadesRepository.findOne( idSecuencia );
    }

    @CrossOrigin
    @ResponseBody
    @GetMapping( path = "/all" )
    public Iterable<SecuenciaActividades> getAllSecuencias() {
        return secuenciaActividadesRepository.findAll();
    }

    @CrossOrigin
    @ResponseBody
    @DeleteMapping( path = "/{idSecuencia}/eliminar" )
    public void deleteSecuencia( @PathVariable("idSecuencia") int idSecuencia ) {
        secuenciaActividadesRepository.delete( idSecuencia );
    }

    @CrossOrigin
    @ResponseBody
    @GetMapping( path = "/{idSecuencia}/actividades" )
    public Iterable<Actividad> getActivitiesOfSecuencia( @PathVariable int idSecuencia ) {
        return secuenciaActividadesRepository.findOne( idSecuencia ).getActividades();
    }
}
