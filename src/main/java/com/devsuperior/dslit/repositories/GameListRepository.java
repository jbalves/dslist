package com.devsuperior.dslit.repositories;

import com.devsuperior.dslit.entities.Game;
import com.devsuperior.dslit.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList,Long> {
}
