//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class CharacterAnalyzer
{
	private char theChar;
	private String case1;
	private String type;

	public CharacterAnalyzer()
	{
		setChar((char) 0);
		theChar =(char) 0;
	}

	public CharacterAnalyzer(char c)
	{
		setChar((char) c);
	}

	public void setChar(char c)
	{
		theChar = c;
		case1 = "";
		type = "";
	}

	public char getChar()
	{
		return theChar;
	}

	public boolean isUpper( )
	{
	    if (theChar<97)
	    {
	        if (theChar>64)
	        {
	        	case1 = "uppercase";
	        	type = "letter";
	            return true;
	        }
	    }
	    return false;
	}

	public boolean isLower( )
	{
	    if (theChar>96)
	    {
	        if (theChar<123)
	        {
	        	case1 = "lowercase";
	        	type = "letter";
	            return true;
	        }
	    }
	    return false;
	}
	public boolean isNumber( )
	{
	    if (theChar>48)
	    {
	        if (theChar<58)
	        {
	        	case1 = "";
	        	type = "number";
	            return true;
	        }
	    }
	    return false;
	}

	public int getASCII( )
	{
		return theChar;
	}

	public String toString()
	{
		return getChar() + " is a(n) " + case1 + " " + type + ". ASCII == " + getASCII() + "\n";	  
	}
}