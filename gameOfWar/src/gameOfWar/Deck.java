package gameOfWar;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
  private ArrayList<Card> cards;

  public Deck() { // creates the deck
    this.cards = new ArrayList<>();
    for (int i = 0; i < 4; i++) {
      for (int x = 0; x < 13; x++) {
        Card card = new Card(i, x);
        this.cards.add(card);
      }
    }
    shuffle();
  }
  public void deal(Player player) {  // deals the hand
    ArrayList<Card> hand = new ArrayList<Card>(); 
    for (int i = 0; i < 26; i++) {
      Card card = draw();
      hand.add(card);
    }
    player.setHand(hand);
  }

  private void shuffle() { // shuffles the deck
    Collections.shuffle(this.cards);
  }

  public Card draw() { // draws the card
    return this.cards.remove(0);
  }
}
