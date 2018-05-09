// TestCard.java
// 10-05-12 by Leon Schram
// This program tests that the information in the <Card> class imports
// the correct card image file.


import java.awt.Graphics;
import java.applet.Applet;


public class TestCard extends Applet
{

	private Card card;

	public void init()
	{
		int cardNumber = 10;
		int suitNumber = 4;
		int indexNumber = 25;
		card = new Card(cardNumber,suitNumber,indexNumber);
		System.out.println(card);
	}

   	public void paint(Graphics g)
   	{
  		g.drawImage(card.getCardImage(),card.getX(),card.getY(),this);
   	}

}

