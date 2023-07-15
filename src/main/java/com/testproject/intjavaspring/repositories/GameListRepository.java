package com.testproject.intjavaspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testproject.intjavaspring.entities.GameList;

// Componente da camada de acesso a dados
public interface GameListRepository extends JpaRepository<GameList, Long> {

}


