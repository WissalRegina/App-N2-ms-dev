package org.sid.compte_banque_ms.services;

import java.util.Date;
import java.util.UUID;

import org.sid.compte_banque_ms.dto.CompteRequestDTO;
import org.sid.compte_banque_ms.dto.CompteResponseDTO;
import org.sid.compte_banque_ms.entities.Compte;
import org.sid.compte_banque_ms.mappers.CompteMapper;
import org.sid.compte_banque_ms.repositories.CompteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CompteServiceImpl implements CompteService{
	@Autowired
	private CompteRepository compteRepository;
	@Autowired
	private CompteMapper compteMapper;

	@Override
	public CompteResponseDTO ajoutCompte(CompteRequestDTO compteDTO) {
		Compte compte = compteMapper.toCompte(compteDTO);
		Compte savedCompte = compteRepository.save(compte);
		CompteResponseDTO compteResponseDTO = compteMapper.fromCompte(savedCompte);
		return compteResponseDTO;
	}

}
