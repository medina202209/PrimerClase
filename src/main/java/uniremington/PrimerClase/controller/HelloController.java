package uniremington.PrimerClase.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saludo")
public class HelloController {
    
    //getmapping permiten recibir peticiones http
    @GetMapping("/")
    public String index() {
        return "Hello, World!";
    }

    @GetMapping("/nombre")
    public String saludoNombre(@RequestParam(name= "nombre") String nombre) {
        return "¡Hola, " + nombre + "!";
    }

    @GetMapping("/saludo_completo")
    public String saludoCompleto(
        @RequestParam(name = "nombre") String nombre, 
        @RequestParam(name = "apellido") String apellido) {
        return "¡Hola, " + nombre + " " + apellido + "!";
    }
}
