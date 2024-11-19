package com.sylviavitoria.game.services;

import com.sylviavitoria.game.dto.GameMinDTO;
import com.sylviavitoria.game.entities.Game;
import com.sylviavitoria.game.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll(){
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();

    }
}
