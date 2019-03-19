package com.example.testEnum.model;

import javax.persistence.Entity;

@Entity
public class MovieMagazine extends Movie {

  private String magazine;
  private int month;

  public MovieMagazine(String director, String title, String magazine, int month) {
    super(director, title);
    this.magazine = magazine;
    this.month = month;
  }

  public String getMagazine() {
    return magazine;
  }

  public int getMonth() {
    return month;
  }
}
