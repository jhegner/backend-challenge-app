package com.jhegner.desafioitau.sd.validasenha.domain;

import com.jhegner.desafioitau.sd.validasenha.domain.commons.DomainCommons;

import java.text.Collator;

public class ValidaQuantidadeCaracteresCaixaAlta extends ValidaSenha {

    // pode ser configurado em prop. ou banco
    private static final int QUANTIDADE_CARACTERES_CAIXA_ALTA_MINIMA = 1;

    public boolean validar(String senha) {

        char[] caracteres = senha.toCharArray();
        int contador = 0;
        Collator collator = Collator.getInstance();

        for(char caracter : caracteres){

            if(DomainCommons.isNumerico(caracter) || !DomainCommons.isLetra(caracter)) continue;

            if(collator.compare(String.valueOf(caracter),
                    String.valueOf(caracter).toUpperCase()) == 0) {
                contador+=1;
            }
        }

        return contador >= QUANTIDADE_CARACTERES_CAIXA_ALTA_MINIMA;
    }
}
