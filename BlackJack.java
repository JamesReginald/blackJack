import java.util.ArrayList;
import java.util.Random;

class BlackJack{
    public static void main(String[] args) {
        int numOfPlayers;
        System.out.println("Ho many players do we have?");
        

        try{
            Scanner sc = new Scanner(System.in);
            numOfPlayers = Integer.parseInt(sc);
            System.out.println(numOfPlayers);

        } catch(Exception ex){
            ex.printStackTrace();
        }

    


        Deck deck = new Deck();
        ArrayList<Card> d = deck.createDeck();

        Card c_1 = deck.getRandomCard(d);
        Card c_2 = deck.getRandomCard(d);
        Card c_3 = deck.getRandomCard(d);
        Card c_4 = deck.getRandomCard(d);
        
        Player playerOne = new Player();
        Player playerTwo = new Player();


// first pick
        System.out.println(" ");
        System.out.println("First draw");

        playerOne.pickFirstCard(c_1);
        playerTwo.pickFirstCard(c_3);


        // second pick
        System.out.println(" ");
        System.out.println("second draw");
        playerOne.pickSecondCard(c_2);
        int playerOneScore = playerOne.getScore(playerOne.hand);

        playerTwo.pickSecondCard(c_4);
        int playerTwoScore = playerTwo.getScore(playerTwo.hand);

        System.out.println(" ");
        System.out.println("show cards");
                
        playerOne.showFirstCard("playerOne");
        playerTwo.showFirstCard("playerTwo");

        if(playerOneScore == 21 || playerTwoScore == 21){
            System.out.println("We've got black Jack");
        } 

        if(playerOneScore < playerTwoScore){
            System.out.println("Player two wins");
        } else if(playerOneScore> playerTwoScore){
            System.out.println("Player one wins");
        } else{
            System.out.println("it's a draw");
        }     
                
            }
        }