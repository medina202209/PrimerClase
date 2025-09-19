package uniremington.PrimerClase.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import uniremington.PrimerClase.dto.OperadorDTO;

@RestController
@RequestMapping("/calculadora")
public class CalcularaController {
    
    //getmapping permiten recibir peticiones http
    //Interactua desde OperadorDTO
    @GetMapping("/operacion")
    public OperadorDTO operacion(@RequestBody OperadorDTO operadorDTO){

        if(operadorDTO.getOperador().matches("suma")){
            operadorDTO.setResultado(
                suma(
                    operadorDTO.getNumero1(),
                    operadorDTO.getNumero2())
            );
        }
        if (operadorDTO.getOperador().matches("resta")) {
            operadorDTO.setResultado(
                    resta(
                            operadorDTO.getNumero1(),
                            operadorDTO.getNumero2()));
        } 
        if (operadorDTO.getOperador().matches("multiplicacion")) {
            operadorDTO.setResultado(
                    multiplicacion(
                            operadorDTO.getNumero1(),
                            operadorDTO.getNumero2()));
        }
        if (operadorDTO.getOperador().matches("division")) {
            operadorDTO.setResultado(
                    division(
                            operadorDTO.getNumero1(),
                            operadorDTO.getNumero2()));
        }

        return operadorDTO;
    }

    @GetMapping("/suma")
    public String suma(
            @RequestParam(name = "num1") Integer num1,
            @RequestParam(name = "num2") Integer num2) {

        Integer resultado = num1 + num2;
        return resultado.toString();
    }

    @GetMapping("/resta")
    public String resta(
            @RequestParam(name = "num1") Integer num1,
            @RequestParam(name = "num2") Integer num2) {

        Integer resultado = num1 - num2;
        return resultado.toString();
    }

    @GetMapping("/multiplicacion")
    public String multiplicacion(
            @RequestParam(name = "num1") Integer num1,
            @RequestParam(name = "num2") Integer num2) {

        Integer resultado = num1 * num2;
        return resultado.toString();
    }

    @GetMapping("/division")
    public String division(
            @RequestParam(name = "num1") Integer num1,
            @RequestParam(name = "num2") Integer num2) {

        if (num2 == 0) {

            Integer resultado = 0;

            return resultado.toString();
        }

        Integer resultado = num1 / num2;

        return resultado.toString();
    }

}
