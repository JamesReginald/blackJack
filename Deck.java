
import java.util.ArrayList;

public class Deck {
	String[] typeList = {"H", "D" ,"S", "C"};
    String[] faceList = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"}; 
    int[] valueList = {2,3,4,5,6,7,8,9,10,10,10,10,11};
    ArrayList<Card> cardDeck = new ArrayList<>();
    

    
    public ArrayList<Card> createDeck() {
    	for(int i = 0; i< valueList.length; i++){
            for(int j = 0; j < typeList.length; j++){
                
                Card card = new Card();
                card.setCard(typeList[j], faceList[i], valueList[i]);
                System.out.print(card.type +"-"+ card.face +" ");
                
               cardDeck.add(card);
            }
        };
       
        return cardDeck;
    }

    Card getRandomCard(ArrayList<Card> d){
        int index = (int)(Math.random()*d.size());
        Card yourCard = d.get(index);
        d.remove(index);
        return yourCard;
    }

}

