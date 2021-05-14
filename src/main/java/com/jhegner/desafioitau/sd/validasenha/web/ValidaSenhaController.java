package com.jhegner.desafioitau.sd.validasenha.web;

import com.jhegner.desafioitau.sd.validasenha.usecase.ValidacaoSenhaUseCaseIn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/valida-senha")
public class ValidaSenhaController {

    private final ValidacaoSenhaUseCaseIn useCaseIn;

    @Autowired
    public ValidaSenhaController(ValidacaoSenhaUseCaseIn useCaseIn) {
        this.useCaseIn = useCaseIn;
    }

    @PostMapping
    public ResponseEntity<Void> postSenha(@RequestHeader(name = "senha") String senha) {

        if(null != senha && useCaseIn.validar(senha)) {
            return ResponseEntity.status(HttpStatus.OK).build();
        }

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }

}
