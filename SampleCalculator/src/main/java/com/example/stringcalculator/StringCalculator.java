package com.example.stringcalculator;

public class StringCalculator {

	public static int Add(String numbers) throws Exception {
		// TODO Auto-generated method stub

		if (numbers.isEmpty()) {
			return 0;
		} else {
			String[] input = numbers.split(",|\n");

			return calculateSum(input);
		}

	}

	private static int calculateSum(String[] input) throws Exception {
		// TODO Auto-generated method stub
		findNegativeValues(input);

		int sum = 0;
		for (String item : input) {

			if (stringToInt(item) > 1000) {
				continue;
			}
			sum += stringToInt(item);
		}
		return sum;
	}

	private static void findNegativeValues(String[] input) throws Exception {
		// TODO Auto-generated method stub
		for (String item : input) {
			if (stringToInt(item) < 0) {
				throw new Exception("Negative values are not allowed " + stringToInt(item));
			}
		}

	}

	private static int stringToInt(String item) {
		// TODO Auto-generated method stub
		return Integer.valueOf(item);
	}

}
