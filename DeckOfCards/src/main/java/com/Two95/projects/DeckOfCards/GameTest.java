package com.Two95.projects.DeckOfCards;

public class GameTest {

	public static void main(String[] args) {
		Deck deck = new Deck();
		Hand[] player;
		
		int handPosition=1;
		player = new Hand[4];
		
		for (int i = 0; i < 3; i++) {
			deck.shuffle();
		}
		
		try
		{
			while(true){
				for(int x=1;x<=4;x++){
					player[x].addCard(deck.dealCard());
					System.out.println(player[x].getCard(handPosition));
				}
				handPosition++;
			}				
		}
		catch (Exception e){
			System.out.println(e);
		}
		
/*		for(int x=1;x<=4;x++){
			int handPosition=player[x].getCardCount();
			while(handPosition>0){
				System.out.println(player[x].getCard(handPosition));
				handPosition--;
			}
		}*/
    }
}
	

