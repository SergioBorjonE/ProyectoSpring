package com.generation.ProyectoSpring;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/*la manera en que le indicamos que esta clase podrá recibir peticiones
HTTP es a través de la anotación @RestController*/
@RestController
public class HelloController {

    /*petición por método GET*/
    @GetMapping("/")
    public String index() {
        return "Hola a todos les habla Sergio desde Java/Spring";
    }

}
