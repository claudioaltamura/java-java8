package de.claudioaltamura.java.java8;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

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
