package com.jhegner.desafioitau.sd.validasenha.domain;

import com.jhegner.desafioitau.sd.validasenha.domain.commons.DomainCommons;

public class ValidaQuantidadeCaracteresNumerico extends ValidaSenha {

    // pode ser configurado em prop. ou banco
    private static final int QUANTIDADE_CARACTERES_NUMERICOS_MINIMA = 1;

    public boolean validar(String senha) {

        char[] caracteres = senha.toCharArray();
        int contador = 0;

        for (char caracter : caracteres) {

            if (DomainCommons.isNumerico(caracter)) {
                contador += 1;
            }

        }
        return contador >= QUANTIDADE_CARACTERES_NUMERICOS_MINIMA;
    }
}
