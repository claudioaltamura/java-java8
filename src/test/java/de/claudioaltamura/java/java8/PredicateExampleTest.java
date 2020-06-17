package de.claudioaltamura.java.java8;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Objects;
import java.util.function.Predicate;
import org.junit.jupiter.api.Test;

class PredicateExampleTest {

  @Test
  void test() {
    Person person = new Person("Peter", "Parker");

    Predicate<String> sizeGreaterThanZero = (s) -> s.length() > 0;

    assertThat(sizeGreaterThanZero.test(person.getFirstName())).isTrue();
  }

  @Test
  void testNonNull() {
    Predicate<Person> nonNull = Objects::nonNull;

    Person person = new Person("Peter", "Parker");

    assertThat(nonNull.test(person)).isTrue();
  }

  @Test
  void testIsNull() {
    Predicate<Person> isNull = Objects::isNull;

    Person person = null;

    assertThat(isNull.test(person)).isTrue();
  }

  @Test
  void testS() {
    Predicate<String> isEmpty = String::isEmpty;

    assertThat(isEmpty.test("")).isTrue();
  }

  @Test
  void testIsNotEmpty() {
    Predicate<String> isEmpty = String::isEmpty;
    Predicate<String> isNotEmpty = isEmpty.negate();

    assertThat(isNotEmpty.test("hello")).isTrue();
  }
}
