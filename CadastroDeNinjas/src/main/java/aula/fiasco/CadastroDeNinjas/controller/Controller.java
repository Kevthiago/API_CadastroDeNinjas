package aula.fiasco.CadastroDeNinjas.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping
public class Controller {
    
    @GetMapping("/boasvindas")
    public String boasVindas(){
        return "Bem-vindo ao Cadastro de Ninjas!";
    }
}
