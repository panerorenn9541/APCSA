//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Lab02f
{
	public static void main( String[] args )
   {
		//add test cases
		Line One = new Line(1, 9, 14, 2);
		Line Two = new Line (1, 7, 18, 3);
		Line Three = new Line (6, 4, 2, 2);
		Line Four = new Line (4, 4, 5, 3);
		Line Five = new Line (1, 1, 2, 9);
		
		One.setCoordinates(1, 9, 14, 2);
		Two.setCoordinates(1, 7, 18, 3);
		Three.setCoordinates(6, 4, 2, 2);
		Four.setCoordinates(4, 4, 5, 3);
		Five.setCoordinates(1, 1, 2, 9);
		
		One.calculateSlope();
		Two.calculateSlope();
		Three.calculateSlope();
		Four.calculateSlope();
		Five.calculateSlope();
		
		One.print();
		Two.print();
		Three.print();
		Four.print();
		Five.print();
	}
}