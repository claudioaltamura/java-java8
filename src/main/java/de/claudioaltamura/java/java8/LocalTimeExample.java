package de.claudioaltamura.java.java8;

import java.time.LocalTime;
import java.time.ZoneId;

class LocalTimeExample {

    private LocalTimeExample(){}

    static LocalTime of() {
        return LocalTime.of(10, 10);
    }

    static LocalTime now() {
        return LocalTime.now(ZoneId.of("Europe/Berlin"));
    }

}