package de.claudioaltamura.java.java8;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;

class LocalDateTimeExample {

  private LocalDateTimeExample() {}

  static LocalDateTime of() {
    return LocalDateTime.of(1970, Month.JANUARY, 1, 10, 10, 30);
  }

  static LocalDateTime now() {
    return LocalDateTime.now(ZoneId.of("Europe/Berlin"));
  }
}
