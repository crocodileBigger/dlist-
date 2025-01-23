package com.devsuperior.dlist.entidades;

import java.util.Objects;
import jakarta.persistence.*;

@Entity
@Table(name = "tb_game")
public class Game {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String title;

  @Column(name = "game_year")
  private Integer year;
  private String genre;
  private String platforms;
  private Double score;
  private String imgUrl;
  private String shortDescription;
  private String longDescription;

  public Game() {
  }

  public Game(Long id, String title, Integer year, String genre, String platforms, Double score, String imgUrl,
      String shortDescription, String longDescription) {
    this.id = id;
    this.title = title;
    this.year = year;
    this.genre = genre;
    this.platforms = platforms;
    this.score = score;
    this.imgUrl = imgUrl;
    this.shortDescription = shortDescription;
    this.longDescription = longDescription;
  }

  // metodo set

  public void setId(Long id) {
    this.id = id;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void setYear(Integer year) {
    this.year = year;
  }

  public void setGenre(String genre) {
    this.genre = genre;
  }

  public void setPlatforms(String platforms) {
    this.platforms = platforms;
  }

  public void setScore(Double score) {
    this.score = score;
  }

  public void setImgUrl(String imgUrl) {
    this.imgUrl = imgUrl;
  }

  public void setShortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
  }

  public void setLongDescription(String longDescription) {
    this.longDescription = longDescription;
  }

  // metodo get

  public Long getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public Integer getYear() {
    return year;
  }

  public String getGenre() {
    return genre;
  }

  public String getPlatforms() {
    return platforms;
  }

  public Double getScore() {
    return score;
  }

  public String getImgUrl() {
    return imgUrl;
  }

  public String getShortDescription() {
    return shortDescription;
  }

  public String longDescription() {
    return longDescription;
  }

  // hash code
  public int hashCode() {
    return Objects.hash(id);
  }

  // equals
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Game other = (Game) obj;
    return Objects.equals(id, other.id);
  }
}
