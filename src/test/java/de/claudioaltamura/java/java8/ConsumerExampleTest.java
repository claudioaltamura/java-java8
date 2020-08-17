package de.claudioaltamura.java.java8;

import java.util.function.Consumer;
import org.junit.jupiter.api.Test;

class ConsumerExampleTest {

  Consumer<Person> greeter = (p) -> System.out.println("Hello " + p.getFirstName());

  @Test
  void testGreeter() {
    greeter.accept(new Person("Peter", "Parker"));
  }
}
