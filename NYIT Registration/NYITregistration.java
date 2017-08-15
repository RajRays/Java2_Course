package nyitregistration;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Raj
 */
public class NYITregistration 
{

    static int countUnderGrad = 0;
    static int countGrad = 0;
    static final int size = 101;
            
 	public static void main (String[] z)
	{
            
         JOptionPane.showMessageDialog(null," Welcome To The NYIT Department of Registration!"
             + " \nNYIT offers courses for both, Undergraduates and Graduates "
             + " \n\nTo begin applying for NYIT, click \"ok\" and follow instructions");
         
         boolean done = false;
         
        // while(!done)
         //{
             int input = Integer.parseInt( JOptionPane.showInputDialog( " Hello!, This screen helps you enroll new students into NYIT"
                 + " \n\nNew Undergraduate  =   Enter \" 1 \""
                 + "\n New Graduate             =   Enter \" 2 \""
                 + "\n\n If you are finished adding students, Enter \"3\""));
            
             switch(input)
             {
                 case 1:
                     
                     Person[] UNDERGRAD = new underGraduate [size];
                     
                     countUnderGrad++;
                     
                     for(; countUnderGrad <= 100;)
                             {
                                 UNDERGRAD[ countUnderGrad ] = new underGraduate();
                                 underGraduate.readinput();
                                 prompt();
                             }
                     
                     
                     break;
                 case 2:
                     
                     Person[] GRAD = new underGraduate [size];
                    
                     countGrad++;
                     
                    for(; countGrad <= 100;)
                             {
                                 GRAD[ countGrad ] = new Graduate();
                                 prompt();
                             }
                     
                     break;
                 case 3:
                     JOptionPane.showMessageDialog(null,"Thank you for using our program, We hope to see your students soon!");
                     System.exit(0);
                 break;
                     
             }
            
            
            Person[  ] people = new Person[ 4 ];
                   
		people[0] = new underGraduate 	("Cotty, Manny",4910, 1);
		people[1] = new underGraduate	("Kick, Anita",	9931, 2);
		people[2] = new Student		("DeBanque, Robin",8812);
		people[3] = new underGraduate 	("Bugg, June",	9901, 4);
		for ( Person p : people)
		{
			p.writeOutput();		//modified for GUI style O/P
			System.out.println();
		}
	//}                      
}
        
        static void prompt()
        {
        int input = Integer.parseInt( JOptionPane.showInputDialog( " Hello!, This screen helps you enroll new students into NYIT"
                 + " \n\nNew Undergraduate  =   Enter \" 1 \""
                 + "\n New Graduate             =   Enter \" 2 \""
                 + "\n\n If you are finished adding students, Enter \"3\""));
        }
        
}