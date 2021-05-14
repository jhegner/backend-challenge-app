package com.jhegner.desafioitau.sd.validasenha.usecase;

import com.jhegner.desafioitau.sd.validasenha.domain.commons.DomainCommons;
import com.jhegner.desafioitau.sd.validasenha.usecase.ValidacaoSenhaUseCase;
import com.jhegner.desafioitau.sd.validasenha.usecase.ValidacaoSenhaUseCaseIn;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UseCaseTests {

    @Test
    @DisplayName("Deve validar uma senha com base nas regras")
    public void deveTestarSeUmaSenhaEhValidaComBaseNasRegras() {

        ValidacaoSenhaUseCaseIn usecase = new ValidacaoSenhaUseCase();

        // -- Dada uma senha
        String senha1 = "";
        String senha2 = "aa";
        String senha3 = "ab";
        String senha4 = "AAAbbbCc";
        String senha5 = "AbTp9!foo";
        String senha6 = "AbTp9!foA";
        String senha7 = "AbTp9 fok";
        String senha8 = "AbTp9!fok";

        String senha9 = "@)0aPs2_-+";
        String senha10 = "p4Rs>LA:}@";

        // -- Quando validada
        boolean result1 = usecase.validar(senha1);
        boolean result2 = usecase.validar(senha2);
        boolean result3 = usecase.validar(senha3);
        boolean result4 = usecase.validar(senha4);
        boolean result5 = usecase.validar(senha5);
        boolean result6 = usecase.validar(senha6);
        boolean result7 = usecase.validar(senha7);
        boolean result8 = usecase.validar(senha8);

        boolean result9 = usecase.validar(senha9);
        boolean result10 = usecase.validar(senha10);

        // -- Entao nao devera ser valida se for uma senha que nao siga as definicoes
        assertFalse(result1);
        assertFalse(result2);
        assertFalse(result3);
        assertFalse(result4);
        assertFalse(result5);
        assertFalse(result6);
        assertFalse(result7);

        // -- Entao devera ser valida se for uma senha que siga as definicoes
        assertTrue(result8);

        assertTrue(result9);
        assertTrue(result10);
    }
}
