

class User extends Player{
    boolean betPlaced;

    public void turnUser(){

        System.out.println("It's your turn");
        System.out.println("");
        System.out.println("Press 0 to check");
        System.out.println("Press 1 for smal bet");
        System.out.println("Press 2 for large bet");

        try{          
            while(!betPlaced){
                System.out.println("wij zijn hier");
                int bet = BlackJack.sc.nextInt();
                placeBet(this.Money, bet);
            
                betPlaced = true;
                
                break;
            };
            
            System.out.println(this.Money);
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }
}