package com.devsupervisor.dslist.services;
import java.util.List;



import com.devsupervisor.dslist.dto.GameListDTO;


import com.devsupervisor.dslist.entities.GameList;
import com.devsupervisor.dslist.projections.GameMinProjection;
import com.devsupervisor.dslist.repositories.GameListRepository;
import com.devsupervisor.dslist.repositories.GameRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class GameListService {

	//movimentar objeto na lista
	@Autowired
	
private GameRepository gameRepository;

	//Alimentando a Lista
	@Autowired
	
	private GameListRepository gameListRepository;
	
	@Transactional(readOnly = true)
	
	public List< GameListDTO > findAll()
	{
		List<GameList> result = gameListRepository.findAll();
		return result.stream().map(x -> new GameListDTO(x)).toList();

	}
	//movimentar a posicao do objeto na lista
	
	@Transactional
	public void mov(Long listId, int sourceIndex, int destinationIndex) {
		List<GameMinProjection> list = gameRepository.searchByList(listId);
		GameMinProjection obj = list.remove(sourceIndex);
		list.add(destinationIndex, obj);
		
		int min = sourceIndex < destinationIndex ? sourceIndex : destinationIndex;
		int max = sourceIndex < destinationIndex ?destinationIndex : sourceIndex;
	for (int i = min; i <= max; i++) {
		
		gameListRepository.updateBelongingPosition(listId, list.get(i).getId(), i);
	
		
	}
	
	}
	
}
