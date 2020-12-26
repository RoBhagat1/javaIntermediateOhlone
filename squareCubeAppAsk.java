/*********************************************************************************
Name: Rohan Bhagat
Course: CS170-0X
Lab #: Lab 1
Submission Date: 10:00 pm, Wed (9/23)
Brief Description: Asks for input and supplies it to Square Cube
*********************************************************************************/
import java.util.Scanner;

public class squareCubeAppAsk {//squarecubeask

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);  // Create a Scanner object
		 int inputFirst =0;//input value for first
		 int inputLast =0;//input value for last
		 System.out.println("Enter starting number");//first number
		 inputFirst = input.nextInt();//stores first number
		 System.out.println("Enter ending number");//last number
		 inputLast = input.nextInt();//stores last number
		 SquareCube calcSquare= new SquareCube(inputFirst,inputLast);//supplies values to squarecube
		 calcSquare.calculate();//calls calculate function

	}

}

