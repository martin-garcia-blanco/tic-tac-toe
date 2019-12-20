package com.codurance.tictactoe;

public class Game {
    private Board board;
    private String currentPlayer;

    public Game(Board board) {
        this.board = board;
        currentPlayer = "X";
    }

    public String play(int x, int y) {
        if (board.placeToken(currentPlayer, x, y))
            togglePlayer();
        return board.toString();
    }

    private void togglePlayer() {
        if ("X".equals(currentPlayer)){
            currentPlayer = "O";
        } else {
            currentPlayer = "X";
        }
    }
}
