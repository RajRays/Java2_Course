package nyitregistration;

/**
 * @author Rajendra Bhagroo
 */

public class Graduate extends Student
{
    private int level;
    
    public Graduate()
    {
      super();
      level = 1;
    }
    
    public Graduate(String initialName)
    {
      super(initialName);
    }  
    
    public Graduate(String initialName, int initialStudentnumber)
    {
      super(initialName);
      studentNumber = initialStudentnumber;
    }
      
    public Graduate(String initialName, int initialStudentnumber, int newLevel )
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
    
    public boolean equals (Graduate otherGraduate)
	{
            return this.hasSameName(otherGraduate) &&
		( this.studentNumber == otherGraduate.studentNumber);
        } 
    
    @Override
	public void writeOutput()
	{
            System.out.println("Name: " + getName()
                              + "\nStudent number: " + getStudentNumber()
                              + "\nLevel: " + getLevel());
        }

    
}
