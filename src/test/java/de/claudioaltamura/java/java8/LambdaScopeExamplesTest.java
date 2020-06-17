package de.claudioaltamura.java.java8;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class LambdaScopeExamplesTest {

  @Test
  void finalLocalVariables() {
    final int num = 1;
    Converter<Integer, String> stringConverter = (from) -> String.valueOf(from + num);

    assertThat(stringConverter.convert(2)).isEqualTo("3");
  }
}
