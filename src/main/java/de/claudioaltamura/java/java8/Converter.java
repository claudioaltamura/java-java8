package de.claudioaltamura.java.java8;

@FunctionalInterface
interface Converter<F, T> {
  T convert(F from);
}
