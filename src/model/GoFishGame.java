package model;

import java.io.File;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;

public class GoFishGame extends CardGame
{
	public GoFishGame(int numOfPlayers, ArrayList<String> playerNames, ArrayList<Socket> clientSocks, File cardList) {
		super(numOfPlayers, playerNames, clientSocks, cardList);
		// TODO Auto-generated constructor stub
	}

	public boolean isLegalMove(Player focusPlayer, String move) {
		// TODO
		return false;
	}
	
	public boolean queryPlayer(Card card, Player source, Player target) {
		// TODO
		return false;
	}
	
	public String determineWinner(PlayerQueue playerList) {
		Iterator<Player> playerIter = playerList.iterator();
		// TODO
		return "";
	}

	public String getAmtCardsPerAHand() {
		// TODO Auto-generated method stub
		return " ";
	}

	public String getPairsPerHand() {
		// TODO Auto-generated method stub
		return " ";
	}

	public int getAmtCardInDrawPile() {
		// TODO Auto-generated method stub
		return 52;
	}
}