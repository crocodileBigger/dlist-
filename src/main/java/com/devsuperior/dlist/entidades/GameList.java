package com.devsuperior.dlist.entidades;

import java.util.Objects;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;

@Entity
@Table(name = "tb_game_list")
public class GameList {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;

  public GameList() {
  }

  public GameList(Long id, String name) {
    this.id = id;
    this.name = name;
  }

  // metodo set
  public void setId(Long id) {
    this.id = id;
  }

  public void setNome(String name) {
    this.name = name;
  }

  // metodo get
  public Long getId() {
    return id;
  }

  public String getNome() {
    return name;
  }

  // metod hashcode
  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  // metodos equils
  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    GameList other = (GameList) obj;
    return Objects.equals(id, other.id);
  }
}
