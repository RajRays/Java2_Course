package nyitregistration;
import javax.swing.JOptionPane;
/**
 *
 * @author Raj
 */
public class underGraduate extends Student
{
    
    private int level;
    
    public underGraduate()
    {
      super();
      level = 1;
    }
    
    public underGraduate(String initialName)
    {
      super(initialName);
    }  
    
    
    public underGraduate(String initialName, int initialStudentnumber)
    {
      super(initialName);
      studentNumber = initialStudentnumber;
    }
      
     public underGraduate(String initialName, int initialStudentnumber, int newLevel )
    {
      super(initialName);
      studentNumber = initialStudentnumber;
      level = newLevel;
    }
    
    public void reset (String newName, int newStudentNumber, int newLevel)
    {
        name = newName;
        newStudentNumber = studentNumber;
        level = newLevel;
    }
    
    
    public int getLevel()
    {
        return level;
    }
    
    public void setLevel(int newLevel)
    {
        level = newLevel;
    }
    
    public boolean equals (underGraduate otherunderGraduate)
	{
            return this.hasSameName(otherunderGraduate) &&
		( this.studentNumber == otherunderGraduate.studentNumber);
        }
    
    public void readinput()
	{
            name = JOptionPane.showInputDialog(" Enter Students first and last name, seperated by a comma (First name, Last name): ");
            studentNumber = JOptionPane.showInputDialog(" Enter Students ID Number, must be 9 digits or less (Optional): ");
            if (studentNumber > 9)
            {
               JOptionPane.showMessegeDialog(null," Student ID MUST be 9 digits OR less");
            }
            level = JOptionPane.showInputDialog(" Enter Students level(1,2,3,4) : ")
        }
    
    @Override
	public void writeOutput()
	{
            System.out.println("Name: " + getName()
                              + "\nStudent number: " + getStudentNumber()
                              + "\nLevel: " + getLevel());
        }
        

    
}
