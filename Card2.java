// Card2.java
// 10-14-12 by Leon Schram
// The second <Card> class is now more practical.


public class Card2
{
	private int cardNumber;
	private String cardSuit;
	private String cardName;

	public Card2(int cN, String cS)
	{
		cardNumber = cN;
		cardSuit = cS;
		setCardName();
	}

	public int getCardNumber()
	{
		return cardNumber;
	}

	public String getCardSuit()
	{
		return cardSuit;
	}

	public String getCardName()
	{
		return cardName;
	}

	public void setCardNumber(int cN)
	{
		cardNumber = cN;
	}

	public void setCardSuit(String cS)
	{
		cardSuit = cS;
	}

	public void setCardName()
	{
		cardName = "CardImages/" + cardNumber + cardSuit + ".gif";
	}

}

