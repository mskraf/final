/* Morrison Kraft
 CS 110
 12/4/14
 gui card game
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;
public class GUICard extends JFrame
{
   
   private JButton button;
   private JLabel pic;
   private JLabel pic2;
   private ImageIcon front,back,front2;
   private War game = new War();
   private int rank;
   private int suit;
   private JLabel title;
   private JLabel win;
   
   public GUICard(String s)
   
   {
      super(s);
      setLayout(new FlowLayout());
      button = new JButton("flip");
      button.addActionListener(new ButtonListener());
      add(button);
      
      Card[] cards = new Card[2];
      cards = game.round();
      front = new ImageIcon("cardPics(1)/"+GetfileName(cards[0]));
      
      back = new ImageIcon("cardPics(1)/back.jpg");  
      front2 = new ImageIcon("cardPics(1)/"+GetfileName(cards[1]));

      pic = new JLabel(back);
      pic2 = new JLabel(back);     
      add(pic);
      add(pic2);
      title = new JLabel("Game in progress");
      title.setFont(new Font("HELVETICA",Font.ITALIC,36));
      add(title);
      }
      
   public String GetfileName(Card c)
   {
   
   String rankStr="";
   String suitStr="";
 


for (int count = 0; count < 52; count++)
{

rank = c.getRank();
suit = c.getSuit();

   if (rank == 9)
     
    {
    rankStr = "jack";
    
    }
   else if(rank== 10)
     {
      rankStr = "queen";
      
      }
   else if(rank == 11)
      {
      rankStr = "king";
      
      }
   else if(rank == 12)
      {
      rankStr = "ace";
     
      }
   else if(rank== 8)
      {
      rankStr = "10";
     
      }
   else if(rank == 7)
      {
      rankStr = "9";
    
      
      }
   else if(rank == 6)
    {
      rankStr = "8";
   
   }
   else if(rank== 5)
    {
      rankStr = "7";
   
   }
   else if(rank == 4)
   {
      rankStr = "6";
   
   }
   else if(rank == 3)
   { 
      rankStr = "5";
  
   }
   if(rank== 2)
    {
      rankStr = "4";
   
  
   }
    if(rank == 1)
    {
      rankStr = "3";
     
   
   }
    if(rank == 0)
    {
      rankStr = "2";
   
   
   }

   

   if(suit== 0)
   {
    suitStr = "h";
 
   }
   else if (suit == 1)
    {
      suitStr = "c";
  
   }
   else if (suit == 2)
   {
      suitStr = "s";
   
   }
   else if (suit == 3)
    {
      suitStr = "d";
  
   }
   else 
   { 
  
   suitStr= Integer.toString(suit);
          
   }
  }
   
   return  rankStr+suitStr+".jpg";   
   }
   //class to handle button press
   class ButtonListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
      
         Card[] cards = new Card[2];
         cards = game.round();
         front = new ImageIcon("cardPics(1)/"+GetfileName(cards[0]));
         front2 = new ImageIcon("cardPics(1)/"+GetfileName(cards[1]));

         if (pic.getIcon() == back)
            pic.setIcon(front);
            
         else
            pic.setIcon(back);
            
            
         if (pic2.getIcon() == back)
            pic2.setIcon(front2);
         else
            pic2.setIcon(back);
         if(game.winner()==1)
         {
         win = new JLabel("Game in progress");
      win.setFont(new Font("HELVETICA",Font.ITALIC,36));
      add(win);
         }
         else if(game.winner()==-1)
           {
           win = new JLabel("Game in progress");
      win.setFont(new Font("HELVETICA",Font.ITALIC,36));
      add(win);
      }
      }
   }
   
   public static void main(String [] args)
   {
  
      JFrame frame = new GUICard("Nsesws Fnr3asme ...");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.pack();
      frame.setVisible(true);
   
   }
		

}
