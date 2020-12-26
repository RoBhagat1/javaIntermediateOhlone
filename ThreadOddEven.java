/*********************************************************************************
Name: Rohan Bhagat
Course: CS170-0X
Lab #: Lab 4
Submission Date: 10:00 pm, Wed (11/18)
Brief Description: The Thread Odd or Even code to run 2 threads to determine which is odd and which is even and print that
*********************************************************************************/
public class ThreadOddEven extends Thread {//import thread
	
	private boolean odd;//odd or even
	private String threadName;
	private static int max = 55;
	
	public ThreadOddEven(boolean odd)
	{
		this.odd =odd;
		if (this.odd == true)
			threadName = "Odd Number Thread";
		else
			threadName = "Even Number Thread";
	}
	
	public void run() { // Override run()
		for (int i = 1; i <= max; i++) {
			
			if(this.odd==true)
			{
				//print only odd numbers
				if(i%2==1)
					System.out.println(i + " " +this.threadName + " is running...");
			}
			else
			{
				//print only even numbers
				if(i%2==0)
					System.out.println(i + " " +this.threadName + " is running...");
			}

			Thread.yield(); // Yield to another thread
		}
	}
}