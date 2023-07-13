package com.devsupervisor.dslist.controllers;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsupervisor.dslist.dto.GameminDTO;

import com.devsupervisor.dslist.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {
	
	@Autowired
	private GameService gameService;
	@GetMapping
	public List< GameminDTO > findAll(){
		List< GameminDTO > result = gameService.findAll();
		return result;
		
		
	}

	
}
