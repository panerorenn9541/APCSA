import static java.lang.System.*;

public class TriangleThree
{
   private int size;
   private String letter;

	public TriangleThree()
	{
		size = 0;
		letter = "";
		setTriangle("", 0);
	}

	public TriangleThree(int count, String let)
	{
		setTriangle(let, count);
	}

	public void setTriangle( String let, int sz )
	{
		letter = let;
		size = sz;
	}

	public String getLetter()
	{
		return letter;
	}

	public String toString()
	{
		String output="";
		for (int i = 1; i<=size; i++)
		{
			int k = size-i;
			while (k>0)
			{
				output = output +" ";
				k = k-1;
			}
			
			int j = i;
			while (j>0)
			{
				output = output +letter;
				j = j-1;
			}
		output = output+"\n";
			
		}
		return output+"\n";
	}
}