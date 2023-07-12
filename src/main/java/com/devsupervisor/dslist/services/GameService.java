package com.devsupervisor.dslist.services;
import java.util.List;

import com.devsupervisor.dslist.entities.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.devsupervisor.dslist.repositories.GameRepsository;

@Service
public class GameService {
	
	@Autowired
	
private GameRepsository gameRepository;
	
	public List<Game> findAll()
	{
		List<Game> result = gameRepository.findAll();
	return result;
	
	}
	
}
