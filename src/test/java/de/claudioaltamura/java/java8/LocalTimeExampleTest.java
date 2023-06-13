package de.claudioaltamura.java.java8;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LocalTimeExampleTest {

    @Test
    void of() {
        assertThat(LocalTimeExample.of()).isEqualTo("10:10");
    }

    @Test
    void now() {
        assertThat(LocalTimeExample.now()).isNotNull();
    }
}