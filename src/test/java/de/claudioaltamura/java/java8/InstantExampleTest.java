package de.claudioaltamura.java.java8;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class InstantExampleTest {

    @Test
    void now() {
        assertThat(InstantExample.now()).isNotNull();
    }

    @Test
    void specificInstant() {
        assertThat(InstantExample.dayOne()).asString().contains("1970");
    }

}