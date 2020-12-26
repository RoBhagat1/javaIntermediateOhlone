/*********************************************************************************
Name: Rohan Bhagat
Course: CS170-0X
Lab #: Lab 1
Submission Date: 10:00 pm, Wed (9/23)
Brief Description: The class to convert the number from pound to kilogram and kilogram to pound
*********************************************************************************/
public class WeightConverter {//create class
	private double inputValue;//input variable
	public WeightConverter(double p )//constructor
	{
		inputValue=p;//pound variable
	}

	public void conversion()//conversion function
	{
		double calcPound = inputValue*0.45359237;//calculate the input to pound
		
		double kilo = inputValue *2.20462;//input to kilo
		System.out.println("Pounds "+inputValue+" : "+ String.format("%.2f", calcPound)+" and Kilo "+ inputValue+" : "+ String.format("%.2f", kilo));//print all
	}

}
