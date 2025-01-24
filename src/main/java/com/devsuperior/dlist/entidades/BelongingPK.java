package com.devsuperior.dlist.entidades;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class BelongingPK {

  @ManyToOne
  @JoinColumn(name = "game_id")
  private Game game;

  @ManyToOne
  @JoinColumn(name = "List_id")
  private GameList gameList;

  public BelongingPK() {
  }

  public BelongingPK(Game game, GameList gameList) {
    this.game = game;
    this.gameList = gameList;
  }

  // metodo set
  public void setGame(Game game) {
    this.game = game;
  }

  public void setGameList(GameList gameList) {
    this.gameList = gameList;
  }

  // metodo get
  public Game getGame() {
    return game;
  }

  public GameList getGameList() {
    return gameList;
  }

  public int hashCode() {
    return Objects.hash(game, gameList);
  }

  // metodo equals
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    BelongingPK other = (BelongingPK) obj;
    return Objects.equals(game, other.game) && Objects.equals(gameList, other.gameList);
  }
}
