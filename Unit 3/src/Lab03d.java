//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Lab03d
{
	public static void main( String[] args )
	{
		//add test cases
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter X1 ::  ");
		int first = keyboard.nextInt();
		System.out.print("Enter Y1 ::  ");
		int second = keyboard.nextInt();
		System.out.print("Enter X2 ::  ");
		int third = keyboard.nextInt();
		System.out.print("Enter Y2 ::  ");
		int fourth = keyboard.nextInt();
		
		Distance One = new Distance();
		One.setCoordinates(first, second, third, fourth);
		One.calcDistance();
		One.print();
		
		
		Scanner keyboard1 = new Scanner(System.in);
		System.out.print("Enter X1 ::  ");
		int fifth = keyboard1.nextInt();
		System.out.print("Enter Y1 ::  ");
		int sixth = keyboard1.nextInt();
		System.out.print("Enter X2 ::  ");
		int seventh = keyboard1.nextInt();
		System.out.print("Enter Y2 ::  ");
		int eighth = keyboard1.nextInt();
		
		Distance Two = new Distance();
		Two.setCoordinates(fifth, sixth, seventh, eighth);
		Two.calcDistance();
		Two.print();
		
		
		Scanner keyboard2 = new Scanner(System.in);
		System.out.print("Enter X1 ::  ");
		int ninth = keyboard2.nextInt();
		System.out.print("Enter Y1 ::  ");
		int tenth = keyboard2.nextInt();
		System.out.print("Enter X2 ::  ");
		int eleventh = keyboard2.nextInt();
		System.out.print("Enter Y2 ::  ");
		int twelveth = keyboard2.nextInt();
		
		Distance Three = new Distance();
		Three.setCoordinates(ninth, tenth, eleventh, twelveth);
		Three.calcDistance();
		Three.print();
	}
}