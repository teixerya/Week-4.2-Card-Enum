
package Card;

/**
 *
 * @author ryanteixeira
 */
public enum Rank {
    TWO(2,"Two","2"),
    THREE(3,"Three","3"),
    FOUR(4,"Four","4"),
    FIVE(5,"Five","5"),
    SIX(6,"Six","6"),
    SEVEN(7,"Seven","7"),
    EIGHT(8,"Eight","8"),
    NINE(9,"Nine","9"),
    TEN(10,"Ten","10"),
    JACK(11,"Jack","J"),
    QUEEN(12,"Queen","Q"),
    KING(13,"King","K"),
    ACE(1,"Ace","A");
    
    private int number;
    private String name;
    private String symName;
    //__________________
    
    public int getNumber(){
        return number;
    }
    
    public String getName(){
    return name;
    }
    
    public String getSymName(){
    return symName;
    }
           
    private Rank(int number, String name, String symName){
        this.number=number;
        this.name=name;
        this.symName=symName;
    }  
}
