
package Card;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author ryanteixeira
 */
public class DeckOfCards {
    
    Card [] cards = new Card[52];
    
    public DeckOfCards(){
        
        this.init();
    }
    
    public void init(){
        int i=0;
        for(Suit s: Suit.values()){
            for(Rank r : Rank.values()){
                this.cards[i++] = new Card(r,s);
            }
        }
    }
    
    public Card pickCard(){
        Random random = new Random();
        int index= random.nextInt(52);
        System.out.println(index);
        System.out.println(this.cards[index]);
        return this.cards[index];
    }
    
    public String shortString(Card c){
        return c.shortString();
    }
    
    public String toString(){
//         for (Card a : cards){
//             System.out.println(a);
//        }
        return Arrays.toString(cards);
    }
    
}
