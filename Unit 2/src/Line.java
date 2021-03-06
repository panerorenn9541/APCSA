//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Line
{
	private int xOne,yOne, xTwo, yTwo;
	private double First;
	private double Second;
	private double slope;

	public Line(int x1, int y1, int x2, int y2)
	{
		setCoordinates(0, 0, 0, 0);
		First = 0;
		Second = 0;
		slope = 0;
	}

	public void setCoordinates(int x1, int y1, int x2, int y2)
	{

		xOne=  x1;
		yOne = y1;
		xTwo = x2;
		yTwo = y2;

	}

	public void calculateSlope( )
	{
		First = yTwo-yOne;
		Second = xTwo-xOne;
		slope = First/Second;
	}

	public void print( )
	{
		System.out.printf("The slope is "+ "%.2f\n",slope);
	}
}