package org.sid.compte_banque_ms;

import java.util.Date;
import java.util.UUID;

import org.sid.compte_banque_ms.entities.Compte;
import org.sid.compte_banque_ms.enums.TypeCompte;
import org.sid.compte_banque_ms.repositories.CompteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CompteBanqueMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CompteBanqueMsApplication.class, args);
	}
	
	@Bean
	CommandLineRunner start(CompteRepository compteRepository) {
		return args -> {
			for (int i = 0 ;i<10;i++) {
				Compte compte = Compte.builder()
						.id(UUID.randomUUID().toString())
						.typeCompte(Math.random()> 0.5? TypeCompte.CURRENT_COMPTE:TypeCompte.SAVING_COMPTE)
						.balance(10000+Math.random()*900000)
						.createdAT(new Date())
						.currency("MAD")
						.build();
				compteRepository.save(compte);
			}
		};
	}

}
