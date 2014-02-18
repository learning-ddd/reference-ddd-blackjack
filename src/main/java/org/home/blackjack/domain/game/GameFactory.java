package org.home.blackjack.domain.game;

import javax.inject.Inject;

import org.home.blackjack.domain.game.core.GameID;
import org.home.blackjack.domain.shared.PlayerID;
import org.home.blackjack.util.ddd.pattern.EventPublisher;

public class GameFactory {

	@Inject
	private EventPublisher eventBus;

	@Inject
	private DeckFactory deckFactory;

	public Game createNewGame(PlayerID dealer, PlayerID player) {

		return new Game(new GameID(), dealer, player, deckFactory, eventBus);
	}

}
