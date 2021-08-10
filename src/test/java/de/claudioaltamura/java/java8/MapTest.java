package de.claudioaltamura.java.java8;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.UUID;
import java.util.function.Function;
import org.junit.jupiter.api.Test;

class MapTest {

  @Test
  void putIfAbsent() {
    //		V v = map.get(key);
    //		if (v == null)
    //			v = map.put(key, value);

    assertThat(CountryFood.food().putIfAbsent("Italy", "Pizza")).isEqualTo("Pizza");

    assertThat(CountryFood.food().putIfAbsent("Belgian", " Pommes frites")).isNull();
  }

  @Test
  void computeIfAbsent() {
    Function<? super String, String> wurstFunction = wurst -> wurst + "-" + UUID.randomUUID();
    assertThat(CountryFood.food().computeIfAbsent("wiener", wurstFunction))
        .isNotNull()
        .startsWith("wiener");
  }
}
