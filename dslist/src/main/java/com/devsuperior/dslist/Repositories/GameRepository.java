package com.devsuperior.dslist.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslist.Entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

    
}