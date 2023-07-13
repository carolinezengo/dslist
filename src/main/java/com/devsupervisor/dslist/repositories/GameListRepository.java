package com.devsupervisor.dslist.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.devsupervisor.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository< GameList, Long >{

	

	
}
