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

    public static final String FIZZ = "Fizz";
    private FizzBuzz fizzBuzz;

    @BeforeEach
    void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    @ParameterizedTest
    @MethodSource("fizz_cases")
    void return_fizz_as_a_string_if_multiple_of_3(int input, String expected) {
        var result = fizzBuzz.get(input);
        assertEquals(expected, result);
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
    @Test
    void
    return_buzz_when_10_given() {
        var result = fizzBuzz.get(10);
        assertEquals("Buzz", result);
    }

    public static Stream<Arguments> fizz_cases() {
        return Stream.of(
                Arguments.of(3, FIZZ),
                Arguments.of(6, FIZZ),
                Arguments.of(9, FIZZ)
        );

    }

    private static Stream<Arguments> non_fizz_buzz_cases() {
        return Stream.of(
                Arguments.of(1, "1"),
                Arguments.of(2, "2"),
                Arguments.of(4, "4")
        );
    }
}
