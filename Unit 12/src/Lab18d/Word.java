package Lab18d;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

import java.util.ArrayList;

public class Word implements Comparable<Word>
{
	private String word;

	public Word( String s )
	{
		word = s;

	}

	public int compareTo( Word rhs )
	{
		Word obj = (Word)rhs;
		if(word.length()>obj.word.length())
		{
			return 1;
		}
		else if(word.length()<obj.word.length())
		{
			return -1;
		}
		else if(word.length() == obj.word.length())
		{
			for(int i = 0; i<word.length(); i++)
			{
				if(word.charAt(i)>obj.word.charAt(i))
				{
					return 1;
				}
				else if(word.charAt(i)<obj.word.charAt(i))
				{
					return -1;
				}
			}
		}
		
		return 0;
	}

	public String toString()
	{
		return word;
	}
}