package com.cespedesz07.texto;

import com.cespedesz07.actividad.Actividad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

@RestController
@RequestMapping( path = "/texto" )
public class TextoController {

    @Autowired
    private TextoRepository textoRepository;


    @CrossOrigin
    @ResponseBody
    @GetMapping( path = "/{idTexto}/contenido", produces = MediaType.TEXT_PLAIN_VALUE)
    public String getContenidoTexto( @PathVariable int idTexto ) {
        Texto texto = textoRepository.findOne( idTexto );
        String content = "";
        try {
            FileReader fileReader = new FileReader(texto.getRuta());
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String currentLine;
            while ((currentLine = bufferedReader.readLine()) != null) {
                content += currentLine;
            }
        } catch (FileNotFoundException e) {

        } catch (IOException e) {

        }
        return content;
    }
}
