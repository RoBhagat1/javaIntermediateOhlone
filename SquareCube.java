/*********************************************************************************
Name: Rohan Bhagat
Course: CS170-0X
Lab #: Lab 1
Submission Date: 10:00 pm, Wed (9/23)
Brief Description: SquareCube, takes input supplied and prints it in table
*********************************************************************************/
public class SquareCube {//square cube function
	private int inputFirst;//first input variable
	private int inputLast;//last input variable
	
	public SquareCube(int first, int last )//constructor
	{
		inputFirst=first;//first variable
		inputLast = last;//last input variable
	}
	public void calculate()//calculate function
	{	
	String table = "Number	Square	Cube";//creates table
	for(int i =inputFirst;i<=inputLast;i++)//for loop to continue placing
	{
		table+= "\n"+i+"	"+ 	i*i+"	"+i*i*i;//enters number, square, and cube
	}
	System.out.println(table);//prints it
}			
}
