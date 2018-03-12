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

public class MadLib
{
	private ArrayList<String> verbs;
	private ArrayList<String> nouns;
	private ArrayList<String> adjectives;
	
	public MadLib()
	{
		verbs = new ArrayList<String>();
		nouns = new ArrayList<String>();
		adjectives = new ArrayList<String>();
	}

	public MadLib(String fileName)
	{
		//load stuff
		this();
		
		loadNouns();
		loadVerbs();
		loadAdjectives();
		
		try{
			Scanner file = new Scanner(new File(fileName));
			while(file.hasNext())
			{
				String symbol = file.next();	
			}
		
		
		
		
		
		
	
		
		}
		catch(Exception e)
		{
			out.println("Houston we have a problem!");
		}
		
	}

	public void loadNouns()
	{
		try{
			Scanner file = new Scanner(new File("H:\\APCS\\Unit10\\Unit10-2016\\Unit10-Assignments\\Lab16d\\nouns.dat"));
			int counter = 0;
			while(file.hasNext())
			{
				String symbol = file.next();
				nouns.add(counter, symbol);
				counter = counter+1;
			}
		
		
		
		
		}
		catch(Exception e)
		{
			out.println("Houston we have a problem!");
		}	
		
	}
	
	public void loadVerbs()
	{
		try{
			Scanner file = new Scanner(new File("H:\\APCS\\Unit10\\Unit10-2016\\Unit10-Assignments\\Lab16d\\verbs.dat"));
			int counter = 0;
			while(file.hasNext())
			{
				String symbol = file.next();
				verbs.add(counter, symbol);
				counter = counter+1;
			}
	
	
	
		}
		catch(Exception e)
		{
			out.println("Houston we have a problem!");
		}
	}

	public void loadAdjectives()
	{
		try{
			Scanner file = new Scanner(new File("H:\\APCS\\Unit10\\Unit10-2016\\Unit10-Assignments\\Lab16d\\adjectives.dat"));
			int counter = 0;
			while(file.hasNext())
			{
				String symbol = file.next();
				adjectives.add(counter, symbol);
				counter = counter+1;
			}
	
	
	
		}
		catch(Exception e)
		{
			out.println("Houston we have a problem!");
		}
	}

	public String getRandomVerb()
	{
		int ind = (int) (Math.random()*verbs.size()-1);
		return verbs.get(ind);
	}
	
	public String getRandomNoun()
	{
		int ind = (int) (Math.random()*nouns.size()-1);
		return nouns.get(ind);
	}
	
	public String getRandomAdjective()
	{
		int ind = (int) (Math.random()*adjectives.size()-1);
		return adjectives.get(ind);
	}		

	public String toString()
	{
	   return "The " + getRandomNoun() + " " + getRandomVerb() + " after the " + getRandomAdjective() + " " + getRandomAdjective() + " " + getRandomNoun() + " while the " + getRandomNoun() + " " + getRandomVerb() + " the "+ getRandomNoun() +"\n\n\n";
	}
}