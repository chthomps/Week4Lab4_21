//Card Program dealing five cards

import java.util.Random;

public class Card {
	
	//Class Variables
	private int suit, rank;  
	private String cardSuit, cardRank; //output strings
	
	Random generator = new Random();
	
	
	//Main Method dealing Card object five times
	public static void main(String[] args) {  
		
		final int DEAL=5;
		
		System.out.println("Your 5 dealt cards are: ");
		
		Card card = new Card();  //only 1 Card object is generated as the Card is replaced
		
		for (int deal =1; deal <=DEAL; deal++) { //5 cards dealt (draw method applied to Card object)
			 card.draw();
			 System.out.print(card+", ");
			 
		}
		
	}
	
	
	
	//Custom Methods Section
	
	public void draw() {  //draw method for being dealt a card (suit 1-4, rank 1-13)
		suit = generator.nextInt(4)+1;
		rank = generator.nextInt(13)+1;	
	}
	
	
	public String toString() { //toString method for returning card object(rank and suit) to a string
		
		//rank string conversion
		 if (2 <=rank && rank <=10) {
			 cardRank = Integer.toString(rank);
		 }
		 else if (rank ==1) {
			 cardRank = "Ace";
		 }
		 else if (rank ==11) {
			 cardRank = "Jack";
		 }
		 else if (rank ==12) {
			 cardRank = "Queen";
		 }
		 else {
			 cardRank = "King";
			 }
			
		 //suit string conversion
		 if (suit ==1) {
			 cardSuit = "Hearts";
		 }
		 else if (suit ==2) {
			 cardSuit = "Spades";
		 }
		 else if (suit ==3) {
			 cardSuit = "Diamonds";
		 }
		 else {
			 cardSuit = "Clubs";
				 
		 }
	 //return statement for toString method
     return cardRank + cardSuit;
		
	}

}
