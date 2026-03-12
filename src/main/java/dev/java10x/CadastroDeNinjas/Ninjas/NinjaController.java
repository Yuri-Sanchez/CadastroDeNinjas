package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping // Aplicação para colocar todas as nossas rotas no mesmo lugar

public class NinjaController {

    @GetMapping("/boasvindas") // Pega informações
    public String boasVindas(){
        return "Essa é minha primeira mensagem nessa rota";
    }

}
