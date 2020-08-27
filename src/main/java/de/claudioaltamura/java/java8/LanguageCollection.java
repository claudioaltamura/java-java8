package de.claudioaltamura.java.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LanguageCollection {

  private static final List<String> languages =
      Arrays.asList("Java", "C", "C++", "Go", "JavaScript", "Python", "Scala");

  public static List<String> getLanguageCollection() {
    return Collections.unmodifiableList(languages);
  }
}
