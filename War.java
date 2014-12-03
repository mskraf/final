/* Morrison Kraft
 CS 110
 10/6/14
 card program
*/
import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.List;
import java.util.Iterator;
public class War
{    


private ArrayList<Card> deck = new ArrayList<Card>();
private ArrayList<Card> Player1=new ArrayList<Card>();
private ArrayList<Card> Player2=new ArrayList<Card>();;
public War() 
{  
   int s = 0;
   int j = 0;
   //make deck
    for(s=0;s<4;s++)
         {
          for (j = 0; j < 13; j++) 
            {
            deck.add(new Card(s,j));
            }
          }
      Collections.shuffle(deck);
      int half = deck.size()/2;
      for(int i = 0; i< half; i++)
      {
      Player1.add(deck.remove(0));
      }
      Player2=deck;

}
      
public Card[] round()
{
int h = 0;
Card[] cards = new Card[2];
cards[0] = Player1.remove(0);
cards[1] = Player2.remove(0);

  
  

   if(Player1.get(0).getRank()>Player2.get(0).getRank())
   {
   Player1.add(cards[0]);
   Player1.add(cards[1]);
   }
   
   else if(Player1.get(0).getRank()<Player2.get(0).getRank())
   {
   Player2.add(cards[0]);
   Player2.add(cards[1]);
   }
   else
   {
   Player2.add(cards[0]);
   Player2.add(cards[0]);
   }
//WAR



return cards;
}

public int winner() 
{
int out;
if (Player1.size()==0)
out = 1;
else if (Player2.size()==0)
out=-1;
else
out=0;

return out;
}

}

