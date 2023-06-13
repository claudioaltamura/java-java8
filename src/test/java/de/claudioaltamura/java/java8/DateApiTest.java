package de.claudioaltamura.java.java8;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import org.junit.jupiter.api.Test;

class DateApiTest {

  @Test
  void getYear() {
    final LocalDateTime today = LocalDateTime.of(2000, Month.JANUARY, 1, 10, 10, 30);

    assertThat(today.getYear()).isEqualTo(2000);
  }

  @Test
  void getDiff() {
    final Period diff =
        Period.between(LocalDate.parse("2016-08-31"), LocalDate.parse("2016-11-30").plusDays(1));

    assertThat(diff.getMonths()).isEqualTo(3);
  }
}
