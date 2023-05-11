package com.devsuperior.dslist.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.devsuperior.dslist.DTO.GameMinDTO;
import com.devsuperior.dslist.Entities.Game;
import com.devsuperior.dslist.Repositories.GameRepository;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findList(){
        List<Game> result = gameRepository.findAll();
        List<GameMinDTO> dtos = result.stream().map(arg0 -> new GameMinDTO(arg0)).toList();
        return dtos;
    }


}
