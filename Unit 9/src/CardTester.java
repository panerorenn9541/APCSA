/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card One = new Card("King", "Spades", 13);
		One.matches(One);
		System.out.println(One.toString());
		
		Card Two = new Card("Queen", "Diamonds", 12);
		Two.matches(One);
		System.out.println(Two.toString());
		
		Card Three = new Card("Jack", "Clubs", 11);
		Three.matches(Two);
		System.out.println(Three.toString());
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
	}
}
