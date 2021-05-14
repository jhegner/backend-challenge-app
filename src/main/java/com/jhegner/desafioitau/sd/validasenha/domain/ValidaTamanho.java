package com.jhegner.desafioitau.sd.validasenha.domain;

public class ValidaTamanho extends ValidaSenha {

    // pode ser configurado em prop. ou banco
    private static final int TAMANHO_MINIMO = 9;

    public boolean validar(String senha) {
        return senha.length() >= TAMANHO_MINIMO;
    }
}
