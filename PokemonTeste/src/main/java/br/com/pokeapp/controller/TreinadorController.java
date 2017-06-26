package br.com.pokeapp.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.pokeapp.modelo.Treinador;

@Controller
public class TreinadorController {
	
	@Autowired	
	public TreinadorController() {
		super();
		// TODO Auto-generated constructor stub
	}

	// Acessa a login do treinador
	@RequestMapping("/index")
	public String login(){
		return "index";
	}
	
	@RequestMapping("/loginTreinador")
	public String loginTreinador(Treinador treinador, HttpSession session){
		if(treinador.getNome() != null && treinador.getSenha() != null){
			session.setAttribute("treinador", treinador);
			return "pagTreinador";
		}
		return "index";
	}
	
	@RequestMapping("/logout")
	public String logout(HttpSession session){
		session.invalidate();
		return "index";
	}
	

}// class
