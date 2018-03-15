//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

import java.util.ArrayList;

public class GradeBookRunner
{
   public static void main( String args[] )
   {
		System.out.println("Welcome to the Class Stats program!");
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("\n\nWhat is the name of this class?");
		String className = keyboard.nextLine();
		System.out.print("\n\nHow Many Students are in this Class?");
		int numStudents = keyboard.nextInt();
		keyboard.nextLine();
		Class ClassOne = new Class(className, numStudents);
		ArrayList<Student>studentList = new ArrayList<Student>();
		ArrayList<Class>classList = new ArrayList<Class>();
		for(int i = 0; i<numStudents; i++)
		{
			System.out.print("\nWhat is the name of the student?");
			String StudentName = keyboard.nextLine();
			System.out.print("\nWhat are the student's grades?");
			String StudentGrades = keyboard.nextLine();
			Student One = new Student(StudentName, StudentGrades);
			ClassOne.addStudent(i, One);
		
		}
		System.out.println(ClassOne);
		System.out.println("Failure List = " + ClassOne.getFailureList(70));
		System.out.println("Highest Average = " + ClassOne.getStudentWithHighestAverage());
		System.out.println("Lowest Average = " + ClassOne.getStudentWithLowestAverage());
								
		System.out.println(String.format("Class Average = %.2f",ClassOne.getClassAverage()) + "\n\n\n\n");			
		




















	}		
}