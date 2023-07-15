package com.testproject.intjavaspring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.testproject.intjavaspring.dto.GameDTO;
import com.testproject.intjavaspring.dto.GameMinDTO;
import com.testproject.intjavaspring.entities.Game;
import com.testproject.intjavaspring.repositories.GameRepository;

@Service //registra GameService como um componente do sistema
public class GameService {
    
    @Autowired
    private GameRepository gameRepository;

    
    @Transactional(readOnly = true)
    public GameDTO findById(Long id) {
        Game result = gameRepository.findById(id).get(); //busca pelo banco de dados
        return new GameDTO(result);
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }
}
