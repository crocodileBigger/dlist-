package com.devsuperior.dlist.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import com.devsuperior.dlist.entidades.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
