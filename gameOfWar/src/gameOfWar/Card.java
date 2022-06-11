package gameOfWar;
/*
 * This is a simplified game of war.  I borrowed 
 * the idea of the two lists of string organized 
 * in this way from a Promeneo instructor.  
 */

public class Card {
  private int value;
  private String name;  // names the value and the order creates the value
  private static final String[] pipStrings = {"Two", "Three", "Four", "Five", "Six", "Seven",
      "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
  private static final String[] suitStrings = {"Clubs", "Diamonds", "Hearts", "Spades"};

  public Card(int suit, int value) {
    this.name = pipStrings[value] + " of " + suitStrings[suit];
    this.value = value;
  }

  public int getValue() {
    return this.value; // value of index position
  }

  public String describe() {
    return this.name; // name of card.
  }
}
