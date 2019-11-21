import java.util.ArrayList;


class GroupPlayer {
    
    private int numOfPlayers;
    private boolean groupIsSize;
    ArrayList<Player> group = new ArrayList<>();

    public boolean IsGroupSize(){
        return groupIsSize;
    }
        
    public int setGroupSize(){

        try{
            while(!groupIsSize){
            
            System.out.println("How many players do we have?");
            numOfPlayers = BlackJack.sc.nextInt();
            compileGroup(numOfPlayers);        
            groupIsSize = true;
            }
            
        } catch(Exception ex){
            ex.printStackTrace();
            System.out.println("Wrong answer!! Need a number overhere!!");
            System.out.println("Try again but now do it right");
        } 
        
        return numOfPlayers;
    }

    public ArrayList<Player> compileGroup(int n){
        for (int i =0; i < n; i++){

            if(i == 0){
                User user = new User();
                group.add(user);
            } else{
                SimUser simUser = new SimUser();
                group.add(simUser);
            }
        }
        return group;
    }
}