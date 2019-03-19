package com.example.testEnum.model;

import javax.persistence.*;

@Entity
public class Movie {

  @Id
  @GeneratedValue
  private int id;
  private String director;
  private String title;
  private int year;

  @Enumerated(EnumType.STRING)
  private Rating rating;

  public Movie() {

  }

  public Movie(String director, String title, int year, Rating rating) {
    this.director = director;
    this.title = title;
    this.year = year;
    this.rating = rating;
  }

  public Movie(String director, String title) {
    this.director = director;
    this.title = title;
  }

  public int getId() {
    return id;
  }

  public String getDirector() {
    return director;
  }

  public String getTitle() {
    return title;
  }

  public int getYear() {
    return year;
  }

  public Rating getRating() {
    return rating;
  }
}
