//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Lab14d
{
	public static void main( String args[] )
	{
		//add test cases
		Grades First = new Grades();
		double[] one = {100, 90, 85, 72.5, 95.6};
		First.setGrade(one);
		System.out.print(First.toString());
		
		Grades Second = new Grades();
		double[] two = {50, 100, 80};
		Second.setGrade(two);
		System.out.print(Second.toString());
		
		Grades Third = new Grades();
		double[] Three = {93.40, -90, 90};
		Third.setGrade(Three);
		System.out.print(Third.toString());
		
		Grades Fourth = new Grades();
		double[] Four = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		Fourth.setGrade(Four);
		System.out.print(Fourth.toString());
	}
}