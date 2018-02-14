//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Lab08g
{
	public static void main ( String[] args )
	{
		//add test cases
		LoopStats First = new LoopStats();
		First.setNums(1, 5);
		System.out.println(First.toString());
		
		LoopStats Second = new LoopStats();
		Second.setNums(2, 8);
		System.out.println(Second.toString());
		
		LoopStats Third = new LoopStats();
		Third.setNums(5, 15);
		System.out.println(Third.toString());
	}
}