package de.claudioaltamura.java.java8;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class LocalDateTimeExampleTest {

  @Test
  void of() {
    assertThat(LocalDateTimeExample.of()).isEqualTo("1970-01-01T10:10:30");
  }

  @Test
  void now() {
    assertThat(LocalDateTimeExample.now()).isNotNull();
  }
}
