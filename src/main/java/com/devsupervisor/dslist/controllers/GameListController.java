package com.devsupervisor.dslist.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.devsupervisor.dslist.dto.GameListDTO;
import com.devsupervisor.dslist.services.GameListService;


@RestController
@RequestMapping(value = "/lists")
public class GameListController {
	
	@Autowired
	private GameListService gameService;
	@GetMapping
	public List< GameListDTO > findAll(){
		List< GameListDTO > result = gameService.findAll();
		return result;
	}
	
	}


