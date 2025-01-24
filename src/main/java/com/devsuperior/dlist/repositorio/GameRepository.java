package com.devsuperior.dlist.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import com.devsuperior.dlist.entidades.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
