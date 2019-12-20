package com.codurance.tictactoe;

public class Game {
    private Board board;
    private String currentPlayer;

    public Game(Board board) {
        this.board = board;
        currentPlayer = "X";
    }

    public String play(int x, int y) {
        board.placeToken(currentPlayer, x, y);
        return board.toString();
    }
}
