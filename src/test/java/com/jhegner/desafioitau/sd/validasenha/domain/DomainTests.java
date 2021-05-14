package com.jhegner.desafioitau.sd.validasenha.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DomainTests {

    @Test
    @DisplayName("Deve testar o tamanho de uma senha")
    public void deveTestarTamanhoDeUmaSenha() {

        // -- Dada uma senha informada
        String senha1 = "123456789";
        String senha2 = "1234567890123456";
        String senha3 = "1234";
        String senha4 = "@";
        String senha5 = "";
        String senha6 = " ";

        ValidaSenha validaSenha = new ValidaTamanho();

        // -- Quando validado o tamanho
        boolean result1 = validaSenha.valida(senha1);
        boolean result2 = validaSenha.valida(senha2);
        boolean result3 = validaSenha.valida(senha3);
        boolean result4 = validaSenha.valida(senha4);
        boolean result5 = validaSenha.valida(senha5);
        boolean result6 = validaSenha.valida(senha6);
        boolean result7 = validaSenha.valida(null);

        // -- Entao devera ser valida quando houver 9 ou mais caracteres
        assertTrue(result1);
        assertTrue(result2);

        // -- E nao devera ser valida quando houver menos de 9 caracteres, vazio ou nula
        assertFalse(result3);
        assertFalse(result4);
        assertFalse(result5);
        assertFalse(result6);
        assertFalse(result7);

    }

    @Test
    @DisplayName("Deve testar a quantidade de caracteres repetidos")
    public void deveTestarQuantidadeDeCaracteresRepetidosSenha() {

        // -- Dada uma senha informada
        String senha1 = "12345";
        String senha2 = "124";
        String senha3 = "@#_a2";
        String senha4 = "@@";
        String senha5 = "";
        String senha6 = "";

        ValidaSenha validaSenha = new ValidaCaracteresRepetidos();

        // -- Quando validado a quantidade de caracteres
        boolean result1 = validaSenha.valida(senha1);
        boolean result2 = validaSenha.valida(senha2);
        boolean result3 = validaSenha.valida(senha3);
        boolean result4 = validaSenha.valida(senha4);
        boolean result5 = validaSenha.valida(senha5);
        boolean result6 = validaSenha.valida(senha6);
        boolean result7 = validaSenha.valida(null);

        // -- Entao devera ser valida quando nao houver caracteres repetidos
        assertTrue(result1);
        assertTrue(result2);
        assertTrue(result3);

        // -- Entao nao devera ser valida quando houver caracteres repetidos
        assertFalse(result4);
        assertFalse(result5);
        assertFalse(result6);
        assertFalse(result7);

    }

    @Test
    @DisplayName("Deve testar a quantidade de caracteres caixa alta")
    public void deveTestarQuantidadeDeCaracteresCaixaAlta() {

        // -- Dada uma senha informada
        String senha1 = "Ab24wE";
        String senha2 = "aaaE_@)(#qP";
        String senha3 = "))))))00000###@4_+_)a_Eaaa@*-I";
        String senha4 = "aaaaaa";
        String senha5 = "134342sdsd654eee";
        String senha6 = "                                      S";

        ValidaSenha validaSenha = new ValidaQuantidadeCaracteresCaixaAlta();

        // -- Quando validado a quantidade de caracteres caixa alta
        boolean result1 = validaSenha.valida(senha1);
        boolean result2 = validaSenha.valida(senha2);
        boolean result3 = validaSenha.valida(senha3);
        boolean result4 = validaSenha.valida(senha4);
        boolean result5 = validaSenha.valida(senha5);
        boolean result6 = validaSenha.valida(senha6);
        boolean result7 = validaSenha.valida(null);

        // -- Entao devera ser valida quando houver ao menos 1 caracter caixa alta
        assertTrue(result1);
        assertTrue(result2);
        assertTrue(result3);

        // -- Entao nao devera ser valida quando nao houver caracteres caixa alta
        assertFalse(result4);
        assertFalse(result5);
        assertFalse(result6);
        assertFalse(result7);

    }

    @Test
    @DisplayName("Deve testar a quantidade de caracteres caixa baixa")
    public void deveTestarQuantidadeDeCaracteresCaixaBaixa() {

        // -- Dada uma senha informada
        String senha1 = "U_o2323#";
        String senha2 = "___()1p";
        String senha3 = "s";
        String senha4 = "AA22%%$#$#@@@";
        String senha5 = ".-P[AIU34_+#22";
        String senha6 = "_===##$45SD33";

        ValidaSenha validaSenha = new ValidaQuantidadeCaracteresCaixaBaixa();

        // -- Quando validado a quantidade de caracteres caixa baixa
        boolean result1 = validaSenha.valida(senha1);
        boolean result2 = validaSenha.valida(senha2);
        boolean result3 = validaSenha.valida(senha3);
        boolean result4 = validaSenha.valida(senha4);
        boolean result5 = validaSenha.valida(senha5);
        boolean result6 = validaSenha.valida(senha6);
        boolean result7 = validaSenha.valida(null);

        // -- Entao devera ser valida quando houver ao menos 1 caracter caixa baixa
        assertTrue(result1);
        assertTrue(result2);
        assertTrue(result3);

        // -- Entao nao devera ser valida quando nao houver caracteres caixa baixa
        assertFalse(result4);
        assertFalse(result5);
        assertFalse(result6);
        assertFalse(result7);

    }

    @Test
    @DisplayName("Deve testar a quantidade de caracteres especiais")
    public void deveTestarQuantidadeDeCaracteresEspeciais() {

        // -- Dada uma senha informada
        String senha1 = "aa#P2_a";
        String senha2 = "Ioa#LÇ_";
        String senha3 = "123546546456456546dffdadfasdf*";
        String senha4 = "haha2323434~Ç";
        String senha5 = "=====OOBBBBºººº////????";
        String senha6 = "        ";

        ValidaSenha validaSenha = new ValidaQuantidadeCaracteresEspeciais();

        // -- Quando validado a quantidade de caracteres caixa baixa
        boolean result1 = validaSenha.valida(senha1);
        boolean result2 = validaSenha.valida(senha2);
        boolean result3 = validaSenha.valida(senha3);
        boolean result4 = validaSenha.valida(senha4);
        boolean result5 = validaSenha.valida(senha5);
        boolean result6 = validaSenha.valida(senha6);
        boolean result7 = validaSenha.valida(null);

        // -- Entao devera ser valida quando houver ao menos 1 caracter especial
        assertTrue(result1);
        assertTrue(result2);
        assertTrue(result3);

        // -- Entao nao devera ser valida quando nao houver caracter especial
        assertFalse(result4);
        assertFalse(result5);
        assertFalse(result6);
        assertFalse(result7);

    }

    @Test
    @DisplayName("Deve testar a quantidade de caracteres numericos")
    public void deveTestarQuantidadeDeCaracteresNumericos() {

        // -- Dada uma senha informada
        String senha1 = "aaaaaaaaaaa1";
        String senha2 = "123456()(333";
        String senha3 = "###$*UPsdsdopsdsd2";
        String senha4 = "pspdkpsadoks ())(()#LKLSDKLSD";
        String senha5 = "_________===SDSDSDSD    ";
        String senha6 = "        ";

        ValidaSenha validaSenha = new ValidaQuantidadeCaracteresNumerico();

        // -- Quando validado a quantidade de caracteres caixa baixa
        boolean result1 = validaSenha.valida(senha1);
        boolean result2 = validaSenha.valida(senha2);
        boolean result3 = validaSenha.valida(senha3);
        boolean result4 = validaSenha.valida(senha4);
        boolean result5 = validaSenha.valida(senha5);
        boolean result6 = validaSenha.valida(senha6);
        boolean result7 = validaSenha.valida(null);

        // -- Entao devera ser valida quando houver ao menos 1 caracter numerico
        assertTrue(result1);
        assertTrue(result2);
        assertTrue(result3);

        // -- Entao nao devera ser valida quando nao houver caracter numerico
        assertFalse(result4);
        assertFalse(result5);
        assertFalse(result6);
        assertFalse(result7);

    }

}
