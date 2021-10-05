
/**
 * This class models an example BNU Module
 *
 * @author Haydn Roberts
 * @version 1.0
 */
public class Module
{
    // Variables
    private String code;
    private String title;
    private int credits;
    
    /**
     * Create a Course with a maximum number of enrolments. 
     * All other details are set to unkown values.
     */
    public Module(String code, String title)
    {
        this.code = code;
        this.title = title;
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
    
    /** 
     * Set the credits for the module
     */
    public void setCredits(Module module)
    {
        this.credits = credits;
    }

}
