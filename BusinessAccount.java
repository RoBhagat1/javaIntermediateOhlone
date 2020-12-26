/*********************************************************************************
Name: Rohan Bhagat
Course: CS170-0X
Lab #: Lab 3
Submission Date: 10:00 pm, Wed (10/21)
Brief Description: BusinessAccount, class that implements AccountReceivable and Accountable and calculating the withdraw and deposit
*********************************************************************************/
public class BusinessAccount implements AccountReceivable, Accountable{
	
	private double balance;
	public BusinessAccount(double initalBalance)//constructor for balance
	{
		this.balance = initalBalance;
	}
	public String toString()//to String method to print it
	{
		return "The amount in the buisness account is "+balance;
	}
	
	public void deposit(double amount)//deposit method
	{
		if (amount>0)//check if greater then 0
			balance+=amount;
		else
			System.out.println("Sorry, you cannot deposit zero or negative money.");
		
	}
	
	public void withdraw(double amount)//withdraw method
	{
		if(amount<=0)// check if less then 0
			System.out.println("Sorry, you cannot withdraw zero or negative money.");//error message
		else if (amount<=balance)//remove if fits criteria
			balance-=amount;
		else
			System.out.println("Sorry, you do not have enough money in your account. Your current balance is "+balance);
	}
	
	public double getBalance()//return balance
	{
		return balance;
	}
	


	           
		
}



