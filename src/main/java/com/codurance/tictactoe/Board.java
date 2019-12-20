package com.codurance.tictactoe;

public class Board {
   private String[][] positions = new String[3][3];

    public Board() {
        initializeBoard();
    }

    private void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                positions[i][j] = ".";
            }
        }
    }

    boolean placeToken(String token, int x, int y){
        if (isAFreePosition(x,y)){
            positions[x][y] = token;
            return true;
        }
        return false;
    }

    private boolean isAFreePosition(int x, int y) {
        return ".".equals(positions[x][y]);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        formatTable(builder);
        return builder.toString();
    }

    private void formatTable(StringBuilder builder) {
        for (int i = 2; i >= 0; i--) {
            for (int j = 0; j < 3; j++) {
                builder.append(positions[j][i] + " ");
            }
            builder.append("\n");
        }
    }
}
