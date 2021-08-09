package de.claudioaltamura.java.java8;

import java.util.HashMap;
import java.util.Map;

public class CountryFood {

  private CountryFood() {}

  public static Map<String, String> food() {
    final Map<String, String> food = new HashMap<>();
    food.put("Italy", "Pizza");
    food.put("Spain", "Paella");
    return food;
  }
}
