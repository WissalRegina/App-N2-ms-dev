package org.sid.compte_banque_ms.mappers;

import java.util.Date;
import java.util.UUID;

import org.sid.compte_banque_ms.dto.CompteRequestDTO;
import org.sid.compte_banque_ms.dto.CompteResponseDTO;
import org.sid.compte_banque_ms.entities.Compte;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class CompteMapper {
	
	public Compte toCompte(CompteRequestDTO compteDTO) {
		Compte compte = Compte.builder()
				.id(UUID.randomUUID().toString())
				.createdAT(new Date())
				.balance(compteDTO.getBalance())
				.currency(compteDTO.getCurrency())
				.typeCompte(compteDTO.getTypeCompte())
				.build();
		return compte;
	}
	
	public CompteResponseDTO fromCompte(Compte compte) {
		CompteResponseDTO responseDTO = new CompteResponseDTO();
		BeanUtils.copyProperties(compte, responseDTO);
		return responseDTO;
	}
	
	

}
