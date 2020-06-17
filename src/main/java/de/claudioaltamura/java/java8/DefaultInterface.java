package de.claudioaltamura.java.java8;

public interface DefaultInterface {

  default double sqrt(int a) {
    return Math.sqrt(a);
  }
}
