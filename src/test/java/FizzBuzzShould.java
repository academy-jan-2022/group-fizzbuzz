import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
* Write a program that prints the numbers from 1 to 100. But for multiples of three print "Fizz"
* instead of the number and for the multiples of five print "Buzz". For numbers which are multiples
* of both three and five print "FizzBuzz".*/
public class FizzBuzzShould {
	@Test public void
	return_fizz_when_3_is_given() {
		var fizzBuzz = new FizzBuzz();
		var result = fizzBuzz.get(3);
		assertEquals("Fizz", result);
	}

	@Test public void
	return_fizz_when_6_is_given() {
		var fizzBuzz = new FizzBuzz();
		var result = fizzBuzz.get(6);
		assertEquals("Fizz", result);
	}

	@Test public void
	return_fizz_when_9_is_given() {
		var fizzBuzz = new FizzBuzz();
		var result = fizzBuzz.get(9);
		assertEquals("Fizz", result);
	}

	@ParameterizedTest
	@MethodSource("x") public void
	return_input_as_a_string_if_not_a_multiple_of_3_or_5(int input, String expected)
	{
		var fizzBuzz = new FizzBuzz();
		var result = fizzBuzz.get(input);
		assertEquals(expected, result);
	}

	private static Stream<Arguments> x() {
		return Stream.of(
				Arguments.of(1, "1"),
				Arguments.of(2, "2"),
				Arguments.of(4, "4")
		);
	}
}
