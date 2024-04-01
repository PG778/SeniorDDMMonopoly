package com.example.monopoly_lc_ddm;

import java.sql.*;

public class Database {

    private Connection conn;

    public Database(String url, String username, String password) throws SQLException {
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/MonopolyLC", "root", "password");
    }

    public void addGame(Game game) throws SQLException {
        String sql = "INSERT INTO Game (gameId,password) VALUES (?,?)";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, game.getId());
        stmt.setString(2, game.getPassword());
        stmt.executeUpdate();
    }

    public void addPlayer(Player player) throws SQLException {
        String sql = "INSERT INTO players (playerId, gameId,balance) VALUES (?, ?,?)";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, player.getId());
        stmt.setInt(2, player.getGameId());
        stmt.setInt(3, player.getBalance());
        stmt.executeUpdate();
    }

    public void restartGame(Game game) throws SQLException {
        String sql = "DELETE FROM Players WHERE game_id = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, game.getId());
        stmt.executeUpdate();
    }

    public ResultSet getAllGameData() throws SQLException {
        String sql = "SELECT * FROM games";
        Statement stmt = conn.createStatement();
        return stmt.executeQuery(sql);
    }
}