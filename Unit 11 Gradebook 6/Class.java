//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class Class
{
	private String name;
	private ArrayList<Student>studentList;
	
	public Class()
	{
		name="";
	}
	
	public Class(String name1, int stuCount)
	{
		name = name1;
		studentList = new ArrayList<Student>();
		
	}
	public void addStudent(int stuNum, Student s)
	{
		studentList.add(stuNum, s);
	}
	
	public String getClassName()
	{
	   return name;	
	}
	
	public double getClassAverage()
	{
		double classAverage=0.0;
		for(int i = 0; i<studentList.size(); i++)
		{
			classAverage = classAverage + studentList.get(i).getAverage();
		}
		classAverage = classAverage/studentList.size();

		return classAverage;
	}
	
	public double getStudentAverage(int stuNum)
	{
		return studentList.get(stuNum).getAverage();
	}

	public double getStudentAverage(String stuName)
	{
		int counter = 0;
		for(int i=0; i<studentList.size(); i++)
		{
			if(studentList.get(i).getName() == stuName)
			{
				counter = i;
			}
		}            
            return studentList.get(counter).getAverage();
    }
	
	public String getStudentName(int stuNum)
	{
		return studentList.get(stuNum).getName();
	}

	public String getStudentWithHighestAverage()
	{
		double high = Double.MIN_VALUE;
		String hName ="";
		for (int i = 0; i<studentList.size(); i++)
		{
			if(studentList.get(i).getAverage()>high)
			{
				high = studentList.get(i).getAverage();
				hName = studentList.get(i).getName();
			}
		}
		

		return hName;
	}

	public String getStudentWithLowestAverage()
	{
		double low = Double.MAX_VALUE;
		String hName ="";		
		for (int i = 0; i<studentList.size(); i++)
		{
			if(studentList.get(i).getAverage()<low)
			{
				low = studentList.get(i).getAverage();
				hName = studentList.get(i).getName();
			}
		}
		


		return hName;
	}
	
	public String getFailureList(double failingGrade)
	{
		String output="";
		for (int i = 0; i<studentList.size(); i++)
		{
			if(studentList.get(i).getAverage()<70)
			{
				output = output + studentList.get(i).getName() + " ";
			}
		}




		return output;
	}
	
	public String sortStudents()
	{
		for (int i = 0; i<studentList.size(); i++)
		{
			for (int k = i+1; k<studentList.size(); k++)
			{
				if(studentList.get(i).compareTo(studentList.get(k)) == 1)
				{
					Student holder = studentList.get(i);
					studentList.set(i, studentList.get(k));
					studentList.set(k,  holder);
				}
			}
		}
		String sorted = "";
		for (int n = 0; n<studentList.size();n++)
		{
			sorted = sorted + studentList.get(n).toString() + "\t" + studentList.get(n).getAverage() + "\n";
		}
		return sorted;
	}

	

	public String toString()
	{
		String output=""+getClassName()+"\n";
		for (int i = 0; i<studentList.size(); i++)
		{
			output = output + studentList.get(i).toString() + "\t" + studentList.get(i).getAverage() + "\n";
		}



		return output;
	}  	
}