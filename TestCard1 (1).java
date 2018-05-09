// TestCard1.java
// 10-04-12 by Leon Schram
// This program tests the <Card1> class.


public class TestCard1
{
	public static void main(String[] args)
	{
		Card1 card = new Card1("7c.gif");
		System.out.println(card.getCardName());
		card.setCardName("CardImages/10s.spades");
		System.out.println(card.getCardName());
	}
}

