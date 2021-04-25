package de.claudioaltamura.java.java8;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

class LambdaExpressionTest {

  @Test
  void test() {
    List<String> names = Arrays.asList("Peter", "Angelo", "Lola");

    // Prior to Java 8
    /*
     Collections.sort(names, new Comparator<String>() {
      @Override
      public int compare(String a, String b) {
        return b.compareTo(a);
      }
    });
    */

    // shorter Collections.sort(names, (String a, String b) -> b.compareTo(a));

    names.sort((a, b) -> b.compareTo(a));

    assertThat(names).isSortedAccordingTo((a, b) -> b.compareTo(a));
  }
}
