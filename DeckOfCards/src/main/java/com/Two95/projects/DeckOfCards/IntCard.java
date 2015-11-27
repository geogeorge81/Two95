package com.Two95.projects.DeckOfCards;

public interface IntCard {
	//Static variables for suits
    public final static int SPADES = 0;
    public final static int HEARTS = 1;
    public final static int DIAMONDS = 2;
    public final static int CLUBS = 3;
    
    //static variables for face cards
    public final static int ACE = 1;
    public final static int JACK = 11;
    public final static int QUEEN = 12;
    public final static int KING = 13;

    public int getSuit();
    
    public int getValue();
    
    public String getSuitAsString();
    
    public String getValueAsString();
    
    public String toString();
}
