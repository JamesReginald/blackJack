

class Player{
   //  private String name;
    int Money = 100;
    int smallBet = 5;
    int bigBet = 25;
    Card[] hand = new Card[2];
    private int score = 0;

   //  public void setName(){
   //    try{
   //       Scanner sc = new Scanner(System.in);
   //       name = sc.nextLine();        
   //       System.out.println(name);
   //       sc.close();
   //   }   catch(Exception ex){
   //       ex.printStackTrace();
   //   }
   // }
   
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
    public void pickFirstCard(Card c){
       hand[0] = c;
    }

    public void showFirstCard(String n){
       System.out.println("hé " + n +"!, your hand is: "+hand[0].type + hand[0].face +" "+ hand[1].type + hand[1].face);
    }

    public void pickSecondCard(Card c){
       hand[1] = c;
    }

    public int getScore(Card[] c){
       score = c[0].value + c[1].value; 
       return score;
    }

   //  public void setName(String n){
   //      name = n;
   //  }
}