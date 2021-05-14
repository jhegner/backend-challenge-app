package com.jhegner.desafioitau.sd.validasenha.usecase;

import com.jhegner.desafioitau.sd.validasenha.domain.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ValidacaoSenhaUseCase implements ValidacaoSenhaUseCaseIn{

    @Override
    public boolean validar(String senha) {

        List<ValidaSenha> validacoes = getValidadores();

        for(ValidaSenha validador : validacoes) {
            if(!validador.valida(senha)) {
                return false;
            }
        }
        return true;
    }

    private List<ValidaSenha> getValidadores() {
        return List.of(
                new ValidaTamanho(),
                new ValidaCaracteresRepetidos(),
                new ValidaQuantidadeCaracteresCaixaAlta(),
                new ValidaQuantidadeCaracteresCaixaBaixa(),
                new ValidaQuantidadeCaracteresEspeciais(),
                new ValidaQuantidadeCaracteresNumerico()
        );
    }
}
