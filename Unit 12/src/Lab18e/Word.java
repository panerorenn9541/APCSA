package Lab18e;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;


public class Word implements Comparable<Word>
{
	private String word;

	public Word( String s)
	{
		word = s;

	}

	private int numVowels()
	{
		String vowels = "AEIOUaeiou";
		int vowelCount=0;
		for(int i = 0; i<word.length();i++)
		{
			for(int n = 0; n<vowels.length();n++)
			{
				if(vowels.charAt(n) == word.charAt(i))
				{
					vowelCount = vowelCount + 1;
				}
			}
		}

		return vowelCount;
	}

	public int compareTo(Word rhs)
	{
		Word obj = (Word)rhs;
		if(numVowels()>obj.numVowels())
		{
			return 1;
		}
		else if(numVowels()<obj.numVowels())
		{
			return -1;
		}
		else if (numVowels() == obj.numVowels())
		{
			if(word.length()>obj.word.length())
			{
				for(int i = 0; i<word.length();i++)
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
			else if(obj.word.length()>word.length()||obj.word.length()==word.length())
			{
				for(int n = 0; n<obj.word.length();n++)
				{
					if(word.charAt(n)>obj.word.charAt(n))
					{
						return 1;
					}
					else if(word.charAt(n)<obj.word.charAt(n))
					{
						return -1;
					}
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