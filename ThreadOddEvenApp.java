/*********************************************************************************
Name: Rohan Bhagat
Course: CS170-0X
Lab #: Lab 4
Submission Date: 10:00 pm, Wed (11/18)
Brief Description: The driver code to run it and start the code
*********************************************************************************/
public class ThreadOddEvenApp {
	public static void main(String[] args) {

		Thread thread1 = new ThreadOddEven(true); //odd thread
		Thread thread2 = new ThreadOddEven(false);//even thread
		thread1.start();//start threads
		thread2.start();//start threads
	
	}
}
