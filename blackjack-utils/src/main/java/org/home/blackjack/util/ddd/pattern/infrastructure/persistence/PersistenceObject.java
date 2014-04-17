package org.home.blackjack.util.ddd.pattern.infrastructure.persistence;

import org.home.blackjack.util.ddd.pattern.domain.Domain;

public interface PersistenceObject<DOMAIN extends Domain> {
	
	PersistenceObjectId id();
	
	

}
