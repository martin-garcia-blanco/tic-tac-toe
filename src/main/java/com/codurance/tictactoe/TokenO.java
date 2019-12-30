package com.codurance.tictactoe;

public class TokenO implements Token {

    private String symbol= "O";

    @Override
    public Token swapPlayer() {
        return new TokenX();
    }

    public String getSymbol() {
        return symbol;
    }
}
