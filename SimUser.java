class SimUser extends Player{
    public void turnSim(){
      int bet = (int) (Math.random() * 3);
      placeBet(this.Money, bet);
    }
}