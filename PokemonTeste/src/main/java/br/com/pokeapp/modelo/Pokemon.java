package br.com.pokeapp.modelo;

import java.util.List;

public class Pokemon {
	private String nomePokemon;
	private List<String> habilidades;

	public String getNomePokemon() {
		return nomePokemon;
	}
	
	public void setNomePokemon(String nomePokemon) {
		this.nomePokemon = nomePokemon;
	}
	
	public List<String> getHabilidades() {
		return habilidades;
	}
	
	public void setHabilidades(List<String> habilidades) {
		this.habilidades = habilidades;
	}
	
	
}
