package gameOfWar;

import java.util.ArrayList;

public class Player {

  public ArrayList<Card> hand = new ArrayList<>();
  private int score = 0;
  public String name;
  public Card currentCard;

  public Player(String name) {  // assigns names to the players
    this.name = name;
  }

  public void setHand(ArrayList<Card> hand) {  // passes the cards into the players' hands
    this.hand = hand;
  }

  public void incrementScore() {  // allows score to be incremented
    this.score++;
  }
  public int totalScore() {  // allows a winner to be announced
    return this.score;
  }
  public void draw(Deck d) { // associates the deck with what is being drawn
   }
  public void flip() { // flips the card 
    this.currentCard = this.hand.remove(0);
  }
  public int describe() {  // associates player with score
   return this.score;
  } 
}