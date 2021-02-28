
package enumDemo1;

/**
 *
 * @author ryanteixeira
 */
public enum Days {
    
    // all the members of an enum are CONSTANTS
    SUNDAY(1, "Sun"),
    MONDAY(2, "Mon"),
    TUESDAY(3, "Tues"),
    WEDNESDAY(4, "Wed"),
    THURSDAY(5, "Thurs"),
    FRIDAY(6, "Fri"),
    SATURDAY(7, "Sat");
    
    private String displayName;
    private int dayNumber;
    //we cann have a getter but there is no setter for enum
    public String getDisplayName(){
        return displayName;
    }
    public int getDayNumber(){
        return dayNumber;
    }
    
    //2. constructors in enums are private
    private Days(int dayNumber, String displayName){
        this.displayName=displayName;
        this.dayNumber=dayNumber;
    }
     
}
