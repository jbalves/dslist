package com.devsuperior.dslit.controllers;

import com.devsuperior.dslit.dto.GameDTO;
import com.devsuperior.dslit.dto.GameListDTO;
import com.devsuperior.dslit.dto.GameMinDTO;
import com.devsuperior.dslit.services.GameListService;
import com.devsuperior.dslit.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {
    @Autowired
    private GameListService gameListService;

    @GetMapping
    public List<GameListDTO> findAll(){
        List<GameListDTO> result = gameListService.findAll();
        return result;
    }
}
