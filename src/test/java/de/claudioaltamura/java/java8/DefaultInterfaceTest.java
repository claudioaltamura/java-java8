package de.claudioaltamura.java.java8;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class DefaultInterfaceTest {

  @Test
  void test() {
    assertThat(new DefaultInterface() {}.sqrt(2)).isEqualTo(1.4142135623730951D);
  }
}
