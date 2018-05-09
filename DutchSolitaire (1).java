// DutchSolitaire.java
// Created  10-09-12 by Leon Schram
// Modified 02-25-13 by John Schram
// This is the student-provided file for Labs 08A, 08B & 08C.
// This file tests the <Card> class and the <CardDeck> class
// during the first 3 parts of the Dutch Solitaire project
// and should NOT be altered until part 4.


import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;


public class DutchSolitaire
{
	public static void main(String args[])
	{
		DutchSolitaireGame game = new DutchSolitaireGame();
		game.addWindowListener(new WindowAdapter()
		{public void windowClosing(WindowEvent e)
		{System.exit(0);}});
		game.setSize(1190,520);
		game.show();
	}
}


class DutchSolitaireGame extends Frame
{
	private CardDeck solitaire;
	private Card[] cards;
	private int windowWidth;
	private int windowHeight;


	public DutchSolitaireGame()
	{
		super(" Dutch Solitaire");
		windowWidth = 1190;
		windowHeight = 520;
		solitaire = new CardDeck();
		cards = solitaire.getCards();
	}


   	public void paint(Graphics g)
   	{
   		Graphics2D g2D = (Graphics2D) g;
		g2D.translate(9,36);

		drawGrid(g);
		drawImages(g);
   	}


   	public void drawGrid(Graphics g)
   	{
   		g.setColor(new Color(128,0,64));
   		g.fillRect(0,0,windowWidth,windowHeight);
   	}


   	public void drawImages(Graphics g)
   	{
   		for (Card card: cards)
   			g.drawImage(card.getCardImage(),card.getX(),card.getY(),this);
   	}
}
