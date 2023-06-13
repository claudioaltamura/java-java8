package de.claudioaltamura.java.java8;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;

class LocalDateExample {

  private LocalDateExample() {}

  static LocalDate of() {
    return LocalDate.of(1970, Month.JANUARY, 1);
  }

  static LocalDate now() {
    return LocalDate.now(ZoneId.of("Europe/Berlin"));
  }
}
