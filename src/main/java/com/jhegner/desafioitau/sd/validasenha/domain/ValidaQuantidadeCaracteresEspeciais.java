package com.jhegner.desafioitau.sd.validasenha.domain;

import java.util.Arrays;
import java.util.List;

public class ValidaQuantidadeCaracteresEspeciais extends ValidaSenha {

    private static final List<String> caracteresEspeciais
            = Arrays.asList("!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "-", "+", ")");

    public boolean validar(String senha) {
        return caracteresEspeciais.stream().anyMatch(senha::contains);
    }

}
