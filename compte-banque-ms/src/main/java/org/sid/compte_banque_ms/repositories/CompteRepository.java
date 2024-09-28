package org.sid.compte_banque_ms.repositories;

import org.sid.compte_banque_ms.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


/*@RepositoryRestResource*/

public interface CompteRepository extends JpaRepository<Compte, String>{

}
