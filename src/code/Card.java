package code;

import java.awt.Container;

import javax.swing.JPanel;

import code.Piles.Piles;
/*
 * Now Card extends JPanel So that we don't need to have a reference in each cardListener in order to retrive the correct
 * Card information when we click,press mouse on a JPanel. This JPanel itself tells us its rank, suit.
 * _parent is used to track the pile this card belongs to. 
 */

/*
 * The method ConvertToUrl in GUI is removed back to card class and card class has a third parameter in its constructor 
 * so that the image of a card and its rank is decoupled;
 */
/**
 * The instances of this class make up the properties of a card.
 * We made them private so that we can have control whenever we access them.
 * 
 * @author carmenhuang
 *
 */

public class Card extends JPanel implements Comparable<Card>{
	private String _suit;
	private Piles _parent;
	private int _rank;
	private int _image;
	/**
	 * Instantiating and setting the instances of _suit and _rank of a card
	 * 
	 * @param suit one of the several categories that a deck of cards is divided into
	 * @param rank the placement value of the card  
	 */
	public Card(String suit, int rank, int image,Piles parent){
		super();
		_parent =parent;
		_suit = suit;
		_rank = rank;
		_image = image;

	}
	
	/**
	 * This method retrieves the current suit
	 * 
	 * @return 
	 */
	public String getSuit(){
		return _suit;
	}
	
	/**
	 * This method retrieves the current rank 
	 * 
	 * @return
	 */
	
	public int getRank(){
		return _rank;
	}
	
	public void setRank(int i){
		_rank = i;
	}
	
	public int getImage() {
		return _image;
	}
	
	public void setParent(Piles parent) {
		_parent = parent;
		
	}
	public Piles getPile() {
		return _parent;
	}
	
	public String toString() {
		int i = this.getImage();
		String rank;
		String suit = this.getSuit();
		if (i == 11) {
			rank = "j";
		} else if (i == 12) {
			rank = "q";
		} else if (i == 13) {
			rank = "k";
		} else if (i == 1) {
			rank = "a";
		} else {
			rank = "" + i;
		}
		if (suit.equals("Spades")) {
			return rank + "s";
		} else if (suit.equals("Clubs")) {
			return rank + "c";
		} else if (suit.equals("Hearts")) {
			return rank + "h";
		} else {
			return rank + "d";
		}
	}

	public int compareTo(Card oj2) {
		return this.getRank()-oj2.getRank();
	}

	
}
