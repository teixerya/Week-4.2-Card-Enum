
package Card;

/**
 *
 * @author ryanteixeira
 */
public class Card_Exercise {
    public static void main(String[] args) {
        
        DeckOfCards deck = new DeckOfCards();
        System.out.println("My Deck of Cards: ");
        System.out.println(deck);
        System.out.println("\nRandom Card: ");
        Card c = deck.pickCard();
        System.out.println(c.shortString());
    }
}
