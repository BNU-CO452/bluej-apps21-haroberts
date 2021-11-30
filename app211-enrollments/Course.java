import java.util.*;

/**
 * This class contains information about an undergraduate course
 * at BNU together with a list of student who are enrolled
 *
 * @author Haydn Roberts
 * @version 1.1
 */
public class Course
{
    // A unique identifier e.g. BT1CTG1
    private String code;
    // The full title including qualification and subject
    private String title;
    // A module title and name
    private Module module;
    
    /**
     * Create a Course with a maximum number of enrolments. 
     * All other details are set to unknown values.
     */
    public Course(String code, String title)
    {
        this.code = code;
        this.title = title;
    }

    /**
     * Print the details of the course, the list
     * of students enrolled and the module
     */
    public void print()
    {
        printHeading();
        
        System.out.println(" Course Code: " + code + ": " + title + ": ");
        module.print();
        System.out.println();
    }
    
    /**
     * Print out the details of the course to the terminal.
     */
    private void printHeading()
    {
        System.out.println(" --------------------------------");
        System.out.println("   App211: Course Details");
        System.out.println(" --------------------------------");
        System.out.println();
    }
    
        /**
     * Create a module under a course.
     */
    public void addModule(Module module)
    {
        this.module = module;
    }
    
        /**
     * Print out the details of the module to the terminal.
     */
    public void printModule()
    {
        module.print();
    }
}
