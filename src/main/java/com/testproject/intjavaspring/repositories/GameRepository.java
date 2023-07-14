package com.testproject.intjavaspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testproject.intjavaspring.entities.Game;

// Componente da camada de acesso a dados
public interface GameRepository extends JpaRepository<Game, Long> {
    
}
