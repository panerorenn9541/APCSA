/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		
		String[] ranks = {"Jack", "Queen"};
		String[] suits = {"Spades", "Diamonds"};
		int[] pointValues = {11, 12};
		Deck d = new Deck(ranks, suits, pointValues);
		d.isEmpty();
		d.size();
		d.deal();
		System.out.println(d.toString());
		
		String[] ranks1 = {"Jack", "Queen", "King"};
		String[] suits1 = {"Spades", "Diamonds"};
		int[] pointValues1 = {11, 12, 13};
		Deck d1 = new Deck(ranks1, suits1, pointValues1);
		d1.isEmpty();
		d1.size();
		d1.deal();
		System.out.println(d1.toString());
		
		String[] ranks11 = {"Jack", "Queen", "King"};
		String[] suits11 = {"Spades", "Diamonds", "Clubs", "Hearts"};
		int[] pointValues11 = {11, 12, 13};
		Deck d11 = new Deck(ranks11, suits11, pointValues11);
		d11.isEmpty();
		d11.size();
		d11.deal();
		System.out.println(d11.toString());
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
	}
}
