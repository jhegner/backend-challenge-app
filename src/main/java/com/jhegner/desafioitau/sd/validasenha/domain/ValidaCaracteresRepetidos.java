package com.jhegner.desafioitau.sd.validasenha.domain;

public class ValidaCaracteresRepetidos extends ValidaSenha{

    public boolean validar(String senha) {

        int qtd = 0;
        char[] chars = senha.toCharArray();

        for(char c : chars) {

            for(char cc : chars) {
                if (c == cc) {
                    qtd+=1;
                }
            }

            if(qtd >= 2) {
                return false;
            } else {
                qtd = 0;
            }
        }

        return true;
    }
}
