
package Card;

/**
 *
 * @author ryanteixeira edit
 */
public class Card {
    
    private Rank r;
    private Suit s;
    
    Card(){
    }
    
    Card(Rank r, Suit s){
       this.r=r;
       this.s=s;
    }
    
    public Rank getR(){
        return r;
    }
    
    public Suit getS(){
        return s;
    }
    
    public void setS(Suit s){
        this.s = s;
    }
    
    public String toString(){
        return this.getR() + "of" + this.getS();
    } 
    
    public String shortString(){
        return this.getR()+ ""+ this.getS().getDispImage();
    }
    
}


//make an array size 52
