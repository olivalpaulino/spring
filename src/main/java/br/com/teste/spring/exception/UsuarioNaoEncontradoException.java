package br.com.teste.spring.exception;

import org.springframework.web.bind.annotation.ResponseStatus;

//@ResponseStatus(Http.NOT_FOUND)
public class UsuarioNaoEncontradoException extends RuntimeException {

    public UsuarioNaoEncontradoException(Long id) {
        super("Usuário não encontrado com o ID " + id);
    }
}
