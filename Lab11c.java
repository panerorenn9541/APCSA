import static java.lang.System.*;

public class Lab11c
{
   public static void main( String args[] )
   {
	   TriangleThree First = new TriangleThree();
	   First.setTriangle("A", 3);
	   out.print(First.toString());
	   
	   TriangleThree Second = new TriangleThree();
	   Second.setTriangle("X", 7);
	   out.print(Second.toString());

	   TriangleThree Third = new TriangleThree();
	   Third.setTriangle("R", 1);
	   out.print(Third.toString());

	   TriangleThree Fourth = new TriangleThree();
	   Fourth.setTriangle("T", 5);
	   out.print(Fourth.toString());
	   
	   TriangleThree Fifth = new TriangleThree();
	   Fifth.setTriangle("W", 4);
	   out.print(Fifth.toString());
	   
	}
}