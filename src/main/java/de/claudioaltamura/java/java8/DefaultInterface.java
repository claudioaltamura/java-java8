package de.claudioaltamura.java.java8;

interface DefaultInterface {

  default double sqrt(int a) {
    return Math.sqrt(a);
  }
}
