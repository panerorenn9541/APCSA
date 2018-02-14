//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Lab03c
{
	public static void main( String[] args )
   {
   	//add test cases
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a ::  ");
		int first = keyboard.nextInt();
		System.out.print("Enter b ::  ");
		int second = keyboard.nextInt();
		System.out.print("Enter c ::  ");
		int third = keyboard.nextInt();
		
		Quadratic One = new Quadratic();
		One.setEquation(first, second, third);
		One.calcRoots();
		One.print();
		
		
		Scanner keyboard1 = new Scanner(System.in);
		System.out.print("Enter a ::  ");
		int fourth = keyboard1.nextInt();
		System.out.print("Enter b ::  ");
		int fifth = keyboard1.nextInt();
		System.out.print("Enter c ::  ");
		int sixth = keyboard1.nextInt();
		
		Quadratic Two = new Quadratic();
		Two.setEquation(fourth,  fifth,  sixth);
		Two.calcRoots();
		Two.print();
		
		
		Scanner keyboard2 = new Scanner(System.in);
		System.out.print("Enter a ::  ");
		int seventh = keyboard2.nextInt();
		System.out.print("Enter b ::  ");
		int eighth = keyboard2.nextInt();
		System.out.print("Enter c ::  ");
		int ninth = keyboard2.nextInt();
		
		Quadratic Three = new Quadratic();
		Three.setEquation(seventh,  eighth,  ninth);
		Three.calcRoots();
		Three.print();
	}
}