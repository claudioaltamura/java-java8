package de.claudioaltamura.java.java8;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

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
