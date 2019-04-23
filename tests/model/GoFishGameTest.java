package model;

import java.io.File;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Random;

public class GoFishGameTest {

	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<>();
		names.add("test1");
		names.add("test2");
		
		ArrayList<Socket> socks = new ArrayList<>();
		socks.add(new Socket());
		socks.add(new Socket());

		GoFishGame testGame = new GoFishGame(2, names, socks, new File("res\\cardlist.txt"));
		
		testGame.shuffleCards();
		testGame.dealCards();
		
		System.out.println(testGame.cardDeck.numOfCards);
		System.out.println(testGame.pile.numOfCards);
		System.out.println(testGame.players[0].getCardListForUTF());
		System.out.println(testGame.players[1].getCardListForUTF());
		
		int playerTurn = 0;
		
		for(int i = 0; i < 20; i++) {
			System.out.println("\n\nTurn " + i + ":");
			int randomCard = new Random().nextInt(testGame.players[playerTurn].getNumOfCards());
			String randomValue = testGame.players[playerTurn].getActiveCards().get(randomCard).getVal();
					
			boolean contains = testGame.queryPlayer(randomValue, testGame.players[playerTurn], testGame.players[1 - playerTurn]);
			System.out.println("player " + ((1 - playerTurn) + 1) + " contains " + randomValue + ": " + contains);

			System.out.println(testGame.players[0].getCardListForUTF());
			System.out.println(testGame.players[1].getCardListForUTF());
			
			if(!contains) playerTurn = 1 - playerTurn;
		}

	}

}
