class Player{
    private String name;
    Card[] hand = new Card[2];
    private int score = 0;

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

    public void setName(String n){
        name = n;
    }
}