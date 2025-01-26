package com.devsuperior.dlist.services;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import com.devsuperior.dlist.dto.GameDTO;
import com.devsuperior.dlist.dto.GameMinDTO;
import com.devsuperior.dlist.entidades.Game;
import com.devsuperior.dlist.projections.GameMinProjection;
import com.devsuperior.dlist.repositorio.GameRepository;

@Service
public class GameService {

  @Autowired
  private GameRepository gameRepository;

  @Transactional(readOnly = true)
  public GameDTO findById(Long id) {
    Game result = gameRepository.findById(id).orElseThrow(() -> new RuntimeException("Game not found"));
    GameDTO dto = new GameDTO(result);
    return dto;
  }

  @Transactional(readOnly = true)
  public List<GameMinDTO> findAll() {
    List<Game> result = gameRepository.findAll();
    List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
    return dto;
  }

  @Transactional(readOnly = true)
  public List<GameMinDTO> findByList(Long listId) {
    List<GameMinProjection> result = gameRepository.searchByList(listId);
    List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
    return dto;
  }
}
