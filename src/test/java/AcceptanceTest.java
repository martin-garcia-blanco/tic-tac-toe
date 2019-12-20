import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.BDDMockito;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Random;

import static org.hamcrest.core.Is.is;

@ExtendWith(MockitoExtension.class)
public class AcceptanceTest {

    // sample class
    static class Randomizer {
        Random random;
        int number = 0;

        Randomizer(Random random) {this.random = random;}

        void randomize() {number = random.nextInt();}
    }

    Randomizer randomizer;
    @Mock Random mockedRandom;

    @BeforeEach
    void setUp() {
        randomizer = new Randomizer(mockedRandom);
    }

    @Test
    void setup_with_BDDMockito_given() {
        BDDMockito.given(mockedRandom.nextInt()).willReturn(1);
        randomizer.randomize();
        MatcherAssert.assertThat(randomizer.number, is(1));
    }

    @Test
    void assert_with_Junit() {
        Assertions.assertEquals(0, randomizer.number);
    }

    @Test
    void assert_with_Hamcrest_assertThat() {
        MatcherAssert.assertThat(randomizer.number, is(0));
    }

    @Test
    void spy_with_BDDMockito_then() {
        randomizer.randomize();
        BDDMockito.then(mockedRandom).should().nextInt();
    }

    @Test
    void spy_with_Mockito_verify() {
        randomizer.randomize();
        Mockito.verify(mockedRandom).nextInt();
    }

}