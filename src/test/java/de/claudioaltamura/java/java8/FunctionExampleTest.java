package de.claudioaltamura.java.java8;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.function.Function;
import org.junit.jupiter.api.Test;

class FunctionExampleTest {

  @Test
  void andThen() {
    Function<String, Integer> toInteger = Integer::valueOf;
    Function<String, String> backToString = toInteger.andThen(String::valueOf);

    assertThat(backToString.apply("123")).isEqualTo("123");
  }

  @Test
  void compose() {
    Function<String, Integer> toInteger = Integer::valueOf;
    Function<String, String> addOne = (s) -> s + "1";
    Function<String, Integer> composed = toInteger.compose(addOne);

    assertThat(composed.apply("123")).isEqualTo(1231);
  }
}
