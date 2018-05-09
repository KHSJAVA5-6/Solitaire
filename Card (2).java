// Card.java
// 10-09-12 by Leon Schram
// This is the complete <Card> class of the "Dutch Solitaire" game.
// This same unit class is used for Labs 08A, 08B, 08C and 08D.
// The <Card> class is provided to students and should NOT be altered
// until part 4.


import java.awt.Image;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;


public class Card
{

	///// OBJECT ATTRIBUTES ///////////////////////////////////////////

	private String suitLetters;
	private int cardNumber;
	private int suitNumber;
	private String cardSuit;
	private String cardName;
	private Image cardImage;
	private int indexNumber;
	private int xPos;
	private int yPos;


	///// CONSTRUCTORS ///////////////////////////////////////////////

	public Card()
	{
		suitLetters = "cdhs";
		cardNumber = 2;
		suitNumber = 1;
		cardSuit = suitLetters.substring(suitNumber-1,suitNumber);
		indexNumber = 0;
		setCardName();
		cardImage = null;
		xPos = 30;
		yPos = 30;
	}

	public Card(int cN, int sN, int iN)
	{
		suitLetters = "cdhs";
		cardNumber = cN;
		suitNumber = sN;
		cardSuit = suitLetters.substring(suitNumber-1,suitNumber);
		indexNumber = iN;
		setCardName();
		loadCardImage();
		setXPos();
		setYPos();
	}


	///// RETURN GET METHODS /////////////////////////////////////////

	public int getCardNumber()
	{
		return cardNumber;
	}

	public int getSuitNumber()
	{
		return suitNumber;
	}

	public String getCardSuit()
	{
		return cardSuit;
	}

	public int getIndexNumber()
	{
		return indexNumber;
	}

	public String getCardName()
	{
		return cardName;
	}

	public int getX()
	{
		return xPos;
	}

	public int getY()
	{
		return yPos;
	}

	public Image getCardImage()
	{
		return cardImage;
	}


	///// VOID SET METHODS //////////////////////////////////////////

	public void setCardNumber(int cN)
	{
		cardNumber = cN;
	}

	public void setCardSuit(String cS)
	{
		cardSuit = cS;
	}

	public void setSuitNumber(int sN)
	{
		suitNumber = sN;
	}

	public void setIndexNumber(int iN)
	{
		indexNumber = iN;
	}

	public void setCardName()
	{
		cardName = "CardImages/" + cardNumber + cardSuit + ".gif";
	}

	public void setCardName(String cN)
	{
		cardName = cN;
	}

	public void setXPos()
	{
		xPos = 30 + 80 * (indexNumber % 14);
	}

	public void setYPos()
	{
		yPos = 30 + 105 * (indexNumber / 14);
	}

	public void setCardImage(Image cI)
	{
		cardImage = cI;
	}


	///// OTHER METHODS /////////////////////////////////////////////

	public void loadCardImage()
	{
		try
		{
			cardImage = ImageIO.read(new File(cardName));
		}
		catch (IOException e)
		{
			System.out.println(e);
		}
	}

	public String toString()
	{
		String cardInfo = "";
		cardInfo += "cardNumber:  " + getCardNumber() + "\n";
		cardInfo += "suitNumber:  " + getSuitNumber() + "\n";
		cardInfo += "cardSuit:    " + getCardSuit() + "\n";
		cardInfo += "indexNumber: " + getIndexNumber() + "\n";
		cardInfo += "cardName:    " + getCardName() + "\n";
		cardInfo += "xPos:        " + getX() + "\n";
		cardInfo += "yPos:        " + getY() + "\n";
		return cardInfo;
	}

}

