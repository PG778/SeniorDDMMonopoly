package com.example.monopoly_lc_ddm;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.sql.ResultSet;
import java.sql.SQLException;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private Button starttest;

    @FXML
    private Button starttest1;

    @FXML
    private Button starttest11;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    protected void onStartTestButtonClick() throws SQLException {
        Game game = new Game(1, "password");


        Database db = new Database("jdbc:mysql://localhost:3306/MonopolyLC", "admin", "password");


        db.addGame(game);
    }

    @FXML
    protected void onStartTest1ButtonClick() throws SQLException {
        Player player = new Player(1, 1, 1000);
        Database db = new Database("jdbc:mysql://localhost:3306/MonopolyLC", "admin", "password");

        db.addPlayer(player);
    }

    @FXML
    protected void onStartTest11ButtonClick() throws SQLException {

        Database db = new Database("jdbc:mysql://localhost:3306/MonopolyLC", "admin", "password");
        ResultSet rs = db.getGameDataById(1);
        while(rs.next()){
            System.out.println(rs.getInt(1));
            System.out.println(rs.getString(2));
        }
    }



}