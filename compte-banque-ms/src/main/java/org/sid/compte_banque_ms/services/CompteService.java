package org.sid.compte_banque_ms.services;

import org.sid.compte_banque_ms.dto.CompteRequestDTO;
import org.sid.compte_banque_ms.dto.CompteResponseDTO;

public interface CompteService {
	public CompteResponseDTO ajoutCompte(CompteRequestDTO compteDTO);

}
