package br.com.teste.spring;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.teste.spring.model.Usuario;
import br.com.teste.spring.service.UsuarioService;

@SpringBootApplication
public class Application {
	@Autowired
    private UsuarioService usuarioService;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@PostConstruct
    public void init() {
        // chama o método criarUsuario passando os parâmetros desejados
        usuarioService.criarUsuario("Olival Paulino", "olivalpaulino@gmail.com", "root");
    }
}
