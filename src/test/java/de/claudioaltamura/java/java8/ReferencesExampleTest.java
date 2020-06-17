package de.claudioaltamura.java.java8;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class ReferencesExampleTest {

  @Test
  void methodReference() {
    Converter<String, Integer> converter = Integer::valueOf;

    assertThat(converter.convert("123")).isEqualTo(123);
  }

  @Test
  void construtorReference() {
    Factory<Person> person = Person::new;
    assertThat(person).isNotNull();
  }
}
