package com.devsupervisor.dslist.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.devsupervisor.dslist.dto.GameListDTO;
import com.devsupervisor.dslist.dto.GameminDTO;
import com.devsupervisor.dslist.services.GameListService;
import com.devsupervisor.dslist.services.GameService;


@RestController
@RequestMapping(value = "/lists")
public class GameListController {
	
	@Autowired
	private GameListService gameListService;
	
	@Autowired
	private GameService gameService;
	
	@GetMapping
	public List< GameListDTO > findAll(){
		List< GameListDTO > result = gameListService.findAll();
		return result;
	}
		@GetMapping(value = "/{listId}/games")
		
		public List< GameminDTO > findByList(@PathVariable Long listId) 
		{
			List< GameminDTO > result = gameService.findByList(listId);
			return result;
		}
	}
	
	


