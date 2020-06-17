package de.claudioaltamura.java.java8;

@FunctionalInterface
interface Factory<T> {
  T create();
}
