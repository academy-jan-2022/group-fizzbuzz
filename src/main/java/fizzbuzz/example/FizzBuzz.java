package fizzbuzz.example;

public class FizzBuzz {
	public String get(int i) {
		if(i % 3 == 0) {
			return "Fizz";
		}
		if(i % 5 == 0){
			return "Buzz";
		}

		return Integer.toString(i);
	}
}
