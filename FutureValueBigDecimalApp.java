/*********************************************************************************
Name: Rohan Bhagat
Course: CS170-0X
Lab #: Lab 2
Submission Date: 10:00 pm, Wed (10/7)
Brief Description: The code to ask for user input, and send it to futurevalue to compute
*********************************************************************************/
import java.math.*;//import
import java.text.NumberFormat;
import java.util.*;

public class FutureValueBigDecimalApp {
public static void main(String[] args) {

		String choice = "y";//variables
		String userName;
		int minYear = 1;
		int maxYears = 100;
		double minRate = 0.1;
		double maxRate= 3.5;
		double minAmount =1.00;
		double maxAmount= 1000000.00;
		String determine = "";
		boolean run = true;
	Scanner sc = new Scanner(System.in);

	FutureValue futureValue = new FutureValue();  //Create the object

	
	while (run==true)
	{
		System.out.print("Please enter your name: ");
		userName = sc.next();
		futureValue.setName(userName);
		double monthlyDouble =  Validator3.validateDouble(sc, "Please enter monthly investment (1-1000000): ",minAmount, maxAmount);//get value, send to validator to check
		BigDecimal monthlyInvestment = new BigDecimal(monthlyDouble);
		futureValue.setMonthlyInvest(monthlyInvestment);

		double yearlyDouble = Validator3.validateDouble(sc, "Please enter the annual interest rate (0.1-3.5): ",minRate, maxRate);//get value, send to validator to check
		BigDecimal yearlyReturnRate = new BigDecimal(yearlyDouble);
		futureValue.setYearlyRate(yearlyReturnRate);

		double investInt= Validator3.validateInt(sc, "Please enther the invest year (1-100): ", minYear, maxYears);//get value, send to validator to check
		BigDecimal investYears= new BigDecimal(investInt);
		futureValue.setYears(investYears);

		futureValue.futureValueCompute();  //Call the method to compute
		 
		
		NumberFormat currency = NumberFormat.getCurrencyInstance(); //referencing 
		currency.setMaximumFractionDigits(3); 
		System.out.println("Your return value: " + currency.format(futureValue.getFutureValue()));//calculate
		System.out.println("Continue?(y/n): ");//check if continue or not

		determine = sc.next();	//Get the choice
		if (determine.equals("y"))
			run =true;
		else if (determine.equals("n"))
			run = false;
		else 
			System.out.println("only input y/n");
			
		
	}
}
}

		
		
 	