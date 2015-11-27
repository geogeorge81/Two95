package com.Two95.projects.DeckOfCards;

public class Card implements IntCard {
	 private final int suit; 
	 private final int value;

     public Card(int theValue, int theSuit) {
        if (theSuit != SPADES && theSuit != HEARTS && theSuit != DIAMONDS && 
                theSuit != CLUBS)
            throw new IllegalArgumentException("Illegal playing card suit");
        if (theValue < 1 || theValue > 13)
            throw new IllegalArgumentException("Illegal playing card value");
        value = theValue;
        suit = theSuit;
    }

    public int getSuit() {
        return suit;
    }

    public int getValue() {
        return value;
    }

    public String getSuitAsString() {
        switch ( suit ) {
        case SPADES:   return "Spades";
        case HEARTS:   return "Hearts";
        case DIAMONDS: return "Diamonds";
        default:    return "Clubs";
        }
    }

    public String getValueAsString() {
        switch ( value ) {
            case 1:   return "Ace";
            case 2:   return "2";
            case 3:   return "3";
            case 4:   return "4";
            case 5:   return "5";
            case 6:   return "6";
            case 7:   return "7";
            case 8:   return "8";
            case 9:   return "9";
            case 10:  return "10";
            case 11:  return "Jack";
            case 12:  return "Queen";
            default:  return "King";
            }
        }
  
     public String toString() {
        return getValueAsString() + " of " + getSuitAsString();
    }


}