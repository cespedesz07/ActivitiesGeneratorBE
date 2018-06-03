package com.cespedesz07.lectura;

import com.cespedesz07.texto.TextoRepository;
import org.omg.CORBA.portable.ApplicationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLConnection;

@RestController
@RequestMapping( path = "/lectura" )
public class LecturaController {

    @Autowired
    private LecturaRepository lecturaRepository;

    // Directory Used for Local execution
    private static final String DIRECTORY = "/Users/scespedesz/Documents/Projects/ActivitiesGeneratorBE/";
    // Directory Used for Heroku remote execution
    // private static final String DIRECTORY = "/app/";

    @Autowired
    private ServletContext servletContext;

    @GetMapping(value = "/{idLectura}/loadPDF")
    @ResponseBody
    public void generateWithResponseBody( @PathVariable int idLectura, final HttpServletRequest httpRequest, final HttpServletResponse response)
            throws ApplicationException, FileNotFoundException, IOException {
        String fileRelativePath = lecturaRepository.findOne( idLectura ).getRuta();
        File file = new File(DIRECTORY + "/" + fileRelativePath);
        if ( file != null ) {
            String mimeType = URLConnection.guessContentTypeFromName(file.getName());
            response.setContentType(mimeType);
            response.setHeader("Content-Disposition", String.format("inline; filename=\"%s\"", file.getName()));
            response.setContentLength((int) file.length());
            InputStream inputStream = new BufferedInputStream(new FileInputStream(file));
            FileCopyUtils.copy(inputStream, response.getOutputStream());
        }
    }
}


