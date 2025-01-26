package com.devsuperior.dlist.services;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import com.devsuperior.dlist.dto.GameListDTO;
import com.devsuperior.dlist.repositorio.GameListRepository;
import com.devsuperior.dlist.entidades.GameList;

@Service
public class GameListService {

  @Autowired
  private GameListRepository gameListRepository;

  @Transactional(readOnly = true)
  public List<GameListDTO> findAll() {
    List<GameList> result = gameListRepository.findAll();
    return result.stream().map(x -> new GameListDTO(x)).toList();
  }
}
