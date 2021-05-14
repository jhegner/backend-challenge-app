package com.jhegner.desafioitau.sd.validasenha.domain;

public abstract class ValidaSenha {

    public boolean valida(String senha) {
        if(senha == null || senha.isEmpty() || senha.contains(" ")) return false;
        return this.validar(senha);
    }

    public abstract boolean validar(String senha);
}
