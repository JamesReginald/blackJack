
import java.util.ArrayList;
import java.util.Collection;
class Game{
ArrayList<Integer> currentscore;
Card currentCard;

    public void gameStart(ArrayList<Card> cardDeck, ArrayList<Player> players, Deck deck){
        
        System.out.println("");
       try{
        System.out.println("Alright every body ready?[Y/N]");
        String ready =BlackJack.sc.next();
        if(ready.equals("Y")){
            System.out.println("Let's play!!");
            System.out.println("Let's shuffle the cards");
            dealCards(cardDeck, players, deck);
        } else{
            System.out.println("Oke, bye!!");
        }
       } catch(Exception ex){
           ex.printStackTrace();
       }

    }
void checkWin(ArrayList<Player> players, ArrayList<Card> hand){
    for (int i =0 ;i < players.size(); i++){
        int score = players.get(i).setScore(hand);
        currentscore.add(score);
        try{
            Collection.max(currentscore);
        }

    }

}
    public void dealCards(ArrayList<Card> cardDeck, ArrayList<Player> players, Deck deck){
        System.out.println("");
       for (int i = 0; i <players.size(); i++ ){
        Card card = deck.getRandomCard(cardDeck);
        Player player = players.get(i);
        String name = players.get(i).getName();
        players.get(i).getCard(card);
        if(i==0){
            System.out.println(name +" have: ");
            nextCard(player.hand);
            continue;
        }
        System.out.println(name +" has : ");
        nextCard(player.hand);
       }
    }
    public Card nextCard(ArrayList<Card> hand){
        for (int i =0 ; i < hand.size(); i++){
        currentCard = hand.get(i);
       System.out.println(currentCard.type +"-"+ currentCard.face); 
        }
        return currentCard;
    }
}