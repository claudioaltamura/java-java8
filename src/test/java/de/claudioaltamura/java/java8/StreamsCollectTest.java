package de.claudioaltamura.java.java8;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;
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

    assertThat(languageLength).containsEntry("Java", 4);
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

  @Test
  void sortedComparator() {
    AnimalCollection animalCollection = new AnimalCollection();

    List<String> sortedAnimals =
        animalCollection.animals().stream()
            .sorted((a, b) -> b.compareTo(a))
            .collect(Collectors.toList());

    assertThat(sortedAnimals).isSortedAccordingTo(Comparator.reverseOrder());
  }

  @Test
  void anyMatch() {
    AnimalCollection animalCollection = new AnimalCollection();

    assertThat(animalCollection.animals().stream().anyMatch(s -> s.startsWith("B"))).isTrue();
  }

  @Test
  void noneMatch() {
    AnimalCollection animalCollection = new AnimalCollection();

    assertThat(animalCollection.animals().stream().noneMatch(s -> s.contains("z"))).isTrue();
  }

  @Test
  void count() {
    AnimalCollection animalCollection = new AnimalCollection();

    assertThat(animalCollection.animals().stream()).size().isEqualTo(3);
  }

  @Test
  void reduce() {
    assertThat(
            LanguageCollection.getLanguageCollection().stream().reduce((s1, s2) -> s1 + "/" + s2))
        .contains("Java/C/C++/Go/JavaScript/Python/Scala");
  }

  @Test
  void wordCount1() {
    Map<String, Long> languagesCount =
        LanguageCollection.getLanguageCollection().stream()
            .collect(groupingBy(Function.identity(), counting()));
    assertThat(languagesCount).containsEntry("Java", 1L);
  }
}
