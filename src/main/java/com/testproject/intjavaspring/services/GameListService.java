package com.testproject.intjavaspring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.testproject.intjavaspring.dto.GameListDTO;
import com.testproject.intjavaspring.entities.GameList;
import com.testproject.intjavaspring.repositories.GameListRepository;

@Service //registra GameService como um componente do sistema
public class GameListService {
    
    @Autowired
    private GameListRepository gameListRepository;


    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();
    }
}
