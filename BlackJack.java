import java.util.ArrayList;
import java.util.Scanner;
 
class BlackJack{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Welcome by Black Jack");
        System.out.println("");
       Deck deck = new Deck();
       ArrayList<Card> d = deck.createDeck();
       System.out.println("");
       System.out.println("");
       GroupPlayer group = new GroupPlayer();
       //User user = new User();
       ArrayList<Player> players = group.setGroupSize();
       //int groupSize = players.size();
       
       Game game = new Game();
       game.gameStart(d, players, deck);
       
       
       
      
   }
}