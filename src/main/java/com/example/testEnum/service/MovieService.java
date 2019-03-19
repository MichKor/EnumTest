package com.example.testEnum.service;

import java.util.HashMap;

public class MovieService {

  HashMap<Integer, String> movies = new HashMap<>();

  @MovieInterface
  public void addMovie() {
    System.out.println("Movie added");
  }

  public void applyMovie() {
    movies.put(1, "Avengers");
    movies.put(2, "Avengers2");
    movies.put(3, "Avengers3");
    movies.put(1, "Thor");
    for (String s: movies.values()) {
      System.out.println(s);
    }
  }
}
