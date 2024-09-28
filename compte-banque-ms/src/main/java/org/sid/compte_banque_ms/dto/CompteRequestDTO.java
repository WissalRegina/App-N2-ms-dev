package org.sid.compte_banque_ms.dto;

import org.sid.compte_banque_ms.enums.TypeCompte;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class CompteRequestDTO {
	private Double balance;
	private String currency;
	private TypeCompte typeCompte;

}
