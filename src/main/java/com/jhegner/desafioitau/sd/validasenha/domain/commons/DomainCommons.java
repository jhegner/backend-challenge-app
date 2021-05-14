package com.jhegner.desafioitau.sd.validasenha.domain.commons;

public final class DomainCommons {

    public static boolean isNumerico(char caracter) {
        return ((int) caracter >= 48 && (int) caracter <= 57);
    }

    public static boolean isLetra(char caracter) {
        return (isLetraMinuscula(caracter) || isLetraMaiuscula(caracter));
    }

    private static boolean isLetraMinuscula(char caracter) {
        return ((int) caracter >= 65 && (int) caracter <= 90);
    }

    private static boolean isLetraMaiuscula(char caracter) {
        return ((int) caracter >= 97 && (int) caracter <= 122);
    }
}
