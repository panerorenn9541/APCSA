//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;
import java.io.File;

public class GradeBookFileRunner
{
   public static void main( String args[] ) throws Exception
   {
		out.println("Welcome to the Class Stats program!\n");	
		
		String StudentName = "";
		String StudentGrades = "";
		int size = 0;
		
		Scanner file1 = new Scanner(new File("C:\\Users\\pepe\\Desktop\\gradebook.dat"));
		String ClassName = file1.nextLine();
		size = (int)file1.nextInt();
		Class theClass = new Class(ClassName, size);
		Student [] StuList = new Student [size]; 
		file1.nextLine();
		for(int i = 0; i<StuList.length; i++)
		{
			StudentName = file1.nextLine();
			StudentGrades = file1.nextLine();
			Student One = new Student(StudentName, StudentGrades);
			theClass.addStudent(i, One);
		
		}
		System.out.println(theClass);
		System.out.println("Failure List = " + theClass.getFailureList(70));
		System.out.println("Highest Average = " + theClass.getStudentWithHighestAverage());
		System.out.println("Lowest Average = " + theClass.getStudentWithLowestAverage());
								
		System.out.println(String.format("Class Average = %.2f",theClass.getClassAverage()) + "\n\n\n\n");			
		
		
		
		
	
		Scanner file2 = new Scanner(new File("C:\\Users\\pepe\\Desktop\\gradebook.dat"));
		ClassName = file2.nextLine();
		size = (int)file2.nextInt();
		Class theClass2 = new Class(ClassName, size);
		Student [] StuList2 = new Student [size]; 
		file2.nextLine();
		for(int i = 0; i<StuList2.length; i++)
		{
			StudentName = file2.nextLine();
			StudentGrades = file2.nextLine();
			Student One = new Student(StudentName, StudentGrades);
			theClass2.addStudent(i, One);
		
		}
		theClass2.sortStudents();
		System.out.println(theClass2);
		System.out.println("Failure List = " + theClass2.getFailureList(70));
		System.out.println("Highest Average = " + theClass2.getStudentWithHighestAverage());
		System.out.println("Lowest Average = " + theClass2.getStudentWithLowestAverage());
								
		System.out.println(String.format("Class Average = %.2f",theClass2.getClassAverage()));			
		
	}
}





		
