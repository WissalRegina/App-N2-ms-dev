package org.sid.compte_banque_ms.controllers;

import java.util.List;
import java.util.UUID;

import org.sid.compte_banque_ms.dto.CompteRequestDTO;
import org.sid.compte_banque_ms.dto.CompteResponseDTO;
import org.sid.compte_banque_ms.entities.Compte;
import org.sid.compte_banque_ms.repositories.CompteRepository;
import org.sid.compte_banque_ms.services.CompteService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompteController {
	private CompteRepository compteRepository;
	private CompteService compteService;
	
	public CompteController(CompteRepository compteRepository,CompteService compteService) {
		this.compteRepository=compteRepository;
		this.compteService=compteService;
	}
	
	@GetMapping("/comptes")
	public List<Compte> comptes(){
		return compteRepository.findAll();
	}
	
	@GetMapping("/compte/{id}")
	public Compte getComtpeById(@PathVariable String id) {
		return compteRepository.findById(id)
				.orElseThrow(()-> new RuntimeException(String.format("compte %s not found", id)));
	}
	/*
	@PostMapping("/comptes")
	public Compte save(@RequestBody Compte compte) {
		if(compte.getId()== null) compte.setId(UUID.randomUUID().toString());
		return compteRepository.save(compte);
	}*/
	@PostMapping("/comptes")
	public CompteResponseDTO save(@RequestBody CompteRequestDTO compte) {
		
		return compteService.ajoutCompte(compte);
	}
	
	
	@PutMapping("/comptes/{id}")
	public Compte update(@PathVariable String id,@RequestBody Compte compteBancaire) {
		Compte compte = compteRepository.findById(id).orElseThrow();
		if(compteBancaire.getBalance()!=null) compte.setBalance(compteBancaire.getBalance());
		if(compteBancaire.getCreatedAT() != null )compte.setCreatedAT(compteBancaire.getCreatedAT());
		if(compteBancaire.getCurrency()!=null)compte.setCurrency(compteBancaire.getCurrency());
		if(compteBancaire.getTypeCompte() != null) compte.setTypeCompte(compteBancaire.getTypeCompte());
		return compteRepository.save(compte);
	}
	
	@DeleteMapping("/comptes/{id}")
	public void deleteCompte(@PathVariable String id) {
		compteRepository.deleteById(id);
	}

}
