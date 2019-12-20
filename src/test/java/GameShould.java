import com.codurance.tictactoe.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameShould {

    private Game game;

    @BeforeEach
    void setUp() {
        game = new Game(new Board());
    }

    @Test
    void print_the_status_of_the_board_after_token_is_placed_in_1_1() {
        assertEquals(". . . \n" +
                     ". X . \n" +
                     ". . . \n", game.play(1,1));
    }

    @Test
    void print_the_status_of_the_board_after_token_is_placed_in_0_0() {
        assertEquals(". . . \n" +
                     ". . . \n" +
                     "X . . \n", game.play(0,0));
    }

    @Test
    void print_the_status_of_the_board_after_token_is_placed_in_0_2() {
        assertEquals("X . . \n" +
                     ". . . \n" +
                     ". . . \n", game.play(0,2));
    }

    @Test
    void toggle_players_in_between_turns() {
        game.play(1, 1);
        assertEquals(". O . \n" +
                ". X . \n" +
                ". . . \n", game.play(1,2));
    }

    @Test
    void a_player_cannot_place_in_a_position_where_there_is_already_a_token() {
        game.play(1, 1);
        assertEquals(". . . \n" +
                ". X . \n" +
                ". . . \n", game.play(1,1));
    }

}
