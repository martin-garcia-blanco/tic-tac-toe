package com.codurance.tictactoe;

public class Game {

    private Board board;
    private Token currentPlayer;

    public Game(Board board) {
        this.board = board;
        this.currentPlayer = new TokenX();
    }

    public String play(int x, int y) {
        if (board.placeToken(getCurrentPlayersToken(), x, y))
            togglePlayer();
        return board.toString();
    }

    private String getCurrentPlayersToken() {
        return currentPlayer.getSymbol();
    }

    private void togglePlayer() {
        currentPlayer = currentPlayer.swapPlayer();
    }
}
