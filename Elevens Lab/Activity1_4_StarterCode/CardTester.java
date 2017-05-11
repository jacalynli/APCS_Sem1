/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card card1 = new Card("Ace", "Hearts", 1);
		Card card2 = new Card("King", "Spades", 13);
		Card card3 = new Card("Queen", "Diamond", 12);
		
		System.out.print(card1 + "\n");
		System.out.print(card2 + "\n");
		System.out.print(card3 + "\n");
		
		System.out.println(card1.matches(card2));
		System.out.println(card1.matches(card1));
	}
}
