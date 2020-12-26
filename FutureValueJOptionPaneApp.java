/*********************************************************************************
Name: Rohan Bhagat
Course: CS170-0X
Lab #: Lab 2
Submission Date: 10:00 pm, Wed (10/7)
Brief Description: The code to use JOptionPane to ask for user input, and send it to futurevalue to compute
*********************************************************************************/

import java.math.*;//import statments
import java.text.NumberFormat;
import java.util.*;
import javax.swing.JOptionPane;

public class FutureValueJOptionPaneApp {
	
		public static void main(String[] args) {

		String userName="";//variables to store data
		String returnString="";

		BigDecimal monthlyInvestment = null;
		BigDecimal yearlyReturnRate =null;
		boolean exit = false;
		FutureValue futureValue = new FutureValue();  //Create the object
		while (exit == false)
		{
			userName= JOptionPane.showInputDialog ("What is your name?");//ask username
			
			if (userName == null)//cancel button
			{
				exit=true;
				break;
			}
			futureValue.setName(userName);
			
			
			boolean run = true;
			while (run)//monthly investment
			{
				returnString =  JOptionPane.showInputDialog( "Please enter monthly investment (1-1000000): ");
				if (returnString==null)//cancel
				{
					exit=true;
					break;
				}
				try
				{
					if (Double. parseDouble(returnString)>=1&&Double. parseDouble(returnString)<=1000000)//check right size
					{
						 monthlyInvestment = new BigDecimal(returnString);
						 futureValue.setMonthlyInvest(monthlyInvestment);
						 run=false;
					}
					else//error
					{
					    JOptionPane.showMessageDialog(null,"\nData input error.  Please enter a decimal data...");  
					}
				}
				catch(NumberFormatException e)
				{
				    JOptionPane.showMessageDialog(null,"\nData input error.  Please enter a decimal data...");  
				}
				catch(Exception e)
				{
				    JOptionPane.showMessageDialog(null,"\nData input error.  Please enter a decimal data...");  
				}	
			}//while end
			if (exit==true)//check cancel button
				break;
			run = true;
			while (run)
			{
				returnString = JOptionPane.showInputDialog( "Please enter the annual interest rate (0.1-3.5): ");//intrest rate
				if (returnString==null)
				{
					exit=true;
					break;
				}
				try
				{
					if (Double. parseDouble(returnString)>=0.1&&Double. parseDouble(returnString)<=3.5)//check right value
					{
						yearlyReturnRate = new BigDecimal(returnString);
						futureValue.setYearlyRate(yearlyReturnRate);
						run = false;
					}//break conditions
					else
					{
					    JOptionPane.showMessageDialog(null,"\nData input error.  Please enter a decimal data...");  
					    
					}
				}
				catch(NumberFormatException e)
				{
				    JOptionPane.showMessageDialog(null,"\nData input error.  Please enter a decimal data...");  
				}
				catch(Exception e)
				{
				    JOptionPane.showMessageDialog(null,"\nData input error.  Please enter a decimal data...");  
		
				}
			}//while end
			if (exit==true)
				break;
			run=true;
			while (run)
			{
				returnString = JOptionPane.showInputDialog("Please enther the invest year (1-100): ");//invest years 
				if (returnString==null)
				{
					exit=true;
					break;
				}
				try
				{
					if (Double. parseDouble(returnString)>=1&&Double. parseDouble(returnString)<=100)//right conditions
					{
						BigDecimal investYears= new BigDecimal(returnString);
						futureValue.setYears(investYears);
						run=false;
					}
					else//exit conditions 
					{
					    JOptionPane.showMessageDialog(null,"\nData input error.  Please enter a decimal data...");  
					}
				}
				catch(NumberFormatException e)
				{
				    JOptionPane.showMessageDialog(null,"\nData input error.  Please enter a decimal data...");
				}
				catch(Exception e)
				{
				    JOptionPane.showMessageDialog(null,"\nData input error.  Please enter a decimal data...");
	
				}
			}//while done
			if (exit==true)
				break;
			
			futureValue.futureValueCompute();  //Call the method to compute
			 
			
			NumberFormat currency = NumberFormat.getCurrencyInstance(); //referencing 
			currency.setMaximumFractionDigits(3); 
			JOptionPane.showMessageDialog(null,"Your return value: " + currency.format(futureValue.getFutureValue()));//call to calculate
			run=true;
			while(run)
			{
				returnString = JOptionPane.showInputDialog("Continue?(y/n): ");//repeat
		
				if (returnString==null)
				{
					exit=true;
					break;
				}
				
				if (returnString.equals("y")) {
					exit =false;
					run = false;
				}
				else if (returnString.equals("n"))
				{
					exit = true;
					run=false;
				}
				else 
				{
					
					JOptionPane.showMessageDialog(null,"only input y/n");
					exit=false;
					run= true;
				}
			}
		}
	}

}
