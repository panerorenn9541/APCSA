package Lab18e;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import Lab18e.Word;

import java.util.Arrays;
import static java.lang.System.*;

public class Lab18e
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("C:\\Users\\pepe\\Desktop\\lab18e.dat"));

		int size = file.nextInt();
		ArrayList<Word> One = new ArrayList<Word>(size);
		for(int i = 0; i<size+1; i++)
		{
			String str = file.nextLine();
			Word First = new Word(str);
			One.add(i, First);
		}
		for(int n = 0; n<size+1; n++)
		{
			for(int p = n; p<size;p++)
			{
				if(One.get(n).compareTo(One.get(p+1)) == 1)	
				{
					Word holder = One.get(n);
					One.set(n, One.get(p+1));
					One.set(p+1, holder);
				}
			}
		}
		for(int r = 0; r<One.size();r++)
		{
			System.out.println(One.get(r));
		}
	}

}