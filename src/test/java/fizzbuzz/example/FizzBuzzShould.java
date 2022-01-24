package fizzbuzz.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
 * Write a program that prints the numbers from 1 to 100. But for multiples of three print "Fizz"
 * instead of the number and for the multiples of five print "Buzz". For numbers which are multiples
 * of both three and five print "fizzbuzz.example.FizzBuzz".*/
class FizzBuzzShould {

    private FizzBuzz fizzBuzz;

    @BeforeEach
    void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    void
    return_fizz_when_3_is_given() {
        var result = fizzBuzz.get(3);
        assertEquals("Fizz", result);
    }

    @Test
    void
    return_fizz_when_6_is_given() {
        var result = fizzBuzz.get(6);
        assertEquals("Fizz", result);
    }

    @Test
    void
    return_fizz_when_9_is_given() {
        var result = fizzBuzz.get(9);
        assertEquals("Fizz", result);
    }

    @ParameterizedTest
    @MethodSource("non_fizz_buzz_cases")
    void
    return_input_as_a_string_if_not_a_multiple_of_3_or_5(int input, String expected) {
        var result = fizzBuzz.get(input);
        assertEquals(expected, result);
    }

    @Test
    void
    return_buzz_when_5_given() {
        var result = fizzBuzz.get(5);
        assertEquals("Buzz", result);
    }

    private static Stream<Arguments> non_fizz_buzz_cases() {
        return Stream.of(
                Arguments.of(1, "1"),
                Arguments.of(2, "2"),
                Arguments.of(4, "4")
        );
    }
}
