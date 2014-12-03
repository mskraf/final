/* Morrison Kraft
 CS 110
 10/6/14
 card class
*/

public class Card
 {
// inr for rank and suit
 private int RANK;
 private int SUIT;
 //arays of suit and rank
 private String[] Suit = {" Hearts", " Clubs", " Spades", " Diamonds"};
 private String[] Rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
 // another int for rank and suit
 private int suit;
 private int rank;
 // seting == for users value

 public Card (int SUIT,int RANK)
 {
 rank = RANK;
 suit = SUIT;
 // getting suit
 }
 public int getSuit()
 {
 return suit;
 }
 // getting rank
  public int getRank()
 {
 return rank;
 // converting to string
 }
 public String toString()
 {
 return ( Rank[rank] + Suit[suit] );
 }
 // checking if random card rank == users
 public boolean equals(int comrank, int c)
  {
   boolean status;
   if (comrank == c)
   status = true;
   else
   status = false;
   return status;
   }  
}
	
