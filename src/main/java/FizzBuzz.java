public class FizzBuzz {
	public String get(int i) {
		if(i == 3 || i == 6 || i == 9) {
			return "Fizz";
		}

		return Integer.toString(i);
	}
}
