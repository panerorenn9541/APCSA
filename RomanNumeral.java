//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class RomanNumeral
{
	private Integer number;
	private String roman;

	private final static int[] NUMBERS= {1000,900,500,400,100,90,
													50,40,10,9,5,4,1};

	private final static String[] LETTERS = {"M","CM","D","CD","C","XC",
												  "L","XL","X","IX","V","IV","I"};

	public RomanNumeral(String str)
	{
		setRoman("");


	}

	public RomanNumeral(Integer orig)
	{
		setNumber(0);


	}

	public void setNumber(Integer num)
	{
		number = num;




	}

	public void setRoman(String rom)
	{
		roman = rom;


	}

	public Integer getNumber()
	{
		int number = 0;
		for (int i = 0; i<LETTERS.length; i++)
		{
			while (roman != "")
			{
				if (roman.startsWith(LETTERS[i]))
				{
					roman.replaceFirst(LETTERS[i],"");
					number = number + NUMBERS[i];
				}
			}
		}
		return number;
	}

	public String toString()
	{
		String roman = "";
	  for(int i = 0; i< NUMBERS.length; i++)
	  {
	    while (number >= NUMBERS[i])
	    {
	      roman = roman+LETTERS[i];
	      number = number-NUMBERS[i];
	    }
	  }
		return roman + "\n";
	}
}