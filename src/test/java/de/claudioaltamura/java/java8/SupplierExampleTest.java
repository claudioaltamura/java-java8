package de.claudioaltamura.java.java8;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import org.junit.jupiter.api.Test;

class SupplierExampleTest {

  @Test
  void person() {
    Supplier<Person> personSupplier = Person::new;

    assertThat(personSupplier.get()).isNotNull();
  }
  @Test
  void list() {
    Supplier<List<Person>> listSupplier = ArrayList::new;

    assertThat(listSupplier.get()).isNotNull();
  }

}
