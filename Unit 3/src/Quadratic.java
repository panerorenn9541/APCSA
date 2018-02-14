//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Quadratic
{
	private int a, b, c;
	private double rootOne;
	private double rootTwo;

	public Quadratic()
	{
		setEquation(0, 0, 0);
		rootOne = 0;
		rootTwo = 0;
	}

	public Quadratic(int quadA, int quadB, int quadC)
	{
		setEquation(quadA, quadB, quadC);
	}

	public void setEquation(int quadA, int quadB, int quadC)
	{
		a = quadA;
		b = quadB;
		c = quadC;
 	}

	public void calcRoots( )
	{
		rootOne = (-b+sqrt((b*b)+(-4*a*c)))/(2*a);
		rootTwo = (-b-sqrt((b*b)+(-4*a*c)))/(2*a);
	}

	public void print( )
	{
		System.out.println();
		System.out.printf("rootone :: "+ "%.3f\n",rootOne);
		System.out.printf("roottwo :: "+ "%.3f\n",rootTwo);
		System.out.println();
		System.out.println();
	}
}