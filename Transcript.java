/*********************************************************************************
Name: Rohan Bhagat
Course: CS170-0X
Lab #: Lab 4
Submission Date: 10:00 pm, Wed (11/18)
Brief Description: The Transcript code to  code to create a collection of Course to perform 
record adding, deleting, sorting, searching, and printing operations
*********************************************************************************/
import java.util.*;

public class Transcript {//transcript
	
	ArrayList<Course> courses;//make a new array list
	public Transcript()
	{
		courses = new ArrayList<Course>();
	}
	public void addRecord(Course course)//add method
	{
		courses.add(course);
	} 
	public boolean delRecord(String studentName)//delete method
	{
		boolean deleted = false;
		
		Course findRecord = searchRecords(studentName); 
		if (findRecord!=null)
		{
			courses.remove(findRecord);
			deleted = true;
		}
		return deleted;
	}
	public void sortRecords()//sort method
	{
		Collections.sort(courses);
	}
	public Course searchRecords(String studentName)//search the records
	{
		    for (Course course : this.courses) {
		        if (course.getStudentName().equals(studentName)) {
		        	
		            return course;
		        }
		    }
		    return null;
		
	}
	
	public void printRecords()//print all records
	{
		 for (int i = 0; i < courses.size(); i++) 
	            System.out.println(courses.get(i).getStudentName()); 
	}
	
}
