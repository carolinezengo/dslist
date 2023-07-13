package com.devsupervisor.dslist.services;
import java.util.List;

import com.devsupervisor.dslist.dto.GameminDTO;
import com.devsupervisor.dslist.entities.Game;
import com.devsupervisor.dslist.repositories.GameRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class GameService {
	
	@Autowired
	
private GameRepository gameRepository;
	
	public List< GameminDTO > findAll()
	{
		List<Game> result = gameRepository.findAll();
		List< GameminDTO > dto = result.stream().map(x -> new GameminDTO(x)).toList();
		
	return dto;
	
	}
	
}
