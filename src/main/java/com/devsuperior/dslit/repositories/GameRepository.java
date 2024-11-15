package com.devsuperior.dslit.repositories;

import com.devsuperior.dslit.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game,Long> {
}
