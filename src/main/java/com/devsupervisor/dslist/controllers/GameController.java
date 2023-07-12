package com.devsupervisor.dslist.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsupervisor.dslist.entities.Game;
import com.devsupervisor.dslist.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {
	
	@Autowired
	private GameService gameService;
	@GetMapping
	public List<Game> findAll(){
		List<Game> result = gameService.finAll();
		return result;
		
		
	}

	
}
