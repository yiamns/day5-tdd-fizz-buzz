package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    public void should_return_1_when_input_1() {
        int order = 1;

        String word = FizzBuzz.countOff(order);

        assertEquals("1", word);
    }

    @Test
    public void should_return_fizz_when_input_can_divided_by_3() {
        int order = 3;

        String word = FizzBuzz.countOff(order);

        assertEquals("fizz", word);
    }

    @Test
    public void should_return_buzz_when_input_can_divided_by_5() {
        int order = 5;

        String word = FizzBuzz.countOff(order);

        assertEquals("buzz", word);
    }
}
