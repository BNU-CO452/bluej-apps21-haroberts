import java.util.ArrayList;
/**
 * This class stores information about a course
 * that enrolled students may want to complete
 *
 * @author Derek Peacock and Nicholas Day
 * Modified by Haydn Roberts
 * @version 1.1 19/10/2021
 */
public class Course
{
    public final static int MAXN_MODULES = 4;
    
    public ArrayList<Module> modules;
    public ArrayList<Student> students;
    
    private String code;
    private String title;
    
    private Grades finalGrade;
     
    public Course()
    {
        this("BB1BMI1", "BSc Business Management and Information Technology");
        modules  = new ArrayList<Module>();
        students = new ArrayList<Student>();
        
        createModules();
        createStudents();
    }
    
    /**
     * Constructor for objects of class Course
     */
    public Course(String code, String title)
    {
        // initialise instance variables
        this.code = code;
        this.title = title;
        
        modules  = new ArrayList<Module>();
        
        createModules();
    }

    /**
     * Create four modules and add them to the
     * modules list for testing purposes.  These
     * must be your four modules.
     */
    public void createModules()
    {
        Module co452 = new Module("CO452", "Programming Concepts");
        Module mg412 = new Module("MG412", "Principles of Marketing");
        Module co454 = new Module("CO454", "Digital Technologies and Professional Practice");
        Module mg461 = new Module("MG461", "Global Business Environment");
        addModule(co452);
        addModule(mg412);
        addModule(co454);
        addModule(mg461);
    }
    
    public void createStudents()
    {
        Student Fiza = new Student("Fiza", 2211000);
        Student Devine = new Student ("Devine", 2211001);
        Student Louie = new Student ("Louie", 2211002);
        students.add Fiza;
        
    }
    
    public void addModule(Module module)
    {
        if(modules.size() < MAXN_MODULES)
        {
            modules.add(module);
        }
    }
    
    /**
     * 
     */
    public Grades convertToGrade(int mark)
    {
        if (mark >= 0 && mark <= 39)
            return Grades.F;
        else if(mark <= 49)
            return Grades.D;
        else if(mark <= 59)
            return Grades.C;
        else if(mark <= 69)
            return Grades.B;
        else if(mark <=100)
            return Grades.A;
        else
            return Grades.NS;
    }
    
    
    /**
     * Calculate the average mark from the four module marks
     * and convert that into a final grade.
     */
    public Grades calculateGrade(ArrayList<ModuleMark> marks)
    {
        int total = 0;
        int finalMark = 0;
        for(ModuleMark mark : marks)
        {
            total = total + mark.getValue();
        }
        finalMark = total / 4;
        finalGrade = convertToGrade(finalMark);
        return(finalGrade);
    }
    
    /**
     * Prints out the details of a course and the
     * four modules
     */
    public void print()
    {
        System.out.println();
        System.out.println(" Course " + code + ": " + title);
        System.out.println();
        
        printModules();
    }
    
    /**
     * Print the course's four modules
     */
    public void printModules()
    {
        for (Module module : modules)
        {
            module.print();
            module.printCredit();
        }
    
    }
}
