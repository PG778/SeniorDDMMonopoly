package com.example.monopoly_lc_ddm;

public class Player {

    private int id;

    private int gameId;
    private int balance;



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


}
