package student.hashmap;
import java.util.*;
import javax.swing.JOptionPane;
import java.io.*;

/*	
        NYIT, CSCI-185 504, w02 course prog2/java2, FINAL exam section 2
	My name: Rajendra Bhagroo
	Program title: Student Enrollment List
*/

public class StudentHashmap
{

    public static void main(String[] args) 
    {

        JOptionPane.showMessageDialog(null,"Welcome! , This Program Is Designed To Help You Organize Student Courses");      
        
        int numberOfStudents = Integer.parseInt(JOptionPane.showInputDialog("Please Enter Total Number Of Students You Are Inputting Today")); //Stores Number Of Students For Later Use
        int [] countStudents  = new int [numberOfStudents]; //Creates an Array Based On Number Of Students
        
        for(int i = 0; i < countStudents.length ; i++) //Index [ 0 ] = 1 , Index [ 1 ] = 2, Ect.
        {
            countStudents[ i ] = i + 1;
        }
     
        HashMap<Integer, ArrayList<String>> students =  new HashMap<Integer, ArrayList<String>>(); 
        
        ArrayList<String> studentCourses = null;
        
        int count = 0;
        
        while( count < numberOfStudents )
        {
            
              JOptionPane.showMessageDialog(null, " Inputting Data For Student # : " + countStudents[ count ]); //User Knows What Student He Is Adding Courses To, STARTING FROM 1, Because Index 0 has int value of 1
              studentCourses =  new ArrayList<String>(); //Creates New Arraylist For Particular Student
              
              int Option = JOptionPane.showConfirmDialog(null,"Click \"Yes\" To Add More Courses" + "\n\nIf You Are Finished Adding Courses, Click \"No\"","Asks If User Would Like To Enter More Courses", JOptionPane.YES_NO_OPTION);
              
              while(Option == JOptionPane.YES_OPTION)
                {
                   String Course = JOptionPane.showInputDialog("Please Enter Course Name , And Course Number" + "\nValues Should Be Seperated By A Space" + "\n\nExample: CSCI 185");
                   studentCourses.add(Course); //Adds Course To ArrayList
                   Option = JOptionPane.showConfirmDialog(null, "More Courses?", "Click Yes or No", JOptionPane.YES_NO_OPTION);
                }
  
                        students.put(count + 1, studentCourses); //Skips Index 0, saves studentCourses in hashmap
                        count++; //Advances To Next Student


        }//END OF FIRST WHILE LOOP
              
         
              printMap(students, numberOfStudents);       
   
    }//END OF MAIN


    
    static void printMap( HashMap<Integer, ArrayList<String>> students, int numberOfStudents) //NOT WORKING
    {
  
        Iterator itr = students.keySet().iterator(); //Declares Iterator Method Of HashMap
        while(itr.hasNext())
        {
            Object key =  itr.next();
            JOptionPane.showMessageDialog(null, " Student# : " + key + "  " + students.get(key) ); //Prints (Integer : Key)   And   (Arraylist Values from studentCourses)
            
            try //Writes HashMap To File
            {
                ObjectOutputStream iStr = new ObjectOutputStream (new FileOutputStream ("StudentEnrollment.txt")); //iStr = inputStream
                
                iStr.writeObject(key);
                iStr.writeObject(students.get(key));
                iStr.close();
                
                JOptionPane.showMessageDialog(null, "File Created And Written To");
            }
           
            catch( Exception e) // Handles Any Error With Writting To File
            {
                JOptionPane.showMessageDialog(null, "Error Writting File");
            }
        }   

    }

}//END OF CLASS