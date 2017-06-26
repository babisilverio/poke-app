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

public class AbilityRestClient {
	public List<String> listaHabilidades(){
		List<String> habilidades = new ArrayList<>();
		
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("https://pokeapi.co/api/v2/ability/?limit=50");
		
		Response response = target.request().get();
		String json = response.readEntity(String.class);
		
		try {
			JSONParser parser = new JSONParser();
			JSONObject object = (JSONObject) parser.parse(json);
			JSONArray array = (JSONArray) object.get("results");
			
			for (int i = 0; i < 50; i++) {
				JSONObject ability = (JSONObject) array.get(i);
				String habilidade = ability.get("name").toString();
				habilidades.add(habilidade);
			}
			return habilidades;
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
	}
}
