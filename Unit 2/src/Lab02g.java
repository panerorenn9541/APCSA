//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Lab02g
{
	public static void main( String[] args )
	{
		//add test cases
		Fahrenheit One = new Fahrenheit();
		Fahrenheit Two = new Fahrenheit();
		Fahrenheit Three = new Fahrenheit();
		Fahrenheit Four = new Fahrenheit();
		Fahrenheit Five = new Fahrenheit();
		
		One.setFahrenheit(98.6);
		Two.setFahrenheit(52.30);
		Three.setFahrenheit(82.45);
		Four.setFahrenheit(75.00);
		Five.setFahrenheit(100.00);
		
		One.getCelsius();
		Two.getCelsius();
		Three.getCelsius();
		Four.getCelsius();
		Five.getCelsius();
		
		One.print();
		Two.print();
		Three.print();
		Four.print();
		Five.print();
	}
}