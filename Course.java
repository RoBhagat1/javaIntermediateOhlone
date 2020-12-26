/*********************************************************************************
Name: Rohan Bhagat
Course: CS170-0X
Lab #: Lab 4
Submission Date: 10:00 pm, Wed (11/18)
Brief Description: The Course code to record student name, course title, credit and final grade
*********************************************************************************/
import java.util.Comparator;

public class Course implements Comparable  {
	private String studentName;//variables for student name, title, credit, final Grade
	private String courseTitle;
	private double courseCredit;
	private String finalGrade;
	
	public Course(String studentName, String courseTitle, double courseCredit, String finalGrade)
	{
		this.studentName = studentName;//constructor
		this.courseTitle = courseTitle;
		this.courseCredit = courseCredit;
		this.finalGrade = finalGrade;
	}
	
	public String getStudentName()//return student name
	{
		return this.studentName;
	}


	@Override
	public int compareTo(Object arg0) {//compare to class to sort
		
		Course compareToCourse = (Course) arg0;
		return this.studentName.compareTo(compareToCourse.studentName);//sort it
	}

}
