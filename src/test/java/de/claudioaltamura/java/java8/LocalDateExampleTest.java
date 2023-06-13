package de.claudioaltamura.java.java8;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LocalDateExampleTest {

    @Test
    void of() {
        assertThat(LocalDateExample.of()).isEqualTo("1970-01-01");
    }

    @Test
    void now() {
        assertThat(LocalDateExample.now()).isNotNull();
    }

}