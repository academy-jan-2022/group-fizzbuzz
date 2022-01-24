import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/*
* Write a program that prints the numbers from 1 to 100. But for multiples of three print "Fizz"
* instead of the number and for the multiples of five print "Buzz". For numbers which are multiples
* of both three and five print "FizzBuzz".*/
public class FizzBuzzShould {
	@Test public void
	return_a_1_when_1_is_given() {
		var fizzBuzz = new FizzBuzz();
		var result = fizzBuzz.get(1);
		assertEquals("1", result);
	}

	@Test public void
	return_a_2_when_2_is_given() {
		var fizzBuzz = new FizzBuzz();
		var result = fizzBuzz.get(2);
		assertEquals("2", result);
	}

	@Test public void
	return_fizz_when_multiple_of_three() {
		var fizzBuzz = new FizzBuzz();
		var result = fizzBuzz.get(3);
		assertEquals("Fizz", result);
	}
}
