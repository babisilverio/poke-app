package br.com.pokeapp.restclient;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class PokeRestClient {
	public List<String> listaPokemons(){
		List<String> pokemons = new ArrayList<>();
		
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("https://pokeapi.co/api/v2/pokemon/?limit=150");
		
		Response response = target.request().get();
		String json = response.readEntity(String.class);				
		
		try {			
			JSONParser parser = new JSONParser();
			JSONObject object = (JSONObject) parser.parse(json);
			JSONArray array = (JSONArray) object.get("results");
			
			for(int i = 0; i < 150; i++){
				JSONObject pokeEspecie = (JSONObject) array.get(i); 
				String especie = pokeEspecie.get("name").toString();
				pokemons.add(especie);
				System.out.println(especie);				
			}
			return pokemons;
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
	}
	
}
