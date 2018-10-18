package tdd;

public class FizzBuzz {

	private static final String FIZZ_BUZZ = "FizzBuzz";
	private static final String BUZZ = "Buzz";
	private static final String FIZZ = "Fizz";

	public String say(int number) {
		return getFizzBuzz(number);
		/*
		 * if (number == 3 || number == 6) return "Fizz"; else return
		 * String.valueOf(number);
		 */

		// return "" + number;

		/*
		 * // 먼저 하드코딩 if( number == 2){ return "" + number; } return "" +
		 * number;
		 */ // 중복

	}

	private String getFizzBuzz(int number) {
		String result = null;
		if (number % 15 == 0)
			result =  FIZZ_BUZZ;
		if (number % 3 == 0)
			result =  FIZZ;
		if (number % 5 == 0)
			result = BUZZ;
		return result;
	}

}
