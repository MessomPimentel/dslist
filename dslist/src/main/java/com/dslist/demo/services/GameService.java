package com.dslist.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dslist.demo.dto.GameMinDTO;
import com.dslist.demo.entities.Game;
import com.dslist.demo.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	public List<GameMinDTO> findAll() {
	     List<Game> result = gameRepository.findAll();
	     List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		 return dto;
		
	}

}
