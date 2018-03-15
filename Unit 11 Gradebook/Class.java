//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class Class
{
	private String name;
	private Student[] studentList;
	
	public Class()
	{
		name="";
		studentList=new Student[0];
	}
	
	public Class(String name1, int stuCount)
	{
		name = name1;
		studentList = new Student[stuCount];
	}
	
	public void addStudent(int stuNum, Student s)
	{
		studentList[stuNum] = s;
	}
	
	public String getClassName()
	{
	   return name;	
	}
	
	public double getClassAverage()
	{
		double classAverage=0.0;
		for(int i = 0; i<studentList.length; i++)
		{
			classAverage = classAverage + studentList[i].getAverage();
		}
		classAverage = classAverage/studentList.length;

		return classAverage;
	}
	
	public double getStudentAverage(int stuNum)
	{
		return studentList[stuNum].getAverage();
	}

	public double getStudentAverage(String stuName)
	{
		int counter = 0;
		for(int i=0; i<studentList.length; i++)
		{
			if(studentList[i].getName() == stuName)
			{
				counter = i;
			}
		}            
            return studentList[counter].getAverage();
    }
	
	public String getStudentName(int stuNum)
	{
		return studentList[stuNum].getName();
	}

	public String getStudentWithHighestAverage()
	{
		double high = Double.MIN_VALUE;
		String hName ="";
		for (int i = 0; i<studentList.length; i++)
		{
			if(studentList[i].getAverage()>high)
			{
				high = studentList[i].getAverage();
				hName = studentList[i].getName();
			}
		}
		

		return hName;
	}

	public String getStudentWithLowestAverage()
	{
		double low = Double.MAX_VALUE;
		String hName ="";		
		for (int i = 0; i<studentList.length; i++)
		{
			if(studentList[i].getAverage()<low)
			{
				low = studentList[i].getAverage();
				hName = studentList[i].getName();
			}
		}
		


		return hName;
	}
	
	public String getFailureList(double failingGrade)
	{
		String output="";
		for (int i = 0; i<studentList.length; i++)
		{
			if(studentList[i].getAverage()<70)
			{
				output = output + studentList[i].getName() + " ";
			}
		}




		return output;
	}
	
	public String sortStudents()
	{
		for (int i = 0; i<studentList.length; i++)
		{
			for (int k = i+1; k<studentList.length; k++)
			{
				if(studentList[i].compareTo(studentList[k]) == 1)
				{
					Student holder = studentList[i];
					studentList[i] = studentList[k];
					studentList[k] = holder;
				}
			}
		}
		String sorted = "";
		for (int n = 0; n<studentList.length;n++)
		{
			sorted = sorted + studentList[n].toString() + "\t" + studentList[n].getAverage() + "\n";
		}
		return sorted;
	}

	

	public String toString()
	{
		String output=""+getClassName()+"\n";
		for (int i = 0; i<studentList.length; i++)
		{
			output = output + studentList[i].toString() + "\t" + studentList[i].getAverage() + "\n";
		}



		return output;
	}  	
}