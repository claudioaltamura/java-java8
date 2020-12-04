package de.claudioaltamura.java.java8;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Test;

class StreamsCollectTest {

  @Test
  void list() {
    List<String> languagesWithJ =
        LanguageCollection.getLanguageCollection().stream()
            .filter(s -> s.startsWith("J"))
            .collect(Collectors.toList());

    assertThat(languagesWithJ).contains("Java", "JavaScript");
  }

  @Test
  void set() {
    Set<String> languagesWithC =
        LanguageCollection.getLanguageCollection().stream()
            .filter(s -> s.startsWith("C"))
            .collect(Collectors.toSet());

    assertThat(languagesWithC).contains("C++", "C");
  }

  @Test
  void map() {
    Map<String, Integer> languageLength =
        LanguageCollection.getLanguageCollection().stream()
            .collect(Collectors.toMap(Function.identity(), String::length));

    assertThat(languageLength).containsKey("Java");
    assertThat(languageLength.get("Java")).isEqualTo(4);
  }

  @Test
  void collection() {
    List<String> languagesWithLengthTwo =
        LanguageCollection.getLanguageCollection().stream()
            .filter(s -> s.length() == 2)
            .collect(Collectors.toCollection(ArrayList::new));

    assertThat(languagesWithLengthTwo).hasSize(1).contains("Go");
  }

  @Test
  void sorted() {
    AnimalCollection animalCollection = new AnimalCollection();

    List<String> sortedAnimals =
        animalCollection.animals().stream().sorted().collect(Collectors.toList());

    assertThat(sortedAnimals).isSortedAccordingTo(Comparator.naturalOrder());
  }
}
