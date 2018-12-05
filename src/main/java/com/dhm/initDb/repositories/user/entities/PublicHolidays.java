package com.dhm.initDb.repositories.user.entities;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Objects;

@Document
public class PublicHolidays {
  private String id;
  private String jour;
  private String mois;


  public PublicHolidays(String id, String jour, String mois) {
    this.id = id;
    this.jour = jour;
    this.mois = mois;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getJour() {
    return jour;
  }

  public void setJour(String jour) {
    this.jour = jour;
  }

  public String getMois() {
    return mois;
  }

  public void setMois(String mois) {
    this.mois = mois;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PublicHolidays that = (PublicHolidays) o;
    return Objects.equals(id, that.id) &&
      Objects.equals(jour, that.jour) &&
      Objects.equals(mois, that.mois);
  }

  @Override
  public int hashCode() {

    return Objects.hash(id, jour, mois);
  }

  @Override
  public String toString() {
    return "PublicHolidays{" +
      "id='" + id + '\'' +
      ", jour='" + jour + '\'' +
      ", mois='" + mois + '\'' +
      '}';
  }
}
