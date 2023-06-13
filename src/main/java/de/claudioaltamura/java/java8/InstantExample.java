package de.claudioaltamura.java.java8;

import java.time.Instant;

class InstantExample {

    private InstantExample(){}

    static Instant now() {
        return Instant.now();
    }

    static Instant dayOne() {
        return Instant.parse("1970-01-01T23:20:08.489Z");
    }
}
