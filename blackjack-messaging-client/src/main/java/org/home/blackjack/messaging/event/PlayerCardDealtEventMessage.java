package org.home.blackjack.messaging.event;

import org.home.blackjack.messaging.common.Message;


public class PlayerCardDealtEventMessage extends Message {

	public final CardDTOMessage card;
	public final String tableID;
	public final String gameID;
	public final String actingPlayer;
	public final int sequenceNumber;

	public PlayerCardDealtEventMessage(String gameID, String tableID, String playerId, CardDTOMessage card, int sequenceNumber) {
        this.gameID = gameID;
        this.tableID = tableID;
        this.actingPlayer = playerId;
        this.card = card;
        this.sequenceNumber = sequenceNumber;
	}

}
