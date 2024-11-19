package com.sylviavitoria.game.repositories;

import com.sylviavitoria.game.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}
