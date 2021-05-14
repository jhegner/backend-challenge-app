package com.jhegner.desafioitau.sd.validasenha.domain;

import com.jhegner.desafioitau.sd.validasenha.domain.commons.DomainCommons;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DomainCommonsTests {

    @Test
    @DisplayName("Deve testar se o caracter eh um numero")
    public void deveTestarSeCaracterNumerico() {

        // -- Dada um caracter
        char c1 = '0';
        char c2 = '9';
        char c3 = 'A';
        char c4 = 'a';

        // -- Quando validado se eh numerico
        boolean result1 = DomainCommons.isNumerico(c1);
        boolean result2 = DomainCommons.isNumerico(c2);
        boolean result3 = DomainCommons.isNumerico(c3);
        boolean result4 = DomainCommons.isNumerico(c4);

        // -- Entao devera ser valido se for um caracter entre [0 - 9]
        assertTrue(result1);
        assertTrue(result2);

        // -- Entao nao devera ser valido se for um caracter diferente do conjunto [0 - 9]
        assertFalse(result3);
        assertFalse(result4);
    }

    @Test
    @DisplayName("Deve testar se o caracter eh uma letra")
    public void deveTestarSeCaracterEhUmaLetra() {

        // -- Dada um caracter
        char c1 = 'B';
        char c2 = 'c';
        char c3 = '1';
        char c4 = '2';

        // -- Quando validado se eh numerico
        boolean result1 = DomainCommons.isLetra(c1);
        boolean result2 = DomainCommons.isLetra(c2);
        boolean result3 = DomainCommons.isLetra(c3);
        boolean result4 = DomainCommons.isLetra(c4);

        // -- Entao devera ser valido se o caracter for uma letra
        assertTrue(result1);
        assertTrue(result2);

        // -- Entao nao devera ser valido se o caracter nao for uma letra
        assertFalse(result3);
        assertFalse(result4);
    }

}
