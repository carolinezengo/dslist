package com.devsupervisor.dslist.services;
import java.util.List;

import com.devsupervisor.dslist.dto.GameDTO;
import com.devsupervisor.dslist.dto.GameminDTO;
import com.devsupervisor.dslist.entities.Game;
import com.devsupervisor.dslist.projections.GameMinProjection;
import com.devsupervisor.dslist.repositories.GameRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class GameService {
	
	@Autowired
	
private GameRepository gameRepository;
	
	@Transactional(readOnly = true)
	
	public GameDTO findById(Long id) {
		Game result = gameRepository.findById(id).get();
		GameDTO dto = new GameDTO(result);
		return dto;
}
	@Transactional(readOnly = true)
	
	public List< GameminDTO > findAll()
	{
		List<Game> result = gameRepository.findAll();
		List< GameminDTO > dto = result.stream().map(x -> new GameminDTO(x)).toList();
		
	return dto;
	}
	
	@Transactional(readOnly = true)
	
	public List<GameminDTO> findByList(Long listId) 
	{
		List<GameMinProjection> result = gameRepository.searchByList(listId);
		return result.stream().map(x -> new GameminDTO(x)).toList();

	
	}
	
}
