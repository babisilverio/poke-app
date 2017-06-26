package br.com.pokeapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.pokeapp.restclient.AbilityRestClient;
import br.com.pokeapp.restclient.PokeRestClient;

@Controller
public class PokeController {
	private PokeRestClient pokeClient;
	private AbilityRestClient abilityClient;

	@Autowired
	public PokeController() {
	}
	
	
	
}// class
