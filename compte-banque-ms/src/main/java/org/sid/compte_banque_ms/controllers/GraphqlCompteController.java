package org.sid.compte_banque_ms.controllers;

import java.util.List;

import org.sid.compte_banque_ms.dto.CompteRequestDTO;
import org.sid.compte_banque_ms.dto.CompteResponseDTO;
import org.sid.compte_banque_ms.entities.Compte;
import org.sid.compte_banque_ms.repositories.CompteRepository;
import org.sid.compte_banque_ms.services.CompteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class GraphqlCompteController {
	
	@Autowired
	private CompteRepository compteRepository;
	@Autowired
	private CompteService compteService;
	
	@QueryMapping
	public List<Compte> compteList(){
		return compteRepository.findAll();
	}
	
	@QueryMapping
	public Compte findCompteById(@Argument String id) {
		return compteRepository.findById(id)
				.orElseThrow(()-> new RuntimeException(String.format("Account %s not found", id)));
	}
	
	@MutationMapping
	public CompteResponseDTO ajoutCompte(@Argument CompteRequestDTO compte) {
		return compteService.ajoutCompte(compte);
	}

}
