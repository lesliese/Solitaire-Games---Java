package code;

import java.util.ArrayList;
import java.util.Collections;

/**
 * The instances of this class are the four suits and ranks/numbers that make up a deck of 52 playing cards.
 * We created an instance of ArrayList of type Card, in order to hold all 13 cards of each suit.
 * 
 * @author Carmen Huang
 * @author Anastasia Mangafas
 * @author Leslie Aleluia Sequeira
 * @author Haojiang Luo
 * @author Shenghang Wang
 */

public class Deck {

	public ArrayList<Card> _cards;
	private static final String _spades = "Spades";
	private static final String _hearts = "Hearts";
	private static final String _clubs = "Clubs";
	private static final String _diamonds = "Diamonds";
	
	/**
	 * Instantiated the instance of _cards 
	 * 
	 * This constructor method will add cards of each suit to make a deck.
	 * 
	 */
	public Deck(){
		_cards = new ArrayList<Card>();
		for (int i = 1; i<14;i++){
			Card c = new Card(_spades, i,i,null);
			_cards.add(c);
		}
		for (int i = 1; i<14;i++){
			Card c = new Card(_hearts, i,i,null);
			_cards.add(c);
		}
		for (int i = 1; i<14;i++){
			Card c = new Card(_clubs, i,i,null);
			_cards.add(c);
		}
		for (int i = 1; i<14;i++){
			Card c = new Card(_diamonds, i,i,null);
			_cards.add(c);
		}
		shuffle();
	}
	
	/**
	 * This method will carry out an arbitrary sorting of the cards. 
	 * 
	 * @param c cards will be shuffled to new pile of cards.
	 */
	
	public void shuffle(){
		Collections.shuffle(_cards);
	}
	
	/**
	 * This method returns the number of elements in the deck of cards. 
	 * 
	 * @return
	 */

	public int size() {
		return _cards.size();
	}
	
	/**
	 * This method will return the cards stored in the deck.
	 * 
	 * @return
	 */
	
	public ArrayList<Card> getCards(){
		return _cards;
	}

	public Card deal() {
		return _cards.remove(0);
	}
	
	
	//aceUp change every ace cards rank to the highest;
	//This method is only called to deck class when an aceup game is initilaized
	public void aceUp() {
		for (Card c:_cards) {
			if (c.getRank()==1) {
				c.setRank(14);
			}
		}
	}
	
}
