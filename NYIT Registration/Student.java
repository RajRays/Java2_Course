/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nyitregistration;

/**
 * @author Raj
 */
public class Student extends Person
{
    int studentNumber;
    
	public Student()
	{	
            super();
	    studentNumber = 0;		// Indicating no number yet
	}
	
        public Student (String initialName)
	{
            super (initialName);
	}
        
        public Student (String initialName, int initialStudentnumber)
	{
            super (initialName);
	    studentNumber = initialStudentnumber;
	}
	
        public void reset (String newName, int newStudentNumber)
	{	
            setName (newName);
	    studentNumber = newStudentNumber;
	}

        public int getStudentNumber()	
        {
            return studentNumber;
        }

	public void setStudentNumber (int newStudentNumber)
	{
            studentNumber = newStudentNumber;
        }
        
        public boolean equals (Student otherStudent)
	{
            return this.hasSameName(otherStudent) &&
		( this.studentNumber == otherStudent.studentNumber); 	} 


    @Override
	public void writeOutput()
	{
            System.out.println("Name: " + getName()
                              + "\nStudent number: " + getStudentNumber());
        }
}			

