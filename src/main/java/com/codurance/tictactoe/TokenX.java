package com.codurance.tictactoe;

public class TokenX implements Token {

    private String symbol = "X";

    @Override
    public Token swapPlayer() {
        return new TokenO();
    }

    public String getSymbol() {
        return symbol;
    }
}
