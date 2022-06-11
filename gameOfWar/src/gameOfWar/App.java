package gameOfWar;
public class App {
  public static void main(String[] args) {
    Deck d = new Deck();
    Player p1 = new Player("Isaac");  //new players
    Player p2 = new Player("Kay");
    d.deal(p1);   // associates the cards with the player
    d.deal(p2);

    p1.describe();  // assigns which part of the deck which player has 
    p2.describe();
    for (int i = 0; i < 26; i++) {

      p1.flip();  // shows the card and prints out the result
      p2.flip();
      System.out.printf("%-45s", p1.name + " : " + p1.currentCard.describe() );
      System.out.printf("%-45s", p2.name + " : " + p2.currentCard.describe());
      
      if (p1.currentCard.getValue() > p2.currentCard.getValue()) {  // gathers and prints results after each flip 
        // player 1 wins
        p1.incrementScore();
        System.out.printf("%-30s\r\n", p1.name + " gets a point!");
      } else if (p1.currentCard.getValue() < p2.currentCard.getValue()) {
        p2.incrementScore();
        System.out.printf("%-30s\r\n", p2.name + " gets a point!");
      } else {
        System.out.printf("%-30s\r\n", "It's a draw!");
      }
    }
    if (p1.totalScore() > p2.totalScore()) {               // gathers and prints who won the game or if there was a tie  
      System.out.printf("*** " + p1.name + " wins! ***");
    } else if (p1.totalScore() < p2.totalScore()) {
      System.out.printf("*** " + p2.name + " wins! ***");
    } else {
      System.out.println("It's a tie!");
    }
  }
}