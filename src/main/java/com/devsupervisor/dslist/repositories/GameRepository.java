package com.devsupervisor.dslist.repositories;


import org.springframework.data.jpa.repository.JpaRepository;


import com.devsupervisor.dslist.entities.Game;

public interface GameRepository extends JpaRepository< Game, Long >{

	

	
}
