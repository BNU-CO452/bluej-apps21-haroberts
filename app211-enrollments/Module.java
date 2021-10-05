
/**
 * This class models an example BNU Module
 *
 * @author Haydn Roberts
 * @version 1
 */
public class Module
{
    // Variables
    private String code;
    private String title;

    /**
     * Constructor for objects of class Module
     */
    public Module()
    {
       
    }

    /**
     * A method to print the Module title and code
    */
    public void print()
    {
        printHeading();
        
        System.out.println(" Module Code and Title: " + code + ": " + title);
        System.out.println();
    }
    /**
     * Print out the details of the Module to the terminal.
     */
    private void printHeading()
    {
        System.out.println(" --------------------------------");
        System.out.println("   App211: Module Details");
        System.out.println(" --------------------------------");
        System.out.println();
    }


}
