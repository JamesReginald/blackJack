import java.util.ArrayList;


class GroupPlayer {
    
    private int numOfPlayers;
    private boolean groupIsSize;
    ArrayList<Player> group = new ArrayList<>();

    public boolean IsGroupSize(){
        return groupIsSize;
    }
        
    public ArrayList<Player>  setGroupSize(){

        try{
            while(!groupIsSize){
            
            System.out.println("How many players do we have?");
            numOfPlayers = BlackJack.sc.nextInt();
            group = compileGroup(numOfPlayers);        
            groupIsSize = true;
            }
            
        } catch(Exception ex){
            ex.printStackTrace();
            System.out.println("Wrong answer!! Need a number overhere!!");
            System.out.println("Try again but now do it right");
        } 
        
        return group;
    }

    public ArrayList<Player> compileGroup(int n){
        System.out.println("");
        for (int i =0; i < n; i++){

            if(i == 0){
                
                User user = new User();
                user.setName("U");
                System.out.print(user.getName());
                group.add(user);
            } else{
                SimUser simUser = new SimUser();
                simUser.setName("Player " + i);
                System.out.print(" vs " + simUser.getName());
                group.add(simUser);
            }
        }
        return group;
    }
}