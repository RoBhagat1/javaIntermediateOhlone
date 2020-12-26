/*********************************************************************************
Name: Rohan Bhagat
Course: CS170-0X
Lab #: Lab 1
Submission Date: 10:00 pm, Wed (9/23)
Brief Description: The driver code to run WeightConverter,ask for values
and call the conversion
*********************************************************************************/
import java.util.*;
public class WeighConverterAppAsk {//app class

	public static void main(String[] args) {
		boolean stopConversion = false;//how long run
		double inputPoundConversion = 0;//input value
		 Scanner input = new Scanner(System.in);  // Create a Scanner object
		String inputPound ="";//create inputPound
		while (stopConversion==false)//checks to keep going
		{
			System.out.println("Enter weight, or n to terminate");// enter weight or stop
			inputPound = input.nextLine();//store value
			if (inputPound.equals("n"))//terminate if n
				stopConversion =true;// stops loop
			else//else
			{
				inputPoundConversion = Double.parseDouble(inputPound);//convert to double
				WeightConverter givePounds1 = new WeightConverter(inputPoundConversion);//supply value
				givePounds1.conversion();//convert number
			}
		}
		}

}
