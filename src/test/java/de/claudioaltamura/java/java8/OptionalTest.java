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

    person.ifPresent(p -> System.out.println(p));
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

  @Test
  void map() {
    Optional<Person> person = Optional.of(new Person("Peter", "Parker"));

    String firstName = person.map(Person::getFirstName).orElse("default");

    assertThat(firstName).isEqualTo("Peter");
  }

  @Test
  void filter() {
    Optional<Person> person = Optional.of(new Person("I have just a firstname", ""));

    String lastName =
        person.filter(p -> !"".equals(p.getLastName())).map(p -> p.getLastName()).orElse("Unknown");

    assertThat(lastName).isEqualTo("Unknown");
  }
}
