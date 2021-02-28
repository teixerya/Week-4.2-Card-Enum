
package CoinEnum;

/**
 *
 * @author ryanteixeira
 */
public enum Coin {
    
      PENNY("Penny    ",0.01),
     NICKLE("Nickle   ",0.05),
       DIME("Dime     ",0.10),
    QUARTER("Quarter  ",0.25),
     LOONIE("Loonie   ",1.00),
    TWOONIE("Twoonie  ",2.00);
    
    private String name;
    private double value;
    
    public String getName(){
        return name;
    }
    
    public double getValue(){
        return value;
    }
    
    private Coin(String name, double value){
        this.name=name;
        this.value=value;
    }
    
}
