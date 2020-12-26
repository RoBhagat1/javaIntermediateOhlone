/*********************************************************************************
Name: Rohan Bhagat
Course: CS170-0X
Lab #: Lab 4
Submission Date: 10:00 pm, Wed (11/18)
Brief Description: The TranscriptApp to be a driver to test code
*********************************************************************************/
import java.util.Scanner;

public class TranscriptApp {
	
	public static void main(String[] args) {
		
		Transcript transcript = new Transcript();//transcript
		String run = "Yes";//check if run or not
		Scanner input = new Scanner(System.in);
		
		while (!run.equals("n")) {//check to run or not
		
			createCourse(input, transcript);//create a course and call for input and transcript
			
			System.out.println("Input n to stop");//check to run or not
			
			run = input.nextLine();//get input
		}
		
		input.nextLine();
		run = "Yes";
		
		while (!run.equalsIgnoreCase("n")) {

			System.out.println("A: Add\nD: Delete\nS: Search\nP: Print\nO: Sort\nN: exit");//check what to do
			run = input.nextLine();
			
			if(run.equals("A"))//do add
				createCourse(input, transcript);
			
			if (run.equals("D"))//do delete
			{
				String name = askName(input);
				boolean deleted = transcript.delRecord(name);
				if (deleted==true)
					System.out.println(name+" Student deleted");
				else
					System.out.println(name+" Not Found");
			}
				
			if (run.equals("S"))//do search
			{
				String name = askName(input);
				Course c = transcript.searchRecords(name);
				
				if (c!=null)
					System.out.println(name+" Student record found ");
				else
					System.out.println(name+" Not Found");
			}
			
			if (run.equals("P"))//print
			{
				transcript.printRecords();
			}
			
			if (run.equals("O"))//sort
			{
				transcript.sortRecords();//call sort 
			
			}
		}
	
	}
	
	public static String askName(Scanner input) {//ask for name, to use for search and delete
		String name = "";
		
		System.out.println("Input student name");//input student name
		name = input.nextLine();
		
		return name;
	}
	
	
	public static void createCourse(Scanner input, Transcript transcript) {//course for adding, so we can use multiple times
		String name = "";
		String course="";
		double credits=0;
		String grade="";
		
		
		System.out.println("Input student name");//input name
		name = input.nextLine();
		
		System.out.println("Input Course");//input course
		course = input.nextLine();

		double inputCredit =  Validator.validateDouble(input, "Input credits ");//get value, send to validator to check			
		
		String inputGrade =  Validator.validateString(input, "Input Grade");//get value, send to validator to check
		
		Course myCourse = new Course(name, course, credits, grade);//input the myCourse
		transcript.addRecord(myCourse);	
	}
	
}
