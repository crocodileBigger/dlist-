package com.devsuperior.dlist.dto;

import com.devsuperior.dlist.entidades.GameList;

public class GameListDTO {

  private Long id;
  private String name;

  // Construtor padrão
  public GameListDTO() {
  }

  // Construtor que aceita uma entidade GameList
  public GameListDTO(GameList entity) {
    this.id = entity.getId();
    this.name = entity.getNome();
  }

  // Métodos getters
  public Long getId() {
    return id;
  }

  public String getName() {
    return name;
  }
}
