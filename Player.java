
import java.util.ArrayList;

class Player{
   private String name;
    int Money = 100;
    int smallBet = 5;
    int bigBet = 25;
    ArrayList<Card> hand = new ArrayList<>();
    private int score = 0;

    public int setScore(ArrayList<Card> hand){
      for (int i = 0; i < hand.size(); i++){
         score = score + hand.get(i).value;
      }
       return score;
    }

   void SmallBet(int m){
      if(m >= smallBet){
         m = m - smallBet;
      } 
   }

   void BigBet(int m){
      if(m >= bigBet){
         m = m - bigBet;
      }
   }

   void getCard(Card c){
      hand.add(c);
   }


   void placeBet(int m, int bet){
      System.out.println("in bet" + bet);
      switch(bet){
         case 0:
         break;
         case 1: SmallBet(m);
         break;
         case 2: BigBet(m);
         break;}
   }
  
   

    public String getName(){
       return name;
    }
    public void setName(String n){
        name = n;
    }
}