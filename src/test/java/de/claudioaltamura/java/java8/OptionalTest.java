package de.claudioaltamura.java.java8;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Optional;
import org.junit.jupiter.api.Test;

class OptionalTest {

  @Test
  void nonNull() {
    Optional<Person> person = Optional.of(new Person());

    assertThat(person.get()).isNotNull();
  }

  @Test
  void nullableIsPresent() {
    Optional<Person> nullable = Optional.ofNullable(null);

    assertThat(nullable.isPresent()).isFalse();
  }

  @Test
  void fallback() {
    Optional<Person> nullable = Optional.ofNullable(null);

    assertThat(nullable.orElse(new Person())).isNotNull();
  }

  @Test
  void throwException() {
    Optional<Person> nullable = Optional.ofNullable(null);

    assertThrows(RuntimeException.class, () -> nullable.orElseThrow(RuntimeException::new));
  }
}
