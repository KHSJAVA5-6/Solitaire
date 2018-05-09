// Card3.java
// 10-04-12 by Leon Schram
// The third <Card> class adds a <toString> method so that
// attribute values can be easily displayed.


public class Card3
{

	private int cardNumber;
	private String cardSuit;
	private String cardName;

	public Card3(int cN, String cS)
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

	public String toString()
	{
		String cardInfo = "";
		cardInfo += "cardNumber:  " + getCardNumber() + "\n";
		cardInfo += "cardSuit:    " + getCardSuit() + "\n";
		cardInfo += "cardName:    " + getCardName() + "\n";
		return cardInfo;
	}

}

