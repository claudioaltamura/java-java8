package de.claudioaltamura.java.java8;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Comparator;
import org.junit.jupiter.api.Test;

class ComparatorTest {

  @Test
  void compare() {

    Comparator<Person> comparator = (p1, p2) -> p1.firstName.compareTo(p2.firstName);

    Person p1 = new Person("Peter", "Parker");
    Person p2 = new Person("Bruce", "Wayne");

    assertThat(comparator.compare(p1, p2)).isPositive();
  }
}
