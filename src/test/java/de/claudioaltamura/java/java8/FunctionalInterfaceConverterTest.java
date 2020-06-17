package de.claudioaltamura.java.java8;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class FunctionalInterfaceConverterTest {

  @Test
  void test() {
    Converter<String, Integer> converter = (from) -> Integer.valueOf(from);

    assertThat(converter.convert("123")).isEqualTo(123);
  }
}
