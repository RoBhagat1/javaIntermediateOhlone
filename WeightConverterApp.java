/*********************************************************************************
Name: Rohan Bhagat
Course: CS170-0X
Lab #: Lab 1
Submission Date: 10:00 pm, Wed (9/23)
Brief Description: The driver code to run WeightConverter, supply the hardcoded values
and call the conversion
*********************************************************************************/
public class WeightConverterApp {	//app class
	public static void main(String[] args) {
		WeightConverter givePounds1 = new WeightConverter(100);//supply value 100
		WeightConverter givePounds2 = new WeightConverter(500);//supply value 500
		givePounds1.conversion();//call conversion 100
		givePounds2.conversion();//call conversion 500

	}

}
