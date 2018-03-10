//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class Histogram
{
	private ArrayList<Integer> count;
	private ArrayList<Character> letters;
	private String fileName;

	public Histogram()
	{
		count = new ArrayList<Integer>();
		letters = new ArrayList<Character>();
	}

	public Histogram(char[] values, String fName)
	{
		this();
		fileName = fName;
		for(int i = 0; i< values.length; i++)
		{
			letters.add(values[i]);
		}
		
		out.println("search letters = "+letters);
	}

	public void loadAndAnalyzeFile() throws IOException
	{
		Scanner file = new Scanner(new File("C:\\Users\\pepe\\Desktop\\"+fileName));
		int counter = 0;
			for(int i = 0; i < letters.size(); i++)
			{
				counter = 0;
				while(file.hasNext())
				{
					String sentence = file.next();
					for(int n = 0; n < sentence.length(); n++)
					{
						if(sentence.charAt(n)== letters.get(i))
						{
						counter = counter + 1;
						}
					}
				}
				file.close();
				file = new Scanner(new File("C:\\Users\\pepe\\Desktop\\"+fileName));
				count.add(counter);
			}
	}

	public char mostFrequent()
	{
		int frequent = 0;
		int number = 0;
		for(int i = 0; i<count.size(); i++)
		{
			if(count.get(i)>number)
			{
				frequent = i;
				number = count.get(i);
			}
		}
		return letters.get(frequent);
	}

	public char leastFrequent()
	{
		int least = 0;
		int number = 100000;
		for(int i = 0; i<count.size(); i++)
		{
			if(count.get(i)<number)
			{
				least = i;
				number = count.get(i);
			}
		}
		return letters.get(least);
	}

	public String toString()
	{
	   return fileName
	   + "\n" + letters
	   + "\n" + count + "\n\n\n";
	}
}