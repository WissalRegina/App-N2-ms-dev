package org.sid.compte_banque_ms.entities;

import java.util.Date;

import org.sid.compte_banque_ms.enums.TypeCompte;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
@Builder
public class Compte {
	@Id
	private String id;
	private Date createdAT;
	private Double balance;
	private String currency;
	@Enumerated(EnumType.STRING)
	private TypeCompte typeCompte;

}
