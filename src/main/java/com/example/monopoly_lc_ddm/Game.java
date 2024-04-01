package com.example.monopoly_lc_ddm;

public class Game {

    private int id;
    private String password;

    public Game(int id, String password) {
        this.id = id;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public int getId() {
        return id;
    }
}
