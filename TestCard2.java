// TestCard2.java
// 10-04-12 by Leon Schram
// This program tests the <Card2> class.


class TestCard2
{
	public static void main(String[] args)
	{
		int cardNumber = 7;
		String cardSuit = "c";
		Card2 card = new Card2(cardNumber,cardSuit);
		System.out.println(card.getCardNumber());
		System.out.println(card.getCardSuit());
		System.out.println(card.getCardName());
	}
}

