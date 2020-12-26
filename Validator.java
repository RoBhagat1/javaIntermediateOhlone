/*********************************************************************************
Name: Rohan Bhagat
Course: CS170-0X
Lab #: Lab 4
Submission Date: 10:00 pm, Wed (11/18)
Brief Description: The Validator code to verify data entries of the credit (no letter or negative number) and final grade 
*********************************************************************************/
import java.util.Scanner;

public class Validator {
	public static double validateDouble(Scanner sc, String prompt){//verify credit
		boolean isValid = false;
		double data = 0.0;

		while(!isValid) {
			try {
				   System.out.print(prompt);
				  
				   if (!sc.hasNextDouble())     //Not a double
				    {   //System.out.println("Inside hasNextDouble()");
						throw new NumberFormatException();
					}
				   else {
						data = sc.nextDouble();	//Receive double
						sc.nextLine();		//Clear buffer
						if (data < 0) 				//less than min
							throw new Exception();		//Throw the exception
						else
							  isValid = true;
				   }
			 }								//End of try

			catch (NumberFormatException e) {
				System.out.println("\nData input error.  Please enter a decimal data...");
				sc.nextLine();		//Clear buffer
			 }						//End of catch
			catch (Exception e) {
				System.out.println("\nData input error.  Please check the data and try again...");
				sc.nextLine();
			 }
			} //End of while
			return data;
		}	//End of validateDouble()
	
	
	public static String validateString(Scanner sc, String prompt){//validate grade
		boolean isValid = false;
		String data = "";

		isValid = false;
		while(!isValid) {
			try {
				   System.out.print(prompt);
				   data = sc.nextLine();
				   if (data.equals("A")||data.equals("B")||data.equals("C")||data.equals("D")||data.equals("F"))//check if valid letter grade
						  isValid = true;
						else
							throw new Exception();
				   }
			catch (Exception e) {
				System.out.println("\n Needs to be a valid letter grade");//throw exception if invalid
				sc.nextLine();
			 }
			} //End of while
			return data;
		}	//End of validateDouble()
	
	
}