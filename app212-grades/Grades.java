
/**
 * These are the grades used by BNU to classify 
 * students at the completion of their course
 * Each value is the top percentage mark for that grade
 * @author Derek Peacock and Nicholas Day
 * Modified by Haydn Roberts
 * @version 1.1 30/10/2021
 */
public enum Grades
{
    NS (0), 
    F  (39), 
    D  (49), 
    C  (59), 
    B  (69), 
    A  (100);
    
    private final int value;
    
    private Grades(int value)
    {
        this.value = value;
    }
    
    public int getValue()
    {
        return value;
    }
}
