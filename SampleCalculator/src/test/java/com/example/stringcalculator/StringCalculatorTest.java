package com.example.stringcalculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringCalculatorTest {

	// For empty string return 0
	@Test
	public void emptyStringReturn0() throws Exception {
		Assertions.assertEquals(StringCalculator.Add(""), 0);
	}

	// For single value in string
	@Test
	public void singleValueReturnItself() throws Exception {
		Assertions.assertEquals(StringCalculator.Add("10"), 10);
		Assertions.assertEquals(StringCalculator.Add("27"), 27);
	}

	// For two values in string seperated by commas
	@Test
	public void addTwoValuesSeperatedByComma() throws Exception {
		Assertions.assertEquals(StringCalculator.Add("1,2"), 3);
		Assertions.assertEquals(StringCalculator.Add("13,11"), 24);
	}

	// For three values in string seperated by commas
	@Test
	public void addThreeValuesSeperatedByComma() throws Exception {
		Assertions.assertEquals(StringCalculator.Add("1,2,3"), 6);
		Assertions.assertEquals(StringCalculator.Add("7,17,21"), 45);
	}

	// For values in string seperated by new line delimeter
	@Test
	public void addValuesSeperatedByNewLineDelimeter() throws Exception {
		Assertions.assertEquals(StringCalculator.Add("1\n2"), 3);
	}

	// For values in string seperated by new line delimeter or comma
	@Test
	public void addValuesSeperatedByNewLineDelimeterOrComma() throws Exception {
		Assertions.assertEquals(StringCalculator.Add("1,2\n3"), 6);
	}

	// For negative values in string throw exception
	@Test
	public void throwExceptionsforNegativeValues() {
		Assertions.assertThrows(Exception.class, () -> {
			StringCalculator.Add("-1");
		});
		Assertions.assertThrows(Exception.class, () -> {
			StringCalculator.Add("-1,-2\n3");
		});

	}

	// For ignoring values > 1000 in string
	@Test
	public void ignoreNumbersGreaterThan1000() throws Exception {
		Assertions.assertEquals(StringCalculator.Add("10,100\n1001"), 110);
		Assertions.assertEquals(StringCalculator.Add("1\n2,1001"), 3);
	}

}
