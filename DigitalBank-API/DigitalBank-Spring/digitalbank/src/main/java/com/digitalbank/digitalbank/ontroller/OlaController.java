package com.digitalbank.digitalbank.ontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.digitalbank.model.Cliente;
import com.digitalbank.repository.ClienteDAO;
import java.time.LocalDate;

@RestController
@RequestMapping("/ola")
public class OlaController {

    @Autowired
    private ClienteDAO clienteDAO;

    @GetMapping("/cadastrar")
    public String cadastrarTeste() {
        Cliente c = new Cliente();
        c.setNome("João Spring");
        c.setCPF("11122233344");
        c.setEmail("spring@email.com");
        c.setDataDeNascimento(LocalDate.of(2006, 1, 1));
        c.setCelular("11999999999");
        
        clienteDAO.salvar(c);
        
        return "Cliente salvo no MySQL com sucesso!";
    }

    @GetMapping
    public String enviarMensagem() {
        return "Ola, Spring Boot funcionando!";
    }
}
