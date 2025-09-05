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
    public void should_return_2_when_input_2() {
        int order = 13;

        String word = FizzBuzz.countOff(order);

        assertEquals("13", word);
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

    @Test
    public void should_return_fizzbuzz_when_input_can_divided_by_3_and_5() {
        int order = 150;

        String word = FizzBuzz.countOff(order);

        assertEquals("fizzbuzz", word);
    }

    @Test
    public void should_blank_when_input_Less_than_or_equal_to_0() {
        int order = -1;

        String word = FizzBuzz.countOff(order);

        assertEquals("", word);
    }
}
