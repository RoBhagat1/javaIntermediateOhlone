/*********************************************************************************
Name: Rohan Bhagat
Course: CS170-0X
Lab #: Lab 3
Submission Date: 10:00 pm, Wed (10/21)
Brief Description: BusinessAccountApp, App class that calls and supplies hard coded values
*********************************************************************************/
public class BusinessAccountApp {
	public static void main(String[] args) {
		BusinessAccount account1 = new BusinessAccount(100);//give hard coded value
		System.out.println(account1.toString());
		account1.withdraw(30); //calling Api of AccountReceivable 
		System.out.println(account1.toString());
		account1.deposit(20);
		System.out.println(account1.toString());
		account1.withdraw(400000);//testing values
		System.out.println(account1.toString());
		account1.deposit(-4);
		System.out.println(account1.toString());
		
		System.out.println("--------------------");
		
		BusinessAccount account2 = new BusinessAccount(5000000);
		System.out.println(account2.toString() );
		account2.withdraw(1);
		System.out.println(account2.toString());
		account2.deposit(100);
		System.out.println(account2.toString());
		account2.withdraw(-1);//testing values 
		System.out.println(account2.toString());
		account2.deposit(-59);
		System.out.println(account2.toString());
		
		
	}
}
