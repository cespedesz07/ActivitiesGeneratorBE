package com.cespedesz07.enviarEmail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.mail.internet.MimeMessage;

@Controller
public class EnviarEmailController {

    @Autowired
    private JavaMailSender sender;

    @PostMapping(value = "/enviar_email")
    @ResponseBody
    @CrossOrigin
    String sendEmailCaller( @RequestBody EstructuraEmail estructuraEmail ) {
        try {
            sendEmail( estructuraEmail );
            return "Email Sent!";
        }
        catch(Exception ex) {
            return "Error in sending email: " + ex;
        }
    }

    private void sendEmail( EstructuraEmail estructuraEmail ) throws Exception{
        MimeMessage message = sender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message);

        helper.setTo( estructuraEmail.correoProfesor );
        helper.setText( estructuraEmail.textoEstudiante );
        helper.setSubject( "ActivitiesGenerator - Recibo Texto Estudiante" );

        sender.send(message);
    }
}
