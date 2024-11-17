package com.devsuperior.dslit.services;

import com.devsuperior.dslit.dto.GameDTO;
import com.devsuperior.dslit.dto.GameListDTO;
import com.devsuperior.dslit.dto.GameMinDTO;
import com.devsuperior.dslit.entities.Game;
import com.devsuperior.dslit.entities.GameList;
import com.devsuperior.dslit.repositories.GameListRepository;
import com.devsuperior.dslit.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {
    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();
    }
}
