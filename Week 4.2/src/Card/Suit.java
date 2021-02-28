
package Card;

/**
 *
 * @author ryanteixeira
 */
public enum Suit {
    
    CLUBS(1,"Clubs",'\u2663'),
    DIAMONDS(2,"Diamonds",'\u2662'),
    HEARTS(3,"Hearts",'\u2661'),
    SPADES(4,"Spades",'\u2660');
    
    private int number;
    private String name;
    private char uni;
    //______________________
    public int getNumber(){
        return number;
    }
    
    public String getName(){
        return name;
    }
    
    public char getUni(){
        return uni;
    }
    
    private Suit(int number, String name, char uni){
        this.number=number;
        this.name=name;
        this.uni=uni;
    }
    
    public String getDispName(){
        return name;
    }
    
    public char getDispImage(){
        return uni;
    }   
}
