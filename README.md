# Tic Tac Toe

This is a simple game of tic tac toe, the rules are simple, given a grid of 3 by 3 spaces, players place their token in free spaces trying to make a staight line to win

### The Rules

- `X` always plays first
- Players can not place their token on a position that already has a token
- Players alternate placing tokens until either of this happens:
    - One player has three in a row (horizontally, vertically or diagonally)
    - All positions are filled
- A player that's able to draw three tokens in a row wins
- If all positions are filled an no player has three in a line that is consider a draw

### Winning conditions

1) ```
   X . . 
   X . .
   X . .
   ```
 
 2) ```
    X X X 
    . . .
    . . .
    ```
    
  3) ```
     X . . 
     . X .
     . . X
     ```
 (Please consider all variants of this)