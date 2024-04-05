package com.example.monopoly_lc_ddm;

public class Player {

    private int id;

    private int gameId;
    private int balance;

    private boolean hasColorSet;

    private int hotelPrice = 100;

    private boolean isInJail;

    private int jailTurns = 3;

    private boolean hasRolledDoubles;


    public Player(int id, int gameId, int balance) {
        this.id = id;
        this.gameId = gameId;
        this.balance = balance;
    }

    public int getGameId() {
        return gameId;
    }

    public int getBalance() {
        return balance;
    }



    public int getId() {
        return id;
    }


    public int AddBalance(int amount){
        balance += amount;
        return balance;
    }
    public int DeductBalance(int amount){
        balance -= amount;
        return balance;
    }

    public int buyProperty(int amount){
        balance -= amount;
        return balance;
    }
    public int sellProperty(int amount){
        balance += amount;
        return balance;
    }
    public void updateBoardPosition(int position){

    }

    public boolean getHasColorSet (){
        return hasColorSet;
    }

    public boolean setHasColorSet(boolean hasColorSet){
        // If the player has a complete color set (Setting Up later in project) then return true, if not return false
        return hasColorSet;
    }

    public boolean getIsInJail(){
        return isInJail;
    }





    private int hasRolledDoubles(){

        return 0;
    }

    public boolean setIsInJail(boolean isInJail){
        // If the player is in jail, return true, if not return false
        if(isInJail){
            if(hasRolledDoubles() == 1){
                isInJail = false;
                return isInJail;
            }
            else{
                isInJail = true;
                return isInJail;
            }
        }
    }

}
