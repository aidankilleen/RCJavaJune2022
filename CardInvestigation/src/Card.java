
public class Card {

	// member variables (properties,  fields)
	public int suit;  // (H=1, S=2, D=3, C=4)
	public int value; // (A=1, 2=2, 3=3, ..., 10=10, J=11, Q=12, K=13)
	
	// member functions (methods)
	// function to create a new object (constructor)
	public Card() {
		suit = 1;
		value = 1;
	}
	
	public Card(int suit, int value) {
		this.suit = suit;
		this.value = value;
	}
	
	// function to display a card
	public void display() {
		
		String c = "";
		
		switch(value) {
		case 1:
			// c = c + "A" is equivalent to c+= "A"
			c += " A";
			break;
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
			c += " " + value;
			break;			
		case 10:

			c += "" + value;
			break;
		case 11:
			c += " J";
			break;
		case 12:
			c += " Q";
			break;
		case 13:
			c += " K";
			break;
		default:
			c += " ?";
			break;
		}
		
		if (suit == 1) {
			c = c + "H ";
		} else if (suit == 2) {
			c = c + "S ";
		} else if (suit == 3) {
			c = c + "D ";
		} else if (suit == 4) {
			c = c + "C ";
		} else {
			c = c + "? ";
		}
		System.out.print(c);
	}
	
	// we often use the main method for testing our class
	public static void main(String[] args) {
	
		System.out.println("Playing Card Investigation");

		// test every card:
		Card c;
		
		for (int suit = 1; suit <= 4; suit++) {
			for (int value = 1; value <= 13; value++) {
				c = new Card(suit, value);
				c.display();
			}
			System.out.println();
		}
	}

}
