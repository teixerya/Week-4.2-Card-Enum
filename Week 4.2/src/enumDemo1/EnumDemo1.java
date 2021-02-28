
package enumDemo1;

/**
 *
 * @author ryanteixeira
 */
public class EnumDemo1 {
    public static void main(String[] args) {
       
           Days d= Days.FRIDAY;
           
           System.out.println(d);
           System.out.println(d.ordinal());
           System.out.println(d.name());
           System.out.println(d.getDisplayName());
           System.out.println(d.getDayNumber());
           
           //iterating through the enum datatype using a foreach loop
           for(Days d1: Days.values())
               System.out.println(d1.getDisplayName());
    }

   
}
