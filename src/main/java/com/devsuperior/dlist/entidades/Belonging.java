package com.devsuperior.dlist.entidades;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Objects;

@Entity
@Table(name = "tb_belonging")
public class Belonging {

  @EmbeddedId
  private BelongingPK id = new BelongingPK();

  private Integer position;

  public Belonging() {
  }

  public Belonging(Game game, GameList gameList, Integer position) {
    id.setGame(game);
    id.setGameList(gameList);

    this.position = position;
  }

  // metodos set
  public void setId(BelongingPK id) {
    this.id = id;
  }

  public void Id(Integer position) {
    this.position = position;
  }

  // metodos get
  public BelongingPK getId() {
    return id;
  }

  public Integer getPosition() {
    return position;
  }

  // metodos hashcode
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
    Belonging other = (Belonging) obj;
    return Objects.equals(id, other.id);
  }
}
