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
		
		return number;
	}

	public String toString()
	{
		return roman + "\n";
	}
}