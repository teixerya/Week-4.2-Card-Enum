
package CoinEnum;

/**
 *
 * @author ryanteixeira
 */
public class CoinDemo {
    public static void main(String[] args) {
        System.out.println("Canadian Coins:");
        System.out.println("Name Value");
        System.out.println("--------");
        
        Coin c = Coin.DIME;
        
        System.out.println(c.getName());
        
        for(Coin c2: Coin.values())
            System.out.printf("%s%.2f\n",c2.getName(), c2.getValue());
    }
    
}
