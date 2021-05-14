package com.jhegner.desafioitau.sd.validasenha.web;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class WebAppTests {

    @Autowired
    private ValidaSenhaController controller;

    @Test
    @DisplayName("Verifica o contexto do spring e os controllers carregados")
    void contextLoads() {
        assertThat(controller).isNotNull();
    }

}
