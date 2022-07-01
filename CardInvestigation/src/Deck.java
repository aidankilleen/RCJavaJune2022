
public class Deck {

	// member variables 
	public Card[] cards = new Card[52];
	
	// member functions
	
	// constructor(s)
	public Deck() {
		
		int count = 0;
		for (int suit=1; suit <= 4; suit++) {
			for (int value=1; value <= 13; value++) {
				
				cards[count++] = new Card(suit, value);
			}
		}
	}
	// display
	public void display() {
		for (int i = 0; i < cards.length; i++) {
			cards[i].display();
			
			if (i == 12 || i == 25 || i == 38 || i == 51) {
				System.out.println();
			}
		}
		System.out.println();
	}
	// shuffle 
	public void shuffle(int count) {
		
		for (int i=0; i<count; i++) {
			int r1 = (int)(Math.random() * 52);
			int r2 = (int)(Math.random() * 52);
			
			// swap the card at r1 with the card at r2
			Card t = cards[r1];
			cards[r1] = cards[r2];
			cards[r2] = t;
		}
	}
	public static void main(String[] args) {
		
		Deck deck = new Deck();
		deck.display();
		
		deck.shuffle(1);
		deck.display();
		
		deck.shuffle(10);
		deck.display();
		
		deck.shuffle(100);
		deck.display();

	}

}
