import com.codurance.tictactoe.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameShould {

    @Test
    void print_the_status_of_the_board_after_token_is_placed_in_1_1() {
        Game game = new Game(new Board());
        assertEquals(". . . \n" +
                     ". X . \n" +
                     ". . . \n", game.play(1,1));
    }

    @Test
    void print_the_status_of_the_board_after_token_is_placed_in_0_0() {
        Game game = new Game(new Board());
        assertEquals(". . . \n" +
                     ". . . \n" +
                     "X . . \n", game.play(0,0));
    }

    @Test
    void print_the_status_of_the_board_after_token_is_placed_in_0_2() {
        Game game = new Game(new Board());
        assertEquals("X . . \n" +
                     ". . . \n" +
                     ". . . \n", game.play(0,2));
    }

}
